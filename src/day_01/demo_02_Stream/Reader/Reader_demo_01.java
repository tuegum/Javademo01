package day_01.demo_02_Stream.Reader;

import java.io.FileReader;
import java.io.IOException;

public class Reader_demo_01 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\hp\\IdeaProjects\\JAVA\\src\\day_01\\demo_02_Stream\\demo_02_02.txt");
        int len = 0;
        char[] cs = new char[1024*10];

        /*while ((len = fr.read())!= -1) {
            System.out.print((char) len);
        }*/

        while ((len = fr.read(cs)) != -1){
            System.out.println(new String(cs,0,len));
        }
        fr.close();
    }
}
