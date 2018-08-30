package sjms.builder;

import sjms.factory.IEngen;

/**
 * Created by songweiliang on 2017/11/12.
 */
public class LowCar extends ICar{

    @Override
    void run() {
        System.out.print("我是低端车");
    }
}
