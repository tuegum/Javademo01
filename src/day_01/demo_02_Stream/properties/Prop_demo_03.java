package day_01.demo_02_Stream.properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Prop_demo_03 {
    public static void main(String[] args) throws IOException {
        fun_01();
    }

    private static void fun_01() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("C:\\Users\\hp\\IdeaProjects\\JAVA\\src\\day_01\\demo_02_Stream\\properties\\1.txt"));
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            System.out.println(key + "=" + prop.getProperty(key));
        }
    }
}
