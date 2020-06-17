package day_01.demo_04_itheima.Stream.Array;

import java.util.ArrayList;


public class Test {
    public static ArrayList<String> fun(int size, ArrayBuilder ab){
        return ab.BuilderList(size);
    }

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(10);
        System.out.println(list1.size());
        ArrayList<String> list = fun(10, size -> new ArrayList<>(size));
        ArrayList<String> list2 = fun(10, ArrayList::new);
        System.out.println(list.size());
    }
}
