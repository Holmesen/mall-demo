package com.holmesen.malldemo.service.impl;

import com.holmesen.malldemo.service.RedisService;
import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * redis操作service的实现类
 * @Author: Holmesen
 * @Date: 2021/9/23 11:41
 */
@Service
public class RedisServiceImpl implements RedisService {
  @Autowired
  private StringRedisTemplate stringRedisTemplate;

  @Override
  public void set(String key, String value) {
    stringRedisTemplate.opsForValue().set(key, value);
  }

  @Override
  public String get(String key) {
    return stringRedisTemplate.opsForValue().get(key);
  }

  @Override
  public boolean expire(String key, long expire) {
    return Boolean.TRUE.equals(stringRedisTemplate.expire(key, expire, TimeUnit.SECONDS));
  }

  @Override
  public void remove(String key) {
    stringRedisTemplate.delete(key);
  }

  @Override
  public Long increment(String key, long delta) {
    return stringRedisTemplate.opsForValue().increment(key, delta);
  }
}
