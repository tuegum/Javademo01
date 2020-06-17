package day_01.demo_04_itheima.Stream;

import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("12", "34", "56", "78");
        Stream<String> stream2 = Stream.of("654", "34", "56", "78");

        //concat方法合并流
        Stream<String> stream3 = Stream.concat(stream, stream2);

        //Map映射,将一种数据类型转换为另外一种数据类型，使用函数式接口function
        //limit(int n)方法截取前n个数据，skip方法跳过前n个
        Stream<Integer> stream1 = stream3.map((String str) -> Integer.parseInt(str)).skip(3).limit(3);
//        long count = stream1.count();//流终结方法
//        System.out.println(count);
        stream1.forEach((ss)-> System.out.println(ss));//流终结方法
    }
}
