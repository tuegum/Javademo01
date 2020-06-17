package day_01.demo_01;

public class lambda {
    public static void main(String[] args) {
        //第一种方法
        invokefood(new Cook() {
            @Override
            public void makefood() {
                System.out.println("吃饭！");
            }
        });
        System.out.println("=====================");
        invokefood(()->{
            System.out.println("我有吃饭啦！");
        });
    }

    public static void invokefood(Cook cook){
        cook.makefood();
    }
}
