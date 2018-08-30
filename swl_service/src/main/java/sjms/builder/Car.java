package sjms.builder;

import sjms.factory.IEngen;
import sjms.factory.ITyre;

/**
 * Created by songweiliang on 2017/11/12.
 */
abstract class ICar {
    private IEngen engen;
    private ITyre tyre;
    abstract void run();
    public IEngen getEngen() {
        return engen;
    }

    public void setEngen(IEngen engen) {
        this.engen = engen;
    }

    public ITyre getTyre() {
        return tyre;
    }

    public void setTyre(ITyre tyre) {
        this.tyre = tyre;
    }
}
