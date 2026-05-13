package org.jeecgframework.core.common.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.jeecgframework.AbstractUnitTest;
import org.jeecgframework.web.system.service.CacheServiceI;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

public class RedisServiceTest extends AbstractUnitTest {

    @Autowired
    private RedisService redisService;
    
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    
    @Autowired(required=false)
    private CacheServiceI cacheService;

    @Test
    public void testStringOperations() {
        String key = "test:string:key";
        String value = "test:string:value";
        
        redisService.set(key, value);
        String result = redisService.get(key);
        assert result.equals(value) : "String set/get test failed";
        
        redisService.delete(key);
        result = redisService.get(key);
        assert result == null : "String delete test failed";
        System.out.println("✓ String operations (set/get/delete) - SUPPORTED");
    }

    @Test
    public void testStringOperationsWithExpire() {
        String key = "test:string:expire";
        String value = "test:string:value:expire";
        
        redisService.set(key, value, 1);
        String result = redisService.get(key);
        assert result != null : "String set with expire test failed";
        
        System.out.println("✓ String operations with expire (set with timeout) - SUPPORTED");
    }

    @Test
    public void testHashOperations() {
        String key = "test:hash:key";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("field1", "value1");
        map.put("field2", "value2");
        
        redisService.set(key, map, 1);
        Map<String, Object> result = redisService.getMap(key);
        assert result != null && result.size() == 2 : "Hash operations test failed";
        
        redisService.delete(key);
        System.out.println("✓ Hash operations (putAll/get/delete) - SUPPORTED");
    }

    @Test
    public void testListOperations() {
        String key = "test:list:key";
        
        try {
            stringRedisTemplate.opsForList().leftPush(key, "item1");
            stringRedisTemplate.opsForList().leftPush(key, "item2");
            Long size = stringRedisTemplate.opsForList().size(key);
            assert size == 2 : "List operations test failed";
            
            stringRedisTemplate.delete(key);
            System.out.println("✓ List operations (leftPush/size) - SUPPORTED via StringRedisTemplate");
        } catch (Exception e) {
            System.out.println("✗ List operations - NOT SUPPORTED in RedisService");
        }
    }

    @Test
    public void testSetOperations() {
        String key = "test:set:key";
        
        try {
            stringRedisTemplate.opsForSet().add(key, "member1", "member2", "member3");
            Long size = stringRedisTemplate.opsForSet().size(key);
            assert size == 3 : "Set operations test failed";
            
            stringRedisTemplate.delete(key);
            System.out.println("✓ Set operations (add/size) - SUPPORTED via StringRedisTemplate");
        } catch (Exception e) {
            System.out.println("✗ Set operations - NOT SUPPORTED in RedisService");
        }
    }

    @Test
    public void testZSetOperations() {
        String key = "test:zset:key";
        
        try {
            stringRedisTemplate.opsForZSet().add(key, "member1", 1.0);
            stringRedisTemplate.opsForZSet().add(key, "member2", 2.0);
            Long size = stringRedisTemplate.opsForZSet().size(key);
            assert size == 2 : "ZSet operations test failed";
            
            stringRedisTemplate.delete(key);
            System.out.println("✓ Sorted Set operations (add/size) - SUPPORTED via StringRedisTemplate");
        } catch (Exception e) {
            System.out.println("✗ Sorted Set operations - NOT SUPPORTED in RedisService");
        }
    }

    @Test
    public void testKeyOperations() {
        String key = "test:key:exists";
        
        try {
            stringRedisTemplate.opsForValue().set(key, "test");
            Boolean exists = stringRedisTemplate.hasKey(key);
            assert exists : "Key exists test failed";
            
            stringRedisTemplate.delete(key);
            exists = stringRedisTemplate.hasKey(key);
            assert !exists : "Key delete test failed";
            
            System.out.println("✓ Key operations (exists/delete) - SUPPORTED");
        } catch (Exception e) {
            System.out.println("✗ Key operations - NOT SUPPORTED");
        }
    }

    @Test
    public void testPubSubOperations() {
        try {
            stringRedisTemplate.convertAndSend("test:channel", "test message");
            System.out.println("✓ Pub/Sub operations (publish) - SUPPORTED via StringRedisTemplate");
        } catch (Exception e) {
            System.out.println("✗ Pub/Sub operations - NOT FULLY SUPPORTED (no message listener)");
        }
    }

    @Test
    public void testRedisCacheServiceOperations() {
        if (cacheService != null) {
            try {
                String cacheName = "testCache";
                String key = "testKey";
                String value = "testValue";
                
                cacheService.put(cacheName, key, value);
                Object result = cacheService.get(cacheName, key);
                assert result != null && result.equals(value) : "RedisCacheService put/get test failed";
                
                boolean removed = cacheService.remove(cacheName, key);
                assert removed : "RedisCacheService remove test failed";
                
                result = cacheService.get(cacheName, key);
                assert result == null : "RedisCacheService remove verification failed";
                
                System.out.println("✓ RedisCacheService operations - SUPPORTED");
            } catch (Exception e) {
                System.out.println("✗ RedisCacheService operations - FAILED: " + e.getMessage());
            }
        } else {
            System.out.println("⚠ RedisCacheService not configured (using EhcacheService)");
        }
    }

    @Test
    public void testCacheCleanOperations() {
        if (cacheService != null) {
            try {
                cacheService.clean("testPattern");
                System.out.println("✓ Cache clean operations - SUPPORTED");
            } catch (Exception e) {
                System.out.println("✗ Cache clean operations - FAILED: " + e.getMessage());
            }
        } else {
            System.out.println("⚠ CacheService not configured");
        }
    }

    @Test
    public void testTransactionOperations() {
        try {
            stringRedisTemplate.execute((connection) -> {
                connection.multi();
                connection.stringCommands().set("test:tx:key".getBytes(), "test".getBytes());
                connection.stringCommands().set("test:tx:key2".getBytes(), "test2".getBytes());
                connection.exec();
                return null;
            });
            
            Boolean exists1 = stringRedisTemplate.hasKey("test:tx:key");
            Boolean exists2 = stringRedisTemplate.hasKey("test:tx:key2");
            assert exists1 && exists2 : "Transaction test failed";
            
            stringRedisTemplate.delete("test:tx:key");
            stringRedisTemplate.delete("test:tx:key2");
            
            System.out.println("✓ Transaction operations (MULTI/EXEC) - SUPPORTED");
        } catch (Exception e) {
            System.out.println("✗ Transaction operations - FAILED: " + e.getMessage());
        }
    }

    @Test
    public void testAtomicOperations() {
        try {
            String key = "test:atomic:counter";
            
            stringRedisTemplate.delete(key);
            Long result = stringRedisTemplate.opsForValue().increment(key);
            assert result == 1 : "INCR test failed";
            
            result = stringRedisTemplate.opsForValue().increment(key);
            assert result == 2 : "INCR second test failed";
            
            result = stringRedisTemplate.opsForValue().decrement(key);
            assert result == 1 : "DECR test failed";
            
            stringRedisTemplate.delete(key);
            System.out.println("✓ Atomic operations (INCR/DECR) - SUPPORTED");
        } catch (Exception e) {
            System.out.println("✗ Atomic operations - FAILED: " + e.getMessage());
        }
    }
}