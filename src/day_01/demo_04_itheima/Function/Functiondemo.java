package day_01.demo_04_itheima.Function;

import java.util.function.Function;

/*
转换类型
* */
public class Functiondemo {
    public static void change(String arr, Function<String,Integer> fun){
        int in = fun.apply(arr);
        System.out.println(in);
    }

    public static void main(String[] args) {
        String s = "1234";
        change(s,(str)->Integer.parseInt(str));
    }
}
