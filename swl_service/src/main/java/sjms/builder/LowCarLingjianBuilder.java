package sjms.builder;

import sjms.factory.IEngen;
import sjms.factory.ITyre;
import sjms.factory.LowEngen;
import sjms.factory.LowTyre;

/**
 * Created by songweiliang on 2017/11/12.
 */
public class LowCarLingjianBuilder implements IlingjianBuilder {
    public IEngen buildEnjen() {
        return new LowEngen();
    }

    public ITyre buildTyre() {
        return new LowTyre();
    }
}
