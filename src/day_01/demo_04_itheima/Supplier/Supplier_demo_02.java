package day_01.demo_04_itheima.Supplier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

/*
求数据元素的最大值：
* */
public class Supplier_demo_02 {
    public static ArrayList<Integer>  getInteger(Integer[] ins, Supplier<Integer> supplier){
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer in : ins) {
            Integer integer1 = supplier.get();
            list.add(integer1);
        }
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[10];
        for (Integer in : integers) {
            Scanner sc = new Scanner(System.in);
            in = sc.nextInt();
        }
        for (Integer integer : integers) {
            System.out.println(integer);
            getInteger(integers,()->integer);
        }
    }
}
