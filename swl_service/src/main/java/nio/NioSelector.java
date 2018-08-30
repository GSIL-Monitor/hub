package nio;

import tuniu.njsp.Socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by songweiliang on 2017/8/31.
 */
public class NioSelector {
    private static final int BUF_SIZE = 256;
    private static final int TINEOUT = 3000;
    public static  void main(String[] args) throws IOException {
        //打开服务
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        //打开selector
        Selector selector = Selector.open();
        //绑定端口并设置为非阻塞模式
        serverSocketChannel.socket().bind(new InetSocketAddress(9090));
        serverSocketChannel.configureBlocking(false);
        //先将op_accept事件注册到selector中
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while(true){
            //通过select 方法，阻塞地等待连connect 的channel
            if(selector.select(TINEOUT) == 0){
                System.out.println(".");
                continue;
            }
            //拿到所有绑定并准备好了的key
            Iterator<SelectionKey> keyIterator = selector.selectedKeys().iterator();
            List<SocketChannel> channelList = new ArrayList<SocketChannel>();
            while(keyIterator.hasNext()){
                SelectionKey key = keyIterator.next();
                //获取一个key之后就将他删除
                if(key.isAcceptable()){
                    //accept事件中从key中获得的channel是serversocketchannle 从read write事件 从key中获得的channle是socketchannle
//                    //再将clientchannle的read事件注册到selector
//
                    ServerSocketChannel channel = (ServerSocketChannel)key.channel();
                    SocketChannel clienChannel = channel.accept();
                    clienChannel.configureBlocking(false);

//                  clienChannel.register(selector,SelectionKey.OP_READ);
                    channelList.add(clienChannel);
                }
                keyIterator.remove();
            }

            for (SocketChannel socketChannel:channelList){
                socketChannel.register(selector, SelectionKey.OP_READ|SelectionKey.OP_WRITE);
            }

            Iterator<SelectionKey> keyIterator1 = selector.selectedKeys().iterator();
            while (keyIterator1.hasNext()){
                SelectionKey key = keyIterator1.next();
                if(key.isReadable() || key.isWritable()){
                    System.out.println("读写");
                }
            }

        }

    }
}
