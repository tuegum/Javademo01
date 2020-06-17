package day_01.demo_02_Stream.InPutStream;

import java.io.FileInputStream;
import java.io.IOException;

public class InPutStreamdemo_01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\hp\\IdeaProjects\\JAVA\\src\\day_01\\demo_02_Stream\\demo_02_Stream.txt");
        int len = 0;
       while ((len = fis.read()) != -1){
           System.out.print((char)len);
        }
        fis.close();
    }
}
