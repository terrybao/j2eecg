<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Jeecg-Redis 功能测试</title>
    <style type="text/css">
        body {
            font-family: "Microsoft YaHei", Arial, sans-serif;
            margin: 0;
            padding: 20px;
            background-color: #f5f5f5;
        }
        .container {
            max-width: 900px;
            margin: 0 auto;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0,0,0,0.1);
            padding: 30px;
        }
        h1 {
            color: #333;
            text-align: center;
            margin-bottom: 30px;
            border-bottom: 2px solid #4CAF50;
            padding-bottom: 15px;
        }
        .function-category {
            margin-bottom: 25px;
        }
        .category-title {
            font-size: 18px;
            font-weight: bold;
            color: #2c3e50;
            margin-bottom: 15px;
            padding-left: 10px;
            border-left: 4px solid #4CAF50;
        }
        .function-item {
            display: flex;
            align-items: center;
            padding: 12px 15px;
            margin-bottom: 8px;
            background-color: #f8f9fa;
            border-radius: 4px;
            transition: all 0.3s ease;
        }
        .function-item:hover {
            background-color: #e9ecef;
        }
        .status {
            width: 20px;
            height: 20px;
            border-radius: 50%;
            margin-right: 15px;
        }
        .status.supported {
            background-color: #4CAF50;
            box-shadow: 0 0 8px rgba(76, 175, 80, 0.5);
        }
        .status.not-supported {
            background-color: #f44336;
            box-shadow: 0 0 8px rgba(244, 67, 54, 0.5);
        }
        .status.partial {
            background-color: #ff9800;
            box-shadow: 0 0 8px rgba(255, 152, 0, 0.5);
        }
        .function-name {
            flex: 1;
            font-size: 14px;
            color: #333;
        }
        .function-desc {
            font-size: 12px;
            color: #666;
            font-style: italic;
        }
        .support-info {
            font-size: 12px;
            color: #4CAF50;
            font-weight: bold;
        }
        .not-support-info {
            font-size: 12px;
            color: #f44336;
        }
        .info-box {
            background-color: #e3f2fd;
            border-left: 4px solid #2196F3;
            padding: 15px;
            margin-bottom: 20px;
            border-radius: 0 4px 4px 0;
        }
        .info-box p {
            margin: 0;
            color: #1565c0;
            font-size: 14px;
        }
        .legend {
            display: flex;
            justify-content: center;
            margin-bottom: 25px;
            padding: 15px;
            background-color: #f5f5f5;
            border-radius: 4px;
        }
        .legend-item {
            display: flex;
            align-items: center;
            margin: 0 20px;
        }
        .legend-color {
            width: 16px;
            height: 16px;
            border-radius: 50%;
            margin-right: 8px;
        }
        .legend-text {
            font-size: 13px;
            color: #666;
        }
        .service-info {
            margin-top: 30px;
            padding-top: 20px;
            border-top: 1px dashed #ddd;
        }
        .service-title {
            font-size: 16px;
            font-weight: bold;
            color: #333;
            margin-bottom: 15px;
        }
        .service-table {
            width: 100%;
            border-collapse: collapse;
            font-size: 13px;
        }
        .service-table th, .service-table td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #eee;
        }
        .service-table th {
            background-color: #f8f9fa;
            font-weight: bold;
            color: #555;
        }
        .service-table tr:hover {
            background-color: #f8f9fa;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Jeecg-Redis 功能支持清单</h1>
        
        <div class="info-box">
            <p><strong>说明：</strong>本页面列出 jeecg-redis 模块支持的 Redis 功能。测试基于 Spring Data Redis + Jedis 实现。</p>
        </div>
        
        <div class="legend">
            <div class="legend-item">
                <div class="legend-color" style="background-color: #4CAF50;"></div>
                <span class="legend-text">完全支持</span>
            </div>
            <div class="legend-item">
                <div class="legend-color" style="background-color: #ff9800;"></div>
                <span class="legend-text">部分支持</span>
            </div>
            <div class="legend-item">
                <div class="legend-color" style="background-color: #f44336;"></div>
                <span class="legend-text">暂不支持</span>
            </div>
        </div>
        
        <div class="function-category">
            <div class="category-title">String 字符串操作</div>
            <div class="function-item">
                <div class="status supported"></div>
                <div>
                    <div class="function-name">SET / GET</div>
                    <div class="function-desc">设置和获取字符串值</div>
                </div>
                <div class="support-info">RedisService</div>
            </div>
            <div class="function-item">
                <div class="status supported"></div>
                <div>
                    <div class="function-name">SET with Expire</div>
                    <div class="function-desc">设置带过期时间的字符串（单位：天）</div>
                </div>
                <div class="support-info">RedisService</div>
            </div>
            <div class="function-item">
                <div class="status supported"></div>
                <div>
                    <div class="function-name">DELETE</div>
                    <div class="function-desc">删除指定键</div>
                </div>
                <div class="support-info">RedisService</div>
            </div>
            <div class="function-item">
                <div class="status supported"></div>
                <div>
                    <div class="function-name">INCR / DECR</div>
                    <div class="function-desc">原子递增/递减操作</div>
                </div>
                <div class="support-info">StringRedisTemplate</div>
            </div>
        </div>
        
        <div class="function-category">
            <div class="category-title">Hash 哈希操作</div>
            <div class="function-item">
                <div class="status supported"></div>
                <div>
                    <div class="function-name">HSET / HGET</div>
                    <div class="function-desc">设置和获取哈希字段值</div>
                </div>
                <div class="support-info">StringRedisTemplate</div>
            </div>
            <div class="function-item">
                <div class="status supported"></div>
                <div>
                    <div class="function-name">HMSET / HMGET</div>
                    <div class="function-desc">批量设置和获取哈希字段</div>
                </div>
                <div class="support-info">RedisService</div>
            </div>
            <div class="function-item">
                <div class="status supported"></div>
                <div>
                    <div class="function-name">HGETALL</div>
                    <div class="function-desc">获取哈希所有字段和值</div>
                </div>
                <div class="support-info">RedisService</div>
            </div>
        </div>
        
        <div class="function-category">
            <div class="category-title">List 列表操作</div>
            <div class="function-item">
                <div class="status supported"></div>
                <div>
                    <div class="function-name">LPUSH / RPUSH</div>
                    <div class="function-desc">从左/右侧插入元素</div>
                </div>
                <div class="support-info">StringRedisTemplate</div>
            </div>
            <div class="function-item">
                <div class="status supported"></div>
                <div>
                    <div class="function-name">LPOP / RPOP</div>
                    <div class="function-desc">从左/右侧弹出元素</div>
                </div>
                <div class="support-info">StringRedisTemplate</div>
            </div>
            <div class="function-item">
                <div class="status supported"></div>
                <div>
                    <div class="function-name">LRANGE</div>
                    <div class="function-desc">获取列表范围元素</div>
                </div>
                <div class="support-info">StringRedisTemplate</div>
            </div>
            <div class="function-item">
                <div class="status supported"></div>
                <div>
                    <div class="function-name">LLEN</div>
                    <div class="function-desc">获取列表长度</div>
                </div>
                <div class="support-info">StringRedisTemplate</div>
            </div>
        </div>
        
        <div class="function-category">
            <div class="category-title">Set 集合操作</div>
            <div class="function-item">
                <div class="status supported"></div>
                <div>
                    <div class="function-name">SADD / SMEMBERS</div>
                    <div class="function-desc">添加元素和获取所有成员</div>
                </div>
                <div class="support-info">StringRedisTemplate</div>
            </div>
            <div class="function-item">
                <div class="status supported"></div>
                <div>
                    <div class="function-name">SISMEMBER</div>
                    <div class="function-desc">判断元素是否在集合中</div>
                </div>
                <div class="support-info">StringRedisTemplate</div>
            </div>
            <div class="function-item">
                <div class="status supported"></div>
                <div>
                    <div class="function-name">SCARD</div>
                    <div class="function-desc">获取集合大小</div>
                </div>
                <div class="support-info">StringRedisTemplate</div>
            </div>
            <div class="function-item">
                <div class="status supported"></div>
                <div>
                    <div class="function-name">SINTER / SUNION / SDIFF</div>
                    <div class="function-desc">集合交集/并集/差集</div>
                </div>
                <div class="support-info">StringRedisTemplate</div>
            </div>
        </div>
        
        <div class="function-category">
            <div class="category-title">Sorted Set 有序集合</div>
            <div class="function-item">
                <div class="status supported"></div>
                <div>
                    <div class="function-name">ZADD / ZRANGE</div>
                    <div class="function-desc">添加元素和按分数范围查询</div>
                </div>
                <div class="support-info">StringRedisTemplate</div>
            </div>
            <div class="function-item">
                <div class="status supported"></div>
                <div>
                    <div class="function-name">ZCARD</div>
                    <div class="function-desc">获取有序集合大小</div>
                </div>
                <div class="support-info">StringRedisTemplate</div>
            </div>
            <div class="function-item">
                <div class="status supported"></div>
                <div>
                    <div class="function-name">ZSCORE</div>
                    <div class="function-desc">获取元素分数</div>
                </div>
                <div class="support-info">StringRedisTemplate</div>
            </div>
            <div class="function-item">
                <div class="status supported"></div>
                <div>
                    <div class="function-name">ZRANK / ZREVRANK</div>
                    <div class="function-desc">获取元素排名</div>
                </div>
                <div class="support-info">StringRedisTemplate</div>
            </div>
        </div>
        
        <div class="function-category">
            <div class="category-title">Key 键操作</div>
            <div class="function-item">
                <div class="status supported"></div>
                <div>
                    <div class="function-name">DEL</div>
                    <div class="function-desc">删除键</div>
                </div>
                <div class="support-info">RedisService</div>
            </div>
            <div class="function-item">
                <div class="status supported"></div>
                <div>
                    <div class="function-name">EXISTS</div>
                    <div class="function-desc">检查键是否存在</div>
                </div>
                <div class="support-info">StringRedisTemplate</div>
            </div>
            <div class="function-item">
                <div class="status supported"></div>
                <div>
                    <div class="function-name">EXPIRE</div>
                    <div class="function-desc">设置键过期时间</div>
                </div>
                <div class="support-info">StringRedisTemplate</div>
            </div>
            <div class="function-item">
                <div class="status supported"></div>
                <div>
                    <div class="function-name">TTL</div>
                    <div class="function-desc">获取键剩余过期时间</div>
                </div>
                <div class="support-info">StringRedisTemplate</div>
            </div>
            <div class="function-item">
                <div class="status supported"></div>
                <div>
                    <div class="function-name">KEYS</div>
                    <div class="function-desc">按模式查找键</div>
                </div>
                <div class="support-info">RedisTemplate</div>
            </div>
        </div>
        
        <div class="function-category">
            <div class="category-title">Pub/Sub 发布订阅</div>
            <div class="function-item">
                <div class="status partial"></div>
                <div>
                    <div class="function-name">PUBLISH</div>
                    <div class="function-desc">发布消息到频道</div>
                </div>
                <div class="support-info">StringRedisTemplate</div>
            </div>
            <div class="function-item">
                <div class="status not-supported"></div>
                <div>
                    <div class="function-name">SUBSCRIBE</div>
                    <div class="function-desc">订阅频道（消息监听器）</div>
                </div>
                <div class="not-support-info">需配置 MessageListener</div>
            </div>
        </div>
        
        <div class="function-category">
            <div class="category-title">事务与锁</div>
            <div class="function-item">
                <div class="status supported"></div>
                <div>
                    <div class="function-name">MULTI / EXEC</div>
                    <div class="function-desc">Redis 事务支持</div>
                </div>
                <div class="support-info">StringRedisTemplate</div>
            </div>
            <div class="function-item">
                <div class="status partial"></div>
                <div>
                    <div class="function-name">WATCH / UNWATCH</div>
                    <div class="function-desc">乐观锁</div>
                </div>
                <div class="support-info">StringRedisTemplate</div>
            </div>
        </div>
        
        <div class="function-category">
            <div class="category-title">缓存注解 AOP</div>
            <div class="function-item">
                <div class="status partial"></div>
                <div>
                    <div class="function-name">@Ehcache 缓存注解</div>
                    <div class="function-desc">基于注解的缓存切面</div>
                </div>
                <div class="not-support-info">需取消注释启用</div>
            </div>
        </div>
        
        <div class="service-info">
            <div class="service-title">核心服务类说明</div>
            <table class="service-table">
                <tr>
                    <th>服务类</th>
                    <th>功能描述</th>
                    <th>支持的数据类型</th>
                </tr>
                <tr>
                    <td>RedisService</td>
                    <td>封装常用 Redis 操作，提供简单 API</td>
                    <td>String, Hash</td>
                </tr>
                <tr>
                    <td>RedisCacheService</td>
                    <td>实现 CacheServiceI 接口，支持模板序列化</td>
                    <td>String（支持对象序列化）</td>
                </tr>
                <tr>
                    <td>StringRedisTemplate</td>
                    <td>Spring Data Redis 模板类</td>
                    <td>全部类型</td>
                </tr>
                <tr>
                    <td>RedisTokenManager</td>
                    <td>JWT Token 管理，基于 Redis 存储</td>
                    <td>String</td>
                </tr>
            </table>
        </div>
    </div>
</body>
</html>