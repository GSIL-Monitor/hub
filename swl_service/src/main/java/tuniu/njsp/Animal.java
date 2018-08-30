package tuniu.njsp;

/**
 * Created by songweiliang on 2017/7/5.
 */
public abstract class Animal {
    public String name ;
    public Integer Id;
    public abstract void run();
    public  void voice(){
        run();
        System.out.println("voice");
    }
    public Animal(){

    }
    public static void main(String[] s){
        Animal a = new Tuzi();
        a.voice();
    }
}

class Tuzi extends Animal{
    @Override
    public void run() {
        System.out.println("run");
    }

}