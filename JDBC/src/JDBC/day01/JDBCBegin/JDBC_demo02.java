package JDBC.day01.JDBCBegin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_demo02 {
    public static void main(String[] args) {
        Statement stat = null;
        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "insert into student values(null,'王五',23,'67','1996-03-24')";
            String sq2 = "update student set age = 23 where name = '王五'";
//            String sq3 = "delete from student where age = 412";
//            String sq4 = "create table stu2(id int,name varchar(20)) ";
//            String sq5 = "insert into stu2 values(1,'李四')";
             conn = DriverManager.getConnection("jdbc:mysql:///db1", "root", "x.433+vampire");
             stat = conn.createStatement();
            int i = stat.executeUpdate(sql);
            int i2 = stat.executeUpdate(sq2);
//            int i3 = stat.executeUpdate(sq3);
//            int i4 = stat.executeUpdate(sq4);
//            int i5 = stat.executeUpdate(sq5);
            System.out.println(i);
            if (i > 0){
                System.out.println("执行成功!");
            }else {
                System.out.println("执行失败！");
            }
            } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
