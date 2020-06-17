package day_01.demo_02_Stream.InPutStream;

import java.io.FileInputStream;
import java.io.IOException;

public class InPutStreamdemo_02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\hp\\IdeaProjects\\JAVA\\src\\day_01\\demo_02_Stream\\demo_02_02.txt");
        byte[] bytes = new  byte[1024*1024];
        int len = 0;
        while ((len =fis.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
           /* fis.read("\n\r".getBytes());*/
        }
        System.out.println(len);

        fis.close();
    }
}
