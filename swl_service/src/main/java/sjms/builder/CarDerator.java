package sjms.builder;

import sjms.factory.IEngen;
import sjms.factory.ITyre;

/**
 * Created by songweiliang on 2017/11/12.
 */
public class CarDerator implements ICarDerator {
    private IlingjianBuilder builder;
    public CarDerator(IlingjianBuilder builder){
        this.builder = builder;
    }
    public ICar deratorCar() {
        ITyre tyre = builder.buildTyre();
        IEngen engen = builder.buildEnjen();
        ICar car = new LowCar();
        car.setEngen(engen);
        car.setTyre(tyre);
        return car;
    }
}
