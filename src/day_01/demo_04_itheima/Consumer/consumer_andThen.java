package day_01.demo_04_itheima.Consumer;

import java.util.function.Consumer;

public class consumer_andThen {
    public static void Method(String name, Consumer<String> con1, Consumer<String> con2) {
        con1.andThen(con2).accept(name);
    }

    public static void main(String[] args) {
        Method("桥本环奈", (String name) -> System.out.println(name),
                (String name) -> {
                    String ReverseName = new StringBuffer(name).reverse().toString();
                    System.out.println(ReverseName);
                });
    }
}
