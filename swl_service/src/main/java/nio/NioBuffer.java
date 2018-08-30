package nio;

import java.nio.IntBuffer;

/**
 * Created by songweiliang on 2017/8/31.
 */
public class NioBuffer {
    public static  void main(String[] args){
        IntBuffer intBuffer = IntBuffer.allocate(2);
        intBuffer.put(111);
        intBuffer.put(2222);
        intBuffer.flip();
        System.out.println(intBuffer.get());
        System.out.println(intBuffer.get());
    }
}
