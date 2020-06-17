package JDBC.day01.JDBCBegin;

import java.io.IOException;

/**
 * 单例模式
 */
public class demotest {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        int i = r.availableProcessors();
        System.out.println(i);
        try {
            r.exec("mspaint");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
