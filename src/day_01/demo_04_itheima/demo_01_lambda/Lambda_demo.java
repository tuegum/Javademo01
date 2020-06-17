package day_01.demo_04_itheima.demo_01_lambda;

public class Lambda_demo {
    public static void method(int level, MessageBuilder mb){
        if (level == 1){
            String s = mb.BuilderMessage();
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        String msg1 = "你好";
        String msg2 = "再见";
        String msg3 = "好的";
        method(3,()->{
            System.out.println("不满足条件不执行！");
            return msg1+msg2+msg3;
        });
    }
}
