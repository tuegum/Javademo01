package JDBC.day01.JDBC_pool.C3P0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;

public class C3P0Demo02 {
    public static void main(String[] args) {
        DataSource ds = new ComboPooledDataSource();
    }
}
