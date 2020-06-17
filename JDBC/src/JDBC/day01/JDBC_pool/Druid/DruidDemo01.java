package JDBC.day01.JDBC_pool.Druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class DruidDemo01 {
    public static void main(String[] args) throws Exception {
        //1.导入jar包
        //2.定义配置文件
        //3.加载配置文件
        Properties prop = new Properties();
        InputStream is = DruidDemo01.class.getClassLoader().getResourceAsStream("druid.properties");
        prop.load(is);
        //4.获取连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(prop);
        Connection coon = ds.getConnection();
        System.out.println(coon);
    }

}
