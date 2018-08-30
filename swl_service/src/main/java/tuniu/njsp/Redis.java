package tuniu.njsp;

/**
 * Created by songweiliang on 2017/8/9.
 */
import redis.clients.jedis.Jedis;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Redis {


        public static void main(String[] args) {
            //连接本地的 Redis 服务
            Jedis jedis = new Jedis("hx-auc-master.redis.tuniu-sit.org",26713);
            System.out.println("连接成功");
            //查看服务是否运行
            System.out.println("服务正在运行: "+jedis.ping());
//            jedis.set("name","swl");
//            System.out.println(jedis.get("name"));
//
//            jedis.lpush("new list","swl");
//            jedis.lpush("new list","swg");
//            jedis.lpush("new list","swh");

            //jedis.set("auc_shiro_redis_cache","");

            Set<String> keys = jedis.keys("*");
            Iterator<String> it=keys.iterator() ;
            while(it.hasNext()){
                String key = it.next();

                System.out.println(key);
            }
        }


}
