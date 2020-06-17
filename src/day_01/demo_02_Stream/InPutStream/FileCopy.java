package day_01.demo_02_Stream.InPutStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("C:\\1.txt");
        FileOutputStream fos = new FileOutputStream("D:\\4.txt");
        byte[] bytes = new byte[1024*1024];
        int len = 0;
        while ((len = fis.read(bytes))!= -1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println(e-s);
    }
}
