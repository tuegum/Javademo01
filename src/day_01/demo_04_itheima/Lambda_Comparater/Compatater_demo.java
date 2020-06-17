package day_01.demo_04_itheima.Lambda_Comparater;

import java.util.Arrays;
import java.util.Comparator;

public class Compatater_demo {
    //方法的返回值类型是一个接口
    public static Comparator<String> getComparator(){
        //可以返回其匿名内部类
        return (o1,o2)->o2.length()-o1.length();
    }

    public static void main(String[] args) {
        String[] arr = {"qweq","1233d@134","你好！"};
        System.out.println( Arrays.toString(arr));
        Arrays.sort(arr,getComparator());
        System.out.println(Arrays.toString(arr));
    }
}
