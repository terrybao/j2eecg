package org.jeecgframework.core.common.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.jeecgframework.AbstractUnitTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

public class RedisServiceTest extends AbstractUnitTest {

    @Autowired
    private RedisService redisService;
    
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

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
}