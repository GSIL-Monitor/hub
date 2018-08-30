package sjms.decator;

/**
 * Created by songweiliang on 2017/11/25.
 */
public class AutoCar extends SuperCar {
    public AutoCar(ICar car) {
        super(car);
    }

    public void auto(){
        System.out.println("人工智能");
    }
    public void move(){
        super.move();
        auto();

    }
}
