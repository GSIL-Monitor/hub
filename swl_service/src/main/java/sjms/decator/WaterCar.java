package sjms.decator;

/**
 * Created by songweiliang on 2017/11/25.
 */
public class WaterCar extends SuperCar {
    public WaterCar(ICar car) {
        super(car);
    }

    public void water(){
        System.out.println("车在水里游");
    }
    public void move(){
        super.move();
        water();
    }
}
