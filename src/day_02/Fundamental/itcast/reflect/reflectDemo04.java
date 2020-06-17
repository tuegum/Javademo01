package day_02.Fundamental.itcast.reflect;

import day_02.Fundamental.itcast.unit.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
    写一个"框架"
    在不改变类的任何代码的前提下，可以帮我们创建任意类的对象，并且使用任意类的方法
* */
public class reflectDemo04 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        Method[] dms = personClass.getDeclaredMethods();
        for (Method dm : dms) {
            dm.setAccessible(true);
            System.out.println(dm);
        }
        Constructor[] dcs = personClass.getDeclaredConstructors();
        for (Constructor dc : dcs) {
            dc.setAccessible(true);
            /*Object o1 = dc.newInstance();*/
            Object o2 = dc.newInstance(String.class,int.class);
           /* System.out.println(o1);*/
            System.out.println(o2);
        }
    }
}
