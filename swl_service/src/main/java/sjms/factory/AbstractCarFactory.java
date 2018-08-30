package sjms.factory;

/**
 * Created by songweiliang on 2017/11/12.
 */
public interface AbstractCarFactory {
    IEngen createEngen();
    ITyre crateTyre();
}
