package JDBC.day01.JDBCBegin;

import java.io.*;

public class CopyTest {
    public static void main(String[] args) throws IOException{
        File cf = new File("D:\\copy_exe");
        cf.mkdirs();
        File file_read = new File("D:\\Software\\新建文件夹");
        long s = System.currentTimeMillis();
        File file_write = new File(cf.getAbsolutePath());
        CopyFile(file_read,file_write);
        long e = System.currentTimeMillis();
        System.out.println("拷贝一共使用了：" + (e-s) + "毫秒！");

    }

    private static void CopyFile(File file_read, File file_write) throws IOException {
        if (!file_read.isDirectory()){
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file_read));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file_write));

            int len = 0;
            byte[] bytes = new byte[1024*10];

            while((len = bis.read(bytes)) != -1){
                bos.write(bytes,0,len);
            }
            bis.close();
            bos.close();
        }else{
            file_write.mkdir();
            File[] listFiles = file_read.listFiles(pathname -> pathname.isDirectory()||pathname.getName().toLowerCase().endsWith("exe"));

            for (File listFile : listFiles) {
                File f1 = new File(file_read.getAbsolutePath() + File.separator + listFile.getName());
                File f2 = new File(file_write.getAbsolutePath() + File.separator +listFile.getName());
                CopyFile(f1,f2);
            }
        }
    }
}
