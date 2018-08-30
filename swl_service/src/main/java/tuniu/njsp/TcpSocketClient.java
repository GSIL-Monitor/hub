package tuniu.njsp;

import javax.naming.ldap.SortKey;
import java.io.*;
import java.net.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by songweiliang on 2017/8/24.
 */
public class TcpSocketClient {
    public static void main(String[] arg) throws IOException {
        //连接服务端
        Socket socket = new Socket("localhost",9090);
        System.out.println("已经建立连接");
        //启动接受发送线程
        new Thread(new ClientSend(socket)).start();
        new Thread(new ClientReceive(socket)).start();

    }
}

class ClientSend implements Runnable{
    private BufferedWriter bufferedWriter;
    private boolean isRunning = true;

    public ClientSend(Socket socket){
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (IOException e) {
            //e.printStackTrace();
            isRunning = false;
        }
    }
    private String getFromConsole(){
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    private void send(String msg) throws IOException {
        bufferedWriter.write(msg);
        bufferedWriter.newLine();
        bufferedWriter.flush();
    }
    public void run() {
        while(isRunning){
            try {
                send(getFromConsole());
            } catch (IOException e) {
                //e.printStackTrace();
                isRunning =false;
            }
        }
    }
}

class ClientReceive implements Runnable{
    private BufferedReader bufferedReader;
    private boolean isRunning = true;
    public ClientReceive(Socket socket){
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
            isRunning = false;
            try {
                bufferedReader.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
    private String receive(){
        String msg = "";
        try {
            msg = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            isRunning = false;
        }
        return msg;
    }
    public void run()
    {
        while(isRunning){
            String msg = receive();
            System.out.println(msg);
        }
    }
}

