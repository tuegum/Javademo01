package day_01.demo_02_Stream.BufferedCopy;

import java.io.*;

public class BufferedCopy_big {
    public static void main(String[] args) throws IOException {
        show_01();
    }

    private static void show_01() throws IOException {
        long s = System.currentTimeMillis();
        File file_read = new File("D:\\tuegum\\interest\\japanese\\3000_jp_book");
        File file_write = new File("D:\\tuegum\\interest\\japanese\\copy");


        File[] File_Read = getAllfile(file_read);
        byte[] bytes = new byte[1024*10];
        int len = 0;

        for (File fr : File_Read) {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fr));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file_write));
           if (file_write.isDirectory() != true){
               while ((len = bis.read(bytes)) != -1){
                   bos.write(bytes,0,len);
               }
           }else {
               file_write.mkdir();
               String[] str = file_write.list();
               for (String s1 : str) {
                   File isFile = new File(file_write.getAbsolutePath() + File.separator + s1);
                   File copyfile = new File(file_read.getAbsolutePath() + File.separator + s1);

               }
           }
        }
        long e = System.currentTimeMillis();
        System.out.println("复制过程使用毫秒数为：" + (e-s));
    }

    public static File[] getAllfile(File dir){
        File[] files = dir.listFiles(pathname -> pathname.isDirectory() || pathname.getName().toLowerCase().endsWith("txt"));
        for (File f : files) {
            if (f.isDirectory()){
                getAllfile(f);
            }
        }
        System.out.println(files);
        return files;
    }
}
