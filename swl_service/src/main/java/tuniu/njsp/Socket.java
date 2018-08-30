package tuniu.njsp;


import java.io.IOException;
import java.io.InputStream;
import java.net.*;

/**
 * Created by songweiliang on 2017/8/23.
 */
public class Socket {
    public static void main(String[] args) throws IOException {
//        InetAddress addr = Inet4Address.getByName("www.baidu.com");
//        System.out.println(addr.getHostAddress());
//        System.out.println(addr.getHostName());
//
//
//        InetSocketAddress sAddr = new InetSocketAddress("localhost",8888);
//        System.out.println(sAddr.getHostName());
//        System.out.println(sAddr.getPort());
//        InetAddress addrn = sAddr.getAddress();
//        System.out.println(addrn.getHostAddress());
//
//
//        URL url = new URL("http://edu.51cto.com/center/course/lesson/index?id=124527");
//        System.out.println("主机："+url.getHost());
//        System.out.println("端口："+url.getPort());
//        System.out.println("协议："+url.getProtocol());
//        System.out.println("参数："+url.getQuery());
//        System.out.println(url.getFile());
//        System.out.println("相对路径"+url.getPath());
//        System.out.println(url.getContent());
//
//
//        InputStream in = url.openStream();
//        byte[] flush = new byte[1024];
//        int len = 0;
//        while (-1 !=(len=in.read(flush))){
//            System.out.println(new String(flush,0,len));
//        }

        //创建服务器加端口
        DatagramSocket server = new DatagramSocket(9999);
        //准备容器
        byte[] container = new byte[1024];
        //封装成包DatagramPacket
        DatagramPacket packet = new DatagramPacket(container,container.length);
        //接受数据(线程阻塞)
        server.receive(packet);
        //分解数据
        byte[] data = packet.getData();
        int len = packet.getLength();
        System.out.println(new String(data,0,len));

    }
}
