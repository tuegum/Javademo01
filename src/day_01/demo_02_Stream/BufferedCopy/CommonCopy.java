package day_01.demo_02_Stream.BufferedCopy;

import java.io.*;

public class CommonCopy {
    public static void main(String[] args) throws IOException {
        File cf = new File("D:\\tuegum\\interest\\japanese\\copy_2");
        cf.mkdirs();
        File file_read = new File("D:\\tuegum\\interest\\japanese\\novel");
        File file_write = new File(cf.getAbsolutePath());
        long s = System.currentTimeMillis();
        copyfile(file_read,file_write);
        long e = System.currentTimeMillis();
        System.out.println("拷贝一共使用了：" + (e-s) + "毫秒！");
    }

    private static void copyfile(File file_read, File file_write) throws IOException {

        if (!file_read.isDirectory()) {
            FileReader fr = new FileReader(file_read.getAbsolutePath());
            FileWriter fw = new FileWriter(file_write);
            char[] chars = new char[1024 * 10];
            int ch = 0;
            while ((ch = fr.read(chars)) != -1) {
                fw.write(chars, 0, ch);
            }
            fr.close();
            fw.close();
        }else {
            file_write.mkdir();
            String[] list = file_read.list();
            for (String s : list) {
                File isFile = new File(file_read.getAbsolutePath() + File.separator + s);
                File copyFile = new File(file_write.getAbsolutePath() + File.separator + s);
                copyfile(isFile,copyFile);
            }
        }
    }

}
