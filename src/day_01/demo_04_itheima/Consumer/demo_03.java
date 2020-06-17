package day_01.demo_04_itheima.Consumer;

import java.util.function.Consumer;

public class demo_03 {
    public static void method(String[] arr, Consumer<String> con1,Consumer<String> con2){
        for (String s : arr) {
            con1.andThen(con2).accept(s);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"陈俊任,男","王寒雪,女","万振宇,男"};
        method(arr,(s)->{
            String name = s.split(",")[0];
            System.out.print("姓名：" + name);
        },(s)->{
            String sex = s.split(",")[1];
            System.out.println(" , 性别：" + sex);
        });
    }
}
