package tuniu.njsp;

import java.io.*;
import java.lang.reflect.Field;

/**
 * Created by songweiliang on 2017/10/6.
 */
public class FileCOpy {
    public static  void main(String[] args) throws IOException {
        File src = new File("D:\\房子\\1.jpg");
        File dest = new File("D:\\房子\\2.jpg");
        InputStream in = new BufferedInputStream(new FileInputStream(src));
        OutputStream out = new BufferedOutputStream(new FileOutputStream(dest));

        byte[] buffer = new byte[1024];
        int len = 0;
        while(-1!= (len = in.read(buffer))){
            out.write(buffer,0,len);
        }
        in.close();
        out.close();
        fileRead();
    }

    public static void fileRead() throws IOException {
        String path = "D:\\房子\\1..txt";
        File src = new File(path);
        FileReader read = null;
        try {
            read = new FileReader(src);
            char[] buffer = new char[1024];
            int len= 0;
            while(-1 !=(len=read.read(buffer))){
                System.out.println(new String(buffer,0,len));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null != read){
                read.close();
            }
        }

    }
}
