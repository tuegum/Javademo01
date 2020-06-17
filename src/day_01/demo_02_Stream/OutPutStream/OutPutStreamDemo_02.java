package day_01.demo_02_Stream.OutPutStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutStreamDemo_02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\hp\\IdeaProjects\\JAVA\\src\\day_01\\demo_02_Stream\\demo_02_Stream.txt",true);
        for (int i = 0; i <10 ; i++) {
            fos.write("去死吧！".getBytes());
            fos.write("\r\n".getBytes());
        }


        File file = new File("C:\\Users\\hp\\IdeaProjects\\JAVA\\src\\day_01\\demo_02_Stream\\demo_02_02.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        for (int i = 0; i < 10; i++) {
            fileOutputStream.write("我不知道你在说什么".getBytes());
            fileOutputStream.write("\r\n".getBytes());
            fos.write("我讨厌你！！！！！！！！！！！！！！！！".getBytes());
        }
        fileOutputStream.close();
        fos.close();

    }
}
