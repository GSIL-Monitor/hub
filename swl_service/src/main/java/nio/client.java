package nio;

import io.netty.buffer.ByteBuf;
import tuniu.njsp.Socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * Created by songweiliang on 2017/8/30.
 */
public class client {
    public static void main(String[] args) throws IOException {
        SocketChannel client = SocketChannel.open();
        client.connect(new InetSocketAddress("localhost",9090));
//        ByteBuffer buf = ByteBuffer.allocate(1024);
//        int byteRead = client.read(buf);
//        System.out.println(new String(buf.toString()));
        String msg = "我是你的第一个连接";
        ByteBuffer write = ByteBuffer.allocate(1024);
        write.clear();
        write.put(msg.getBytes());
        write.flip();
        while (write.hasRemaining()){
            client.write(write);
        }
    }
}
