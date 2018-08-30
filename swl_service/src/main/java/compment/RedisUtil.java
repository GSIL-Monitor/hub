package compment;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

/**
 * Created by songweiliang on 2017/8/11.
 */

public class RedisUtil {
    @Resource
    private RedisTemplate redisTemplate;

    public   void setByKey(String key,Object value){
        ValueOperations<String, Object> opsForValue = redisTemplate.opsForValue();
        opsForValue.set(key, value);
    }
    public  String getByKey(String key){
        ValueOperations<String,String> opsForValue = redisTemplate.opsForValue();
        String user2 =  opsForValue.get(key);
        return user2;
    }
}
