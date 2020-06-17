package day_01.demo_04_itheima.Function;

import java.util.ArrayList;
import java.util.function.Function;
/*
把数组String[] arr = {"123","234","345","456"}元素转换为int类型+10，然后换变为String类型储存到Arraylist集合中
* */
public class Function_demo_02 {
    public static ArrayList<String> change(String[] arr, Function<String,Integer> fun1,Function<Integer,String> fun2){
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            String s1 = fun1.andThen(fun2).apply(s);
            list.add(s1);
        }
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        String[] arr = {"123","234","345","456"};
        change(arr,(str)->Integer.parseInt(str)+10,(in)->in + "");
    }
}
