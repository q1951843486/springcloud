package com.example.config.config;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.data.redis.core.RedisTemplate;
import sun.security.provider.MD5;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @ClassName PreventReplayUtil
 * @Author Administrator
 * @date 2020.01.16 09:53
 */
public class PreventReplayUtil {


    public static final long TIME_OUT = 60000;


    //String Md5Str = DigestUtils.md5Hex(String.valueOf(timeTamp+random));
    public static boolean get(String md5Str,long timeTamp){



        if (timeTamp>System.currentTimeMillis()+TIME_OUT&&timeTamp<System.currentTimeMillis()-TIME_OUT){

            return  false;

        }
        RedisTemplate redisTemplate = new RedisTemplate();
        Object o = redisTemplate.opsForValue().get(md5Str);

        if (ObjectUtils.allNotNull(o)){

            return false;
        }

        redisTemplate.opsForValue().set(md5Str,60,60, TimeUnit.SECONDS);

        return true;


    }


}
