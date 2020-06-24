package com.offway.hqs.three;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;


public class JedisCore {
    private Jedis jedis;

    public JedisCore(String host, int port, String pass) {
        JedisPool pool = new JedisPool(host, port);
        jedis = pool.getResource();
        jedis.auth(pass);
    }

    //新增
    public void set(String key, String val, int seconds) {
        jedis.setex(key, seconds, val);
    }

    //删除
    public void del(String key) {
        jedis.del(key);
    }

    //查询
    public String get(String key) {
        return jedis.get(key);
    }

    //清除
    public boolean checkKey(String key) {
        return jedis.exists(key);
    }
//是否过期
    public void expire(String key, int seconds) {
        jedis.expire(key, seconds);
    }
}
