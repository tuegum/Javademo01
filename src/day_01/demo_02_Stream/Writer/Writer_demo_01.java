package day_01.demo_02_Stream.Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer_demo_01 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter(new File("C:\\Users\\hp\\IdeaProjects\\JAVA\\src\\day_01\\demo_02_Stream\\demo_02_02.txt"),true);
        int len = 0;
        char[] cs = new char[1024*10];
        fw.write(97);
        fw.write("dasdqw你好123￥%……&",4,5);
        fw.flush();
        fw.close();
    }
}
