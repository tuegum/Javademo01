package day_01.demo_02_Stream.ObjectStream;

import java.io.*;

public class xuliehua_fanxuliehua {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("宋典", 21);
        File file = new File("D:" + File.separator + "tuegum" + File.separator +
                "study" + File.separator + "JavaFile_2" + File.separator + "123.txt");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
            file.createNewFile();
        }
        OutputStream out = new FileOutputStream(file);
        InputStream in = new FileInputStream(file);
        @SuppressWarnings("resource")
        ObjectOutputStream oos = new ObjectOutputStream(out);
        oos.writeObject(person);
        out.close();
        ObjectInputStream ois = new ObjectInputStream(in);
        System.out.println(ois.readObject());
        ois.close();
    }
}
