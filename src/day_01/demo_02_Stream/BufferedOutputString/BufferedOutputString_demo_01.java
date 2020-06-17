package day_01.demo_02_Stream.BufferedOutputString;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputString_demo_01 {
    public static void main(String[] args) throws IOException {
        show_01();
    }

    private static void show_01() throws IOException {
        FileOutputStream fos = new FileOutputStream
                ("C:\\\\Users\\\\hp\\\\IdeaProjects\\\\JAVA\\\\src\\\\day_01\\\\demo_02_Stream\\BufferedOutputString\\1.txt");
        byte[] bytes = new byte[1024*10];
        BufferedOutputStream bos = new BufferedOutputStream(fos,1024);
        bos.write("我把数据写入内存缓冲区中".getBytes());
        bos.flush();
        bos.close();
    }
}
