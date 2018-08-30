package sjms.factory;

/**
 * Created by songweiliang on 2017/11/12.
 */
public class LowCarFactory implements AbstractCarFactory {
    public IEngen createEngen() {
        return new LowEngen();
    }

    public ITyre crateTyre() {
        return new LowTyre();
    }
}
