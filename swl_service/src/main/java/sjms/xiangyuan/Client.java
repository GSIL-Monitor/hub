package sjms.xiangyuan;


/**
 * Created by songweiliang on 2017/11/25.
 */
public class Client {
    public static void main(String[] args){
        IChess chess = ChessFactory.createChess("黑色");
        chess.display(new Feigongxiang(1,2));
        chess.display(new Feigongxiang(2,4));
    }
}
