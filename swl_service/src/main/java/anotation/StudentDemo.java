package anotation;

/**
 * Created by songweiliang on 2017/9/5.
 */
@StdAnnotation(value="db_student")
public class StudentDemo{
    @Deprecated
    @ParamAnnotation(type = "String",collum = "name",length = 20)
    private String name;
    @ParamAnnotation(type = "int",collum = "id",length = 20)
    private int id;
    @ParamAnnotation(type = "int",collum = "type",length = 20)
    private int type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public StudentDemo() {
    }

    public StudentDemo(String name, int id, int type) {
        this.name = name;
        this.id = id;
        this.type = type;
    }
}
