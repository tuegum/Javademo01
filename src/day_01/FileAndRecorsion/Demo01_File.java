package day_01.FileAndRecorsion;

import java.io.File;

/*
static String pathSeparator 与系统有关的路径分隔符，为了方便，它被表示为一个字符串。
static char pathSeparatorChar 与系统有关的路径分隔符。
static String separator 与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串。
static char separatorChar 与系统有关的默认名称分隔符。


构造方法：
File(File parent, String child) 根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
File(String pathname) 通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
File(String parent, String child) 根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
File(URI uri) 通过将给定的 file: URI 转换为一个抽象路径名来创建一个新的 File 实例。
 */

public class Demo01_File {
    public static void main(String[] args) {
       String pathSeparator =  File.pathSeparator;
        System.out.println(pathSeparator);

        String separator = File.separator;
        System.out.println(separator);



        show1();
        show2("C:\\","c.txt");

    }

    private static void show3(File parent, String child) {
        File file = new File(parent, child);
        System.out.println(file);
    }

    private static void show2(String parent, String child) {
        File file = new File(parent, child);
        System.out.println(file);
    }

    public static void show1(){
        File f1 = new File("C:\\Users\\hp\\IdeaProjects\\JAVA\\out\\production\\JAVA\\day_01\\FileAndRecorsion\\a.txt");
        File f2 = new File("C:\\Users\\hp\\IdeaProjects\\JAVA\\out\\production\\JAVA\\day_01\\FileAndRecorsion");
        File f3 = new File("b.txt");
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);


    }
}
