package day_01.demo_02_Stream.BufferedCopy;

import java.io.*;

public class BufferedCopyDir {
    public static void main(String[] args) throws IOException {
        File file_read = new File("D:\\tuegum\\interest\\japanese\\novel");
        File file_write = new File("D:\\tuegum\\interest\\japanese\\copy");
        long s = System.currentTimeMillis();
        CopyFile(file_read, file_write);
        long e = System.currentTimeMillis();
        System.out.println("拷贝共使用了" +(e-s)+ "毫秒！");
    }

    private static void CopyFile(File file_read, File file_write) throws IOException {
        if (!file_read.isDirectory()) {
            //创建一个读的缓冲区
            BufferedReader br = new BufferedReader(new
                    InputStreamReader(new FileInputStream(file_read.getAbsoluteFile()),"gbk"));
            //创建一个写入的缓冲区
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter(file_write.getParent() + File.separator + file_write.getName()));
            char[] chars = new char[1024*10];
            int ch = 0;
            while ((ch = br.read(chars)) != -1){
                bw.write(chars,0,ch);
            }
            br.close();
            bw.close();

        } else {
            file_write.mkdir();
            String[] str = file_read.list();
            for (String s : str) {
                File isFile = new File(file_read.getAbsolutePath() + File.separator + s);
                File copyFile = new File(file_write.getAbsolutePath() + File.separator + s);
                CopyFile(isFile, copyFile);
            }

        }

    }
}
