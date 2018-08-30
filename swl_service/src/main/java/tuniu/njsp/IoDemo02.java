package tuniu.njsp;

import java.io.*;
import java.lang.reflect.Field;

/**
 * Created by songweiliang on 2017/9/20.
 */
public class IoDemo02 {
    public static void main(String[] arg) throws IOException {
        read();
        write();

    }

    public static void read() throws IOException {
        String src ="D:\\PGA_CODE\\test\\02.txt";
        File file = new File(src);
        Reader reader = null;
        try {
            reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int len = 0;
        char[] buffer = new char[1000];
        while(-1!=(len = reader.read(buffer))){
            System.out.println(new String(buffer,0,buffer.length));
        }
    }

    public static void write(){
        String dist ="D:\\PGA_CODE\\test\\02.txt";
        File file = new File(dist);
        try {
            Writer writer = new FileWriter(file);
            writer.write("谁知盘中餐\r\n粒粒皆辛苦\r\n");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
