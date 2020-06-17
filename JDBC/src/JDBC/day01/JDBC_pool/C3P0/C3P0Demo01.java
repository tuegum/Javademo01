package JDBC.day01.JDBC_pool.C3P0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * C3P0的演示
 */

public class C3P0Demo01 {
    public static void main(String[] args) throws SQLException {
        //1.创建数据库连接池对象
        DataSource ds = new ComboPooledDataSource();
        //2.获取连接对象
        Connection coon = ds.getConnection();
        //3.打印
        System.out.println(coon);
    }
}
