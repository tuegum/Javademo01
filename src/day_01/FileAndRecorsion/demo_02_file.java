package day_01.FileAndRecorsion;

import java.io.File;
import java.io.FileFilter;

public class demo_02_file {
    public static void main(String[] args) {
        File file = new File("D:\\document\\QQ");
        getAllFiles(file);

    }

    private static void getAllFiles(File dir) {
       /* File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory()||pathname.getName().toLowerCase().endsWith("png");
            }
        });*/
        File[] files = dir.listFiles(pathname -> pathname.isDirectory()||pathname.getName().toLowerCase().endsWith("png"));
        for (File file : files) {
            if (file.isDirectory()){
                getAllFiles(file);
            }
            System.out.println(file);
        }
    }
}
