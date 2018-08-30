package tuniu.njsp;

import javax.naming.ldap.SortKey;
import java.io.*;
import java.net.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by songweiliang on 2017/8/24.
 */
public class TcpSocket {
    private static List<Handle> sendContanner = new ArrayList<Handle>();
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8085);
        Integer num = 1;
        while(true){
            //接收请求，阻塞线程
            Socket socket = serverSocket.accept();
            //多线程处理连接
            Handle send = new TcpSocket.Handle(socket,num++);
            sendContanner.add(send);
            Thread t = new Thread(send);
            t.start();
            new Thread(new TcpSocket.ServerReceive(socket)).start();
        }
    }


    static  class Handle implements Runnable{
        private Socket socket;
        private Integer num;
        public Handle(Socket s,Integer num){
            this.socket = s;
            this.num = num;
        }
        public void run() {
            String outStr = "";
            synchronized (num){
                System.out.println("接收一个连接"+num);
                outStr = "你好客户端"+num++;
            }
            //BufferedOutputStream out = new BufferedOutputStream(new OutputStream(socket.getOutputStream()));
            write(outStr);
            sendOthers();
        }

        private void sendOthers(){
            for (Handle h:sendContanner){
                if(h == this){
                    continue;
                }
                h.write("欢迎"+(this.num-1)+"进入聊天室");
            }
        }
        private void write(String outStr){
            BufferedWriter out = null;
            try {
                out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                out.write(outStr);
                out.newLine();
                out.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static  class ServerReceive implements Runnable{
        private BufferedReader bufferedReader;
        private Socket socket;
        private boolean isRunning = true;
        public ServerReceive(Socket socket){
            try {
                this.socket = socket;
                bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();
                isRunning = false;
            }
        }
        private String receive(){
            String msg = "gg";
            try {
                msg = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                isRunning =false;
            }
            return msg;
        }
        public void run() {
            while(isRunning){
                String msg = receive();
                for (Handle h:sendContanner){
                    if(h.socket == this.socket){
                        continue;
                    }
                    h.write(Thread.currentThread().getName()+"对大家说"+msg);
                }
            }
        }
    }
}



