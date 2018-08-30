package sjms.builder;

/**
 * Created by songweiliang on 2017/11/12.
 */
public class Client {
    public static void main(String[] arg){
        ICarDerator derator = new CarDerator(new LowCarLingjianBuilder());
        ICar car = derator.deratorCar();
        car.run();
    }
}
