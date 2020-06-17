package day_02.Fundamental.itcast.reflect;

import day_02.Fundamental.itcast.unit.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
2，获取构造方法们：
         Constructor<T> getConstructor(Class<?>... parameterTypes)
                  返回一个 Constructor 对象，它反映此 Class 对象所表示的类的指定公共构造方法。
         Constructor<?>[] getConstructors()
                  返回一个包含某些 Constructor 对象的数组，这些对象反映此 Class 对象所表示的类的所有公共构造方法。
         Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
                  返回一个 Constructor 对象，该对象反映此 Class 对象所表示的类或接口的指定构造方法。
         Constructor<?>[] getDeclaredConstructors()
                  返回 Constructor 对象的一个数组，这些对象反映此 Class 对象表示的类声明的所有构造方法。
* */
public class reflectDemo03 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        Constructor ct1 = personClass.getConstructor(String.class, int.class);
        Constructor ct2 = personClass.getConstructor();
        System.out.println(ct1);
        System.out.println(ct2);


        //创建对象 =>> 有参构造
        Object p1 = ct1.newInstance("葛正辉", 25);
        System.out.println(p1);

        //创建对象 =>> 无参构造
        Object o = ct2.newInstance();
        System.out.println(o);

        System.out.println("===================");

        Method method = personClass.getMethod("eat");
        System.out.println(method);

        System.out.println("============");

        Method[] dm = personClass.getDeclaredMethods();
        for (Method m : dm) {
            m.setAccessible(true);
            System.out.println(m);
        }
    }
}
