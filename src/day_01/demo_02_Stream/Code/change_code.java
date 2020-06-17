package day_01.demo_02_Stream.Code;

import java.io.*;

public class change_code {
    public static void main(String[] args) throws IOException {
        File file_read = new File("D:\\gbk.txt");
        File file_write = new File("D:\\res_utf.txt");
        ChangeCode(file_read,file_write);
    }

    private static void ChangeCode(File file_read, File file_write) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file_read),"gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file_write),"utf-8");
        int len = 0;
        while ((len = isr.read()) != -1){
            osw.write(len);
        }
        isr.close();
        osw.close();
    }
}
