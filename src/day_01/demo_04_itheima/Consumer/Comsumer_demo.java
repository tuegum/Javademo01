package day_01.demo_04_itheima.Consumer;

import java.util.function.Consumer;
/*对传递的数据进行消费*/
public class Comsumer_demo {
    public static void method(String name, Consumer<String> consumer){
        consumer.accept(name);
    }

    public static void main(String[] args) {
        method("赵丽颖",(String name)->{
            System.out.println(name);
            String ReverseName = new StringBuffer(name).reverse().toString();
            System.out.println(ReverseName);
        });
    }
}
