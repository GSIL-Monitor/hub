package tuniu.njsp;

import com.mchange.v2.net.LocalHostManager;

import java.io.IOException;
import java.net.*;

/**
 * Created by songweiliang on 2017/8/23.
 */
public class ClientSocket {
    public static void main(String[] arg) throws IOException {
        DatagramSocket client = new DatagramSocket(10000);
        String data = "我是客户端";
        byte[] bytes = data.getBytes();
        InetAddress addr = InetAddress.getByName("localhost");
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length,addr,9999);
        client.send(packet);
        client.close();
    }
}
