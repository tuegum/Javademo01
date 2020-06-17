package day_01.demo_02_Stream.BufferedCopy;

import java.io.*;

public class BufferedCopy_small {
    public static void main(String[] args) throws IOException {
        show_01();
    }

    private static void show_01() throws IOException{
        long s = System.currentTimeMillis();
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream
                ("C:\\\\Users\\\\hp\\\\IdeaProjects\\\\JAVA\\\\src\\\\day_01\\\\demo_02_Stream\\BufferedCopy\\1.txt",true));

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream
                ("C:\\\\Users\\\\hp\\\\IdeaProjects\\\\JAVA\\\\src\\\\day_01\\\\demo_02_Stream\\BufferedCopy\\2.txt"));

        byte[] bytes = new byte[1024*10];
        int len = 0;
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        bos.flush();
        bos.close();
        bis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制过程使用毫秒数为：" + (e-s));
    }
}
