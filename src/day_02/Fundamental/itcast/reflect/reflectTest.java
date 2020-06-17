package day_02.Fundamental.itcast.reflect;
/*
    写一个"框架"
    在不改变类的任何代码的前提下，可以帮我们创建任意类的对象，并且使用任意类的方法
* */
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class reflectTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException,
            IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        //1.加载配置文件
        //1.创建properties对象
        Properties pro = new Properties();
        //1.2加载配置文件，转换为一个集合
        //1.2.1获取class目录下的配置文件
        ClassLoader classLoader = reflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        //2.获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //3.加载类进入内存
        Class cls = Class.forName(className);

        //4.创建对象
        Object obj = cls.newInstance();

        //5.获取方法对象
        Method method = cls.getMethod(methodName);

        //6.执行对象
        method.invoke(obj);


    }
}
