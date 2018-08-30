package tuniu.bean;


import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * create by songweiliang on 2018/8/30
 */

public class FirstRestBean {
    @NotNull
    private Integer Id;
    @Size(min=2,max=10)
    private String name;
    @NotNull
    private String desc;
    @AssertFalse
    private Boolean flag;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }
}
