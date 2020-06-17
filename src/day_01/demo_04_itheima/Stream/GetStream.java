package day_01.demo_04_itheima.Stream;

import java.util.*;
import java.util.stream.Stream;

public class GetStream {
    public static void main(String[] args) {
        //把集合转换成Stream流
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        Map<String,String> map = new HashMap<>();
        Set<String> keyset = map.keySet();
        Stream<String> stream3 = keyset.stream();

        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();

        Set<Map.Entry<String,String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entries.stream();


        //把数组转变为Stream流
        Stream<String> stream6 = Stream.of("1,2,3,4,5,6");

        Integer[] arr = {1,2,3,4,5,6};
        String[] str = {"dwe","wef2f","32e2ef"};

        Stream<Integer> stream7 = Stream.of(arr);
        Stream<String> stream8 = Stream.of(str);
    }
}
