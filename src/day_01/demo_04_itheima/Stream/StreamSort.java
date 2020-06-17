package day_01.demo_04_itheima.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamSort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");list.add("王八蛋");list.add("周芷若");list.add("灭绝师太");
        list.add("虚竹");list.add("乔峰");list.add("王语嫣");list.add("天山童姥");

        System.out.println(list.size());
        Stream<String> streamOne = list.stream();
        Stream<String> streamTwo = list.stream();

        Stream<String> stream1 = streamOne.filter(s -> s.length() == 3).limit(3);
        Stream<String> stream2 = streamTwo.filter(s -> s.equals("王")).skip(2);
        Stream<String> stream3 = Stream.concat(stream1, stream2);

        ArrayList<Person> list1 = new ArrayList<>();
        stream3.forEach(ss-> list1.add(new Person(ss)));

        Stream<Person> stream4 = list1.stream();
        //方法引用代替Consumer函数式接口lambda表达式
        //使用范围：对象::方法  =>>都已存在 && lambda中传递的参数一定要是方法中可以接收的数据类型
        stream4.forEach(System.out::println);
//        stream4.forEach(s-> System.out.println(s));
    }
}
