package JDBC.day01.JDBCBegin;

import java.sql.*;

/**
 * JDBC 快速入门
 */
public class JDBC_demo01 {
    public static void main(String[] args) throws Exception {
        //1.导入jar包
        //2.注册驱动,mysql 5之后可省略
        // 静态代码块
        /*
        * static {
        try {
            DriverManager.registerDriver(new Driver());
        } catch (SQLException var1) {
            throw new RuntimeException("Can't register driver!");
        }
    }*/
        Class.forName("com.mysql.jdbc.Driver");
        //3.获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "x.433+vampire");
        //4.定义sql语句
        String sql = "select * from student";
        //5.执行sql对象 statment
        Statement stat = conn.createStatement();
        //6.执行sql
        ResultSet resultSet = stat.executeQuery(sql);
        //7.处理结果
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString("name");
                int age = resultSet.getInt(3);
                double english_score = resultSet.getDouble(4);
                Date birthday = resultSet.getDate("birthday");
                System.out.println(id +"=====" +  name + "=====" + age + "=====" + english_score+ "=====" + birthday);
                resultSet.next();
            }

        //8.释放资源
        stat.close();
        conn.close();
    }
}
