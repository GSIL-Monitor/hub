package tuniu.njsp;

import org.codehaus.jackson.map.ser.impl.FailingSerializer;

/**
 * Created by songweiliang on 2017/8/9.
 */
public class Movie {
    private String pic;
    private boolean flag = false;
    public void play(String pic)  {
        if(flag == false){
            this.pic = pic;
            System.out.println(Thread.currentThread().getName() + " 正在播放-->" + pic);
            //生产完之后唤醒消费者，释放对象锁
            this.flag = true;
                notifyAll();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            notifyAll();
        }

    }

    public void watch()  {


        if(flag == true){
            System.out.println(Thread.currentThread().getName() + " 正在观看-->" + pic);
            flag = false;
            //消费完之后唤醒生产，释放对象锁
            notifyAll();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            notifyAll();
        }

    }
}


class Product implements Runnable{
    private Movie m;
    public Product(Movie m){
        this.m = m;
    }
    public   void run() {
        synchronized(m){
            for (int i = 0;i<20;i++){
                if(0 == i%2){
                    m.play("左青龙" + i);

                }else{
                    m.play("右白虎" + i);
                }
            }
        }

    }
}

class customer implements  Runnable{
    private Movie m;
    public customer(Movie m){
        this.m = m;
    }
    public synchronized void run() {
        synchronized(m){
            for (int i=0;i<20;i++){
                m.watch();
            }
        }

    }
}

class Test10{
    public static void main(String[] arg){
        Movie m = new Movie();
        Product p = new Product(m);
        customer c = new customer(m);
        new Thread(p).start();
        new Thread(c).start();

    }
}