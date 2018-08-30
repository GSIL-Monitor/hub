package tuniu.njsp;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by songweiliang on 2017/10/7.
 */
public class ByteArrayDemo {

    public static void main(String[] args){
        //System.out.println(getObject());
        getObject();
    }
    public static byte[] getByte(){
        File file = new File("D:\\房子\\1.jpg");
        byte[] dest = null;
        try {
            InputStream in = new BufferedInputStream(new FileInputStream(file));
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            while(-1 !=(len=in.read(buffer))){
                out.write(buffer,0,len);
            }
            out.flush();
            dest = out.toByteArray();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dest;
    }


    public static void getObject(){
        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(
                                    new File("D:/房子/1.txt")
                            )
                    )
            );

             String[] s = new String[10];
            s[1] = "halou";
            out.writeObject(s);
            out.flush();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
