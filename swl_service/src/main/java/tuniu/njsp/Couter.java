package tuniu.njsp;

import java.util.Observable;

/**
 * Created by songweiliang on 2017/8/8.
 */
class Counter implements Runnable{
    private int count;

    public Counter() {
        count = 0;
    }

    public void countAdd() {
        synchronized(this) {
            for (int i = 0; i < 5; i ++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //非synchronized代码块，未对count进行读写操作，所以可以不用synchronized
    public synchronized  void printCount() {
        for (int i = 0; i < 5; i ++) {
            try {
                System.out.println(Thread.currentThread().getName() + " count:" + count);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void run() {
        String threadName = Thread.currentThread().getName();
        if (threadName.equals("A")) {
            countAdd();
        } else if (threadName.equals("B")) {
            printCount();
        }
    }

    public static void main(String[] args){
        Counter c1 = new Counter();
        Thread t1 = new Thread(c1,"A");
        Thread t2 = new Thread(c1,"B");
        t1.start();
        t2.start();
    }
}



class Test1 implements Runnable{
    private Object money;
    private Object goods;

    public Test1(Object money,Object goods){
        this.money = money;
        this.goods = goods;

    }

    public void test() throws InterruptedException {
        synchronized (money){
            System.out.println(Thread.currentThread().getName()+"get money");

            Thread.sleep(20000);

            synchronized (goods){
                System.out.println(Thread.currentThread().getName()+"get goods");

            }
        }
    }
    public void test1() throws InterruptedException {
        synchronized (goods){
            System.out.println(Thread.currentThread().getName()+"get goods");
            Thread.sleep(100);

            synchronized (money){
                System.out.println(Thread.currentThread().getName()+"get money");


            }
        }
    }


    public void run() {
        String name = Thread.currentThread().getName();
        if(name.equals("A")){
            try {
                test();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ;
        }else if(name.equals("B")){
            try {
                test1();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public  static void main(String[] arg){
        Object money = new Object();
        Object goods = new Object();
        Test1 t1 = new Test1(money,goods);
        Thread th1 = new Thread(t1,"A");
        Thread th2 = new Thread(t1,"B");
        th1.start();
        th2.start();
    }
}