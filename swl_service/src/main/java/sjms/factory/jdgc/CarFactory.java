package sjms.factory.jdgc;



/**
 * Created by songweiliang on 2017/11/12.
 */
public class CarFactory {
    public ICar createCar(String carType){
        if(carType.equals("宝马")){
            return new Baoma();
        }else if(carType.equals("奥迪")){
            return new Audi();
        }
        return null;
    }
}
