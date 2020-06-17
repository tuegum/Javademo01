package day_01.demo_02_Stream.Code;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader_demo {
    public static void main(String[] args) throws IOException {
        read_utf_8();
    }

    private static void read_utf_8() throws IOException {
        InputStreamReader utf = new InputStreamReader(new FileInputStream("D:\\utf-8.txt"), "utf-8");
        int len = 0;
        char[] chars = new char[1024];
        while ((len = utf.read(chars))!= -1){
            System.out.println(new String(chars,0,len));
        }
        utf.close();
    }
}
