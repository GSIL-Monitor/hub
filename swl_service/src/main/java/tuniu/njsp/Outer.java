package tuniu.njsp;

import java.lang.reflect.Array;

/**
 * Created by songweiliang on 2017/7/6.
 */
public class Outer {
    private String name;
    class Inner{
        private String name;
        public void voice(){

            System.out.println("我是innner");
        }
    }
    static class Inner1{
        void voice(){
            System.out.println("我是静态的 inner1");
        }
    }
}

class Test{
    public static void main(String[] args){
        Outer outer = new Outer();
        Outer.Inner inner =outer.new Inner();
        inner.voice();
        Outer.Inner1 inner1 = new Outer.Inner1();
        inner1.voice();
    }
}

abstract class IIII{
    public abstract  void pa();
}
interface II{
    public static final String name = "";
     public abstract void run();

}
interface III{
    public  void voice();
}

class test extends IIII implements II,III{
    public void run(){}
    public void voice(){}
    public void pa(){}

    public static void main(){
        III i = new test();
        i.voice();
    }
}
