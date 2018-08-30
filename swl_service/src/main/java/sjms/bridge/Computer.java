package sjms.bridge;

/**
 * Created by songweiliang on 2017/11/25.
 */
public class Computer implements IComputer{
    protected IBrand brand;

    public Computer(IBrand brand) {
        this.brand = brand;
    }

    public void run() {
        System.out.println(brand+" is running");
    }
}
