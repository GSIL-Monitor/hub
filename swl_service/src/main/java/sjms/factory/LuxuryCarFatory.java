package sjms.factory;

/**
 * Created by songweiliang on 2017/11/12.
 */
public class LuxuryCarFatory implements AbstractCarFactory {
    public IEngen createEngen() {
        return new LuxuryEngene();
    }

    public ITyre crateTyre() {
        return new LuxuryTyre();
    }
}
