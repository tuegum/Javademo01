package day_01.demo_02_Stream.properties;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class Prop_demo_02 {
    public static void main(String[] args) throws IOException {
       /* FileOutputStream fos = new FileOutputStream("C:\\Users\\hp\\IdeaProjects\\JAVA\\src\\day_01\\demo_02_Stream\\properties\\1.txt",true);*/
       show_01();
    }

    private static void show_01() throws IOException {
        //1.创建Properties 集合并添加数据
        Properties prop = new Properties();
        prop.setProperty("卡扎库斯","4");
        prop.setProperty("大帝","6");
        prop.setProperty("小软","2");

        //2.创建字符/字节输出流对象，构造方法中绑定要输出的目的地
        FileWriter fw = new FileWriter(new File("C:\\Users\\hp\\IdeaProjects\\JAVA\\src\\day_01\\demo_02_Stream\\properties\\1.txt"),true);


        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            System.out.println(key + "=" + prop.getProperty(key));
        }
        //3.使用Properties集合中的方法store，把集合中的临时数据写入硬盘中
        prop.store(fw,"sava_data");
/*//字节流不能写中文
        prop.store(new FileOutputStream("C:\\Users\\hp\\IdeaProjects\\JAVA\\src\\day_01\\demo_02_Stream\\properties\\1.txt",true),"fileoutputstream");
*/

        //4.释放资源
        fw.close();
    }
}
