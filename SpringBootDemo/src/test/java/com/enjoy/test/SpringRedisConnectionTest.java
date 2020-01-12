package com.enjoy.test;

import com.enjoy.App;
import org.junit.Test;
import org.junit.internal.Classes;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Description SpringBoot继承reids测试
 * @Date 2020/1/6 15:00
 * @Authod ZG
 * @Version 1.0
 */

@SpringBootTest(classes = {App.class})
@RunWith(SpringRunner.class)
public class SpringRedisConnectionTest {
    @Resource
    private RedisTemplate<String,String> redisTemplate;

    @Test
    public void testRedis() throws Exception {
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        ops.set("name", "enjoy");
        String value = ops.get("name");
        System.out.println(value);
    }


}
