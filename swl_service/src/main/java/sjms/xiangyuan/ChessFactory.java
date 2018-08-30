package sjms.xiangyuan;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by songweiliang on 2017/11/25.
 */
public class ChessFactory {
    private static Map<String,IChess> map = new HashMap<String, IChess>();
    public static IChess createChess(String color){
        if(map.get(color) != null){
            return map.get(color);
        }else{
            IChess chess = new Chess(color);
            map.put(color,chess);
            return chess;
        }
    }
}
