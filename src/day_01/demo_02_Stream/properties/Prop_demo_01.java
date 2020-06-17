package day_01.demo_02_Stream.properties;

import java.util.Properties;
import java.util.Set;

public class Prop_demo_01 {
    public static void main(String[] args) {
        show();
    }

    private static void show() {
        //创建集合对象
        Properties prop = new Properties();

        //往集合写入数据
        prop.setProperty("张三","189");
        prop.setProperty("爱丽丝","199");
        prop.setProperty("卡扎库斯","179");

        //使用stringPropertyNmaes()将Properties集合中的键取出，存储到一个set集合中
        Set<String> set = prop.stringPropertyNames();

        for (String s : set) {
            System.out.println(s+":      "    +prop.getProperty(s));
        }

    }
}
