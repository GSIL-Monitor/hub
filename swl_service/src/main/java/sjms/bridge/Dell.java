package sjms.bridge;

/**
 * Created by songweiliang on 2017/11/25.
 */
public class Dell implements IBrand {
    private String brandName;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void sale() {
        System.out.println("dell 电脑你好");
    }
}
