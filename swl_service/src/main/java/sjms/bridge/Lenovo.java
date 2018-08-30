package sjms.bridge;

/**
 * Created by songweiliang on 2017/11/25.
 */
public class Lenovo implements IBrand {
    private String brandName;
    public void sale() {
        System.out.println("lenovo 电脑你好");
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
