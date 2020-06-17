package day_01.demo_02_Stream.Code;

import java.io.FileReader;
import java.io.IOException;
/*
IDEA只能读取utf-8格式文件
使用其他格式会产生乱码
* */
public class luanma_test {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\hp\\IdeaProjects\\JAVA\\src\\day_01\\Code\\GBK格式.txt");
        int len = 0;
        while ((len =fr.read())!=-1){
            System.out.println((char)len);
        }
        fr.close();
    }
}
