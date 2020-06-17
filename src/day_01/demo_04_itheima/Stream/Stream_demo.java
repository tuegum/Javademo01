package day_01.demo_04_itheima.Stream;

/*
Stream 流对for 循环进行优化
stream流只能调用一次，调用完即刻关闭
* */

import java.util.ArrayList;

public class Stream_demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("王寒雪");
        list.add("郜燕过");
        list.add("孙尚香");
        list.add("刘备");
        list.add("刘邦");
        list.add("王昭君");
        list.add("东皇太一");

        //过滤姓王且名字长度为3的人并输出,
        // 利用函数式接口predicate进行判断达到过滤目的，
        // 利用forEach输出(使用Consumer函数式接口消费数据)
        list.stream().filter(name -> name.startsWith("王"))
                .filter(name -> name.length() == 3)
                .forEach(name -> System.out.println(name));
    }
}
