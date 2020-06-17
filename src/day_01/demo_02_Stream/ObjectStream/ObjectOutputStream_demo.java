package day_01.demo_02_Stream.ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectOutputStream_demo {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\tuegum\\study\\JavaFile\\Person_oos.txt"));
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("小美女",14));
        list.add(new Person("罗志祥",41));
        oos.writeObject(list);
        /* oos.writeObject(new Person("小美女",14));
        oos.writeObject(new Person("罗志祥",41));*/
        oos.flush();
        oos.close();
    }
}
