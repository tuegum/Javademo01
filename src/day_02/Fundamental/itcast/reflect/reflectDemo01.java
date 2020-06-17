package day_02.Fundamental.itcast.reflect;

import day_02.Fundamental.itcast.unit.Person;

/*
* 获取class对象的三种方式
* */
public class reflectDemo01 {
    public static void main(String[] args) throws Exception {
        //1.Class.forName(全类名)
        // 多用于配置文件，将类名定义在配置文件中，加载类
        Class<?> Cls1 = Class.forName("day_02.Fundamental.itcast.unit.Person");
        System.out.println(Cls1);

        //2.类名.class
        // 多用于参数的传递
        Class Cls2 = Person.class ;
        System.out.println(Cls2);

        //3.对象.getClass()
        // 多用于对象获取字节码方式
        Person p1 = new Person();
        Class Cls3 = p1.getClass();
        System.out.println(Cls3);

        System.out.println(Cls1 == Cls2);
        System.out.println(Cls1 == Cls3);
    }
}
