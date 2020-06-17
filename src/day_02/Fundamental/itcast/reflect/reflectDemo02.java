package day_02.Fundamental.itcast.reflect;

import day_02.Fundamental.itcast.unit.Person;

import java.lang.reflect.Field;

/*1.获取成员变量们：
            Field[] getFields()
                      返回一个包含某些 Field 对象的数组，这些对象反映此 Class 对象所表示的类或接口的所有可访问公共字段。
            Field getField(String name)
                      返回一个 Field 对象，它反映此 Class 对象所表示的类或接口的指定公共成员字段。
            Field getDeclaredField(String name)
                      返回一个 Field 对象，该对象反映此 Class 对象所表示的类或接口的指定已声明字段。
            Field[] getDeclaredFields()
                      返回 Field 对象的一个数组，这些对象反映此 Class 对象所表示的类或接口所声明的所有字段。

2，获取构造方法们：
         Constructor<T> getConstructor(Class<?>... parameterTypes)
                  返回一个 Constructor 对象，它反映此 Class 对象所表示的类的指定公共构造方法。
         Constructor<?>[] getConstructors()
                  返回一个包含某些 Constructor 对象的数组，这些对象反映此 Class 对象所表示的类的所有公共构造方法。
         Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
                  返回一个 Constructor 对象，该对象反映此 Class 对象所表示的类或接口的指定构造方法。
         Constructor<?>[] getDeclaredConstructors()
                  返回 Constructor 对象的一个数组，这些对象反映此 Class 对象表示的类声明的所有构造方法。

3.获取成员方法们：
        Method getMethod(String name, Class<?>... parameterTypes)
                返回一个 Method 对象，它反映此 Class 对象所表示的类或接口的指定公共成员方法。
        Method[] getMethods()
                返回一个包含某些 Method 对象的数组，这些对象反映此 Class 对象所表示的类或接口（包括那些由该类或接口声明的以及从超类和超接口继承的那些的类或接口）的公共 member 方法。
        Method getDeclaredMethod(String name, Class<?>... parameterTypes)
                返回一个 Method 对象，该对象反映此 Class 对象所表示的类或接口的指定已声明方法。
        Method[] getDeclaredMethods()
                返回 Method 对象的一个数组，这些对象反映此 Class 对象表示的类或接口声明的所有方法，包括公共、保护、默认（包）访问和私有方法，但不包括继承的方法
4，获取类名：
        String getName()
                以 String 的形式返回此 Class 对象所表示的实体（类、接口、数组类、基本类型或 void）名称。
* */
public class reflectDemo02 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        Field[] fd = personClass.getFields();
        for (Field field : fd) {
            System.out.println(field );
        }

        System.out.println("=============分隔符================");

        Field a = personClass.getField("a");
        System.out.println(a);
        Person p = new Person();

        Object o = a.get(p);
        System.out.println(o);

        System.out.println("=============分隔符================");

        a.set(p,"去死吧");
        System.out.println(a.get(p));
        System.out.println(p);

        System.out.println("=============分隔符================");

        //获取所有成员变量
        Field[] df1 = personClass.getDeclaredFields();
        for (Field f : df1) {
            System.out.println(f);
        }

        System.out.println("=============分隔符================");

        Field a1 = personClass.getDeclaredField("a");
        //忽略访问权限修饰符的安全检查
        a1.setAccessible(true);//暴力反射
        Object o1 = a1.get(p);
        System.out.println(o1);
        System.out.println(a1);
    }
}
