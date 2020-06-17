package day_01.demo_04_itheima.Stream.Super;

public class Man extends Human {
    private void fun(Greet greet){
        greet.greet();
    }
    @Override
    public void method() {
        System.out.println("我是男人！");
    }

    public void show(){
        fun(()->{
            Human human = new Human();
            human.method();
        });

        fun(()->super.method());
        fun(super::method);
        fun(()->this.method());
        fun(this::method);
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
