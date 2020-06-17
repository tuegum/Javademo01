package day_01.demo_04_itheima.Supplier;

import java.util.function.Supplier;
/*
生产类型接口：
Supplier<类型> 里面是啥类型的数据就返回啥类型的数据
* */
public class Supplier_demo {
    public static String getString(Supplier<String> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        String s = getString(() ->"小美女 ");
        System.out.println(s);
    }
}
