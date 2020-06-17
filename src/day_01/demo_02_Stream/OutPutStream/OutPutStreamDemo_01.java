package day_01.demo_02_Stream.OutPutStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class OutPutStreamDemo_01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("D:\\tuegum\\study\\JavaFile\\fos.txt"));
        FileOutputStream fos_2 = new FileOutputStream(new File("D:\\tuegum\\study\\JavaFile\\fos_2.txt"));
        new FileOutputStream("D:\\tuegum\\study\\JavaFile\\fos_3.txt");
        byte[] bytes = {67,68,69,70,71};
        fos.write(bytes);
        fos.write(bytes,1,2);
        byte[] bytes1 = "你好".getBytes();
        fos.write(bytes1);
        fos.write("去死吧".getBytes());
        System.out.println(Arrays.toString("你好".getBytes()));
        fos.close();
    }
}
