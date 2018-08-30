package tuniu.njsp;

import java.io.*;

/**
 * Created by songweiliang on 2017/9/20.
 */
public class IoDemo01{
    public static  void main(String[] arg){
        try {
            read();
            write();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read() throws IOException {
        String src = "D:\\PGA_CODE\\test\\01.txt";
        File file = new File(src);
        InputStream in = new FileInputStream(file);
        int len = 0;
        byte[] buffer = new byte[100];
        while(-1 != (len = in.read(buffer))){
            String s = new String(buffer,0,len);
            System.out.println(s);
        }
        in.close();
    }
    public static  void write() throws FileNotFoundException {
        String dist = "D:\\PGA_CODE\\test\\01.txt";
        File file = new File(dist);
        OutputStream out = new FileOutputStream(file,true);
        String outStr = "i am a student\r\n";
        try {
            out.write(outStr.getBytes());
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
