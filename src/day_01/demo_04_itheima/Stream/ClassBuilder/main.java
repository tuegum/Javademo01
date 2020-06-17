package day_01.demo_04_itheima.Stream.ClassBuilder;

public class main {
    public static Person fun(String name,ClassBuilder cb){
        Person p1 = cb.Method(name);
        System.out.println(p1.getName());
        return p1;
    }

    public static void main(String[] args) {
        fun("王韩雪",Person::new);//使用Person带参构造方法，通过传递的姓名创建对象
        fun("东皇太一",(str -> new Person(str)));
    }
}
