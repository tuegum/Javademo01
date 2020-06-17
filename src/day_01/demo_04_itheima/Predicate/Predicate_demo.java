package day_01.demo_04_itheima.Predicate;

import java.util.function.Predicate;
/*
对传入的数据进行判断
* */
public class Predicate_demo {
    public static boolean method(String str, Predicate<String> pre){
       return pre.test(str);
    }

    public static void main(String[] args) {
        boolean res = method("dasdasf", (String str) -> str.length() > 3);
        System.out.println(res);
    }
}
