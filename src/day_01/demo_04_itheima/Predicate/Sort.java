package day_01.demo_04_itheima.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Sort {
    public static ArrayList<String> method(String[] str, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : str) {
            if (pre1.and(pre2).test(s)){
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] arr = {"陈俊任,男", "王寒雪,女", "万振宇,男", "徐峥,男"};
        ArrayList<String> list = method(arr, (String str) -> {
            String name = str.split(",")[0];
            return name.length() == 3;
        }, (String str) -> {
            String sex = str.split(",")[1];
            return sex.equals("女");
        });
        System.out.println(list);
    }
}
