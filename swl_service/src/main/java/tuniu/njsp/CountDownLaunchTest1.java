package tuniu.njsp;

import java.awt.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by songweiliang on 2017/10/5.
 */
public class CountDownLaunchTest1 implements Runnable {
    private final AtomicInteger number = new AtomicInteger();
    volatile boolean bol = false;
    public void run() {
        System.out.println(number.getAndIncrement());
        synchronized (this){
            try{
                if(!bol){
                    System.out.println(bol);
                    bol = true;
                    Thread.sleep(10000);
                }
            }catch (Exception e){

            }
        }
        System.out.println("并发数量为："+number.intValue());
    }
    public  static  void main(String[] args){
        ExecutorService pool = Executors.newFixedThreadPool(1000);
        CountDownLaunchTest1 test1 = new CountDownLaunchTest1();
        for(int i=0;i<1000;i++){
            pool.execute(test1);
        }
        //pool.shutdownNow();

    }
}
