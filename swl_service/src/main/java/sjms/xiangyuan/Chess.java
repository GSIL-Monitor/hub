package sjms.xiangyuan;

/**
 * Created by songweiliang on 2017/11/25.
 */
public class Chess implements IChess{
    private String color;
    public String getColor(){
        return this.color;
    }

    public void display(Feigongxiang f){
        System.out.print(f.getHeight()+"-"+f.getWidth());
    }

    public Chess(String color) {
        this.color = color;
    }
}
