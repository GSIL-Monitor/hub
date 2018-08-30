package nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * Created by songweiliang on 2017/8/30.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel server = ServerSocketChannel.open();
        server.socket().bind(new InetSocketAddress(9090));
//        server.configureBlocking(false);
        while (true) {
            SocketChannel socketChannel = server.accept();
            ByteBuffer buf = ByteBuffer.allocate(1024);
            if (socketChannel != null && socketChannel.isConnected()) {
                int i = socketChannel.read(buf);
                while(i != -1){
                    System.out.println(new String(buf.array()));
                }
            } else {
                System.out.println("暂未连接客户端");
            }
        }


    }
}

