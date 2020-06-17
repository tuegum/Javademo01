package JDBC.day01.JDBC_utils.utils;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    private static String url;
    private static String user;
    private static String password;
    private static String driver;

    /**
     * 文件的读取，只需要读取一次即可拿到这些值，使用静态代码块
     */
    static {
        //读取文件资源，获取值
        try {
            //1.创建properties集合类
            Properties prop = new Properties();
            //获取src路径下的文件的方式 ----> ClassLoader 类加载器
            /*ClassLoader classLoader = JDBCUtils.class.getClassLoader();*/
            URL res = JDBCUtils.class.getClassLoader().getResource("jdbc.properties");
            String path = res.getPath();
//            System.out.println(path);
            //2.加载文件
            prop.load(new FileReader(path));
            //3.获取数据，赋值
            url = prop.getProperty("url");
            user = prop.getProperty("user");
            password = prop.getProperty("password");
            driver = prop.getProperty("driver");
            //4.注册驱动
            Class.forName(driver);
        }  catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static Connection getConnecton() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }


    /**
     * 释放资源
     *
     * @param stat
     * @param coon
     */
    public static void close(Statement stat, Connection coon) {
        if (stat != null) {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (coon != null) {
            try {
                coon.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(ResultSet rs, Statement stat, Connection coon) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stat != null) {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (coon != null) {
            try {
                coon.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
