package day_01.demo_04_itheima.Predicate;

import java.util.function.Predicate;

public class Predicate_and {
    public static boolean method(String str, Predicate<String> pre1,Predicate<String> pre2){
        return pre1.test(str)&&pre2.test(str);
    }

    public static void main(String[] args) {
        boolean res = method("dasdasf", (String str) -> str.length() > 3,(String str)->str.contains("b"));
        System.out.println(res);
        String s = "那是多久啊";
        System.out.println(s.length());
    }
}
