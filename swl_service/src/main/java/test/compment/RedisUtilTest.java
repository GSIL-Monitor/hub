package test.compment; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import javax.annotation.Resource;

/** 
* RedisUtil Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 11, 2017</pre> 
* @version 1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:*.xml" })
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class,TransactionalTestExecutionListener.class })
public class RedisUtilTest {
    @Resource
    private RedisTemplate redisTemplate;

/** 
* 
* Method: setByKey(String key, Object value) 
* 
*/ 

public void testSetByKey(String key,String value) throws Exception {
    ValueOperations<String, Object> opsForValue = redisTemplate.opsForValue();
    opsForValue.set(key, value);
} 

/** 
* 
* Method: getByKey(String key) 
* 
*/ 

public String testGetByKey(String key) throws Exception {
    ValueOperations<String,String> opsForValue = redisTemplate.opsForValue();
    String user2 =  opsForValue.get(key);
    return user2;
}

    @Test
    public void all() throws Exception {
        testSetByKey("songweiliang","master");
        System.out.println(testGetByKey("songweiliang"));
    }
} 
