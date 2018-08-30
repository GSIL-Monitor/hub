package sjms.decator;

/**
 * Created by songweiliang on 2017/11/25.
 */
public class SuperCar implements ICar{
    private ICar car;
    public void move() {
        car.move();
    }

    public SuperCar(ICar car) {
        this.car = car;
    }
}
