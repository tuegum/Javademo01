package day_01.demo_02_Stream.ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream_demo {
    public static void main(String[] args) throws IOException ,ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\tuegum\\study\\JavaFile\\Person_oos.txt"));
        Object o = ois.readObject();

        ois.close();
        System.out.println(o);

    }
}
