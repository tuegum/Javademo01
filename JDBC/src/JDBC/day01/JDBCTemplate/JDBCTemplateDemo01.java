package JDBC.day01.JDBCTemplate;

import JDBC.day01.JDBC_pool.Druid.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCTemplateDemo01 {
    public static void main(String[] args) {
        //1.导入jar包
        //2.创建JDBCTemplated对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        //3.调用方法
        String sql = "update  account set balance = 6190 where id = ? ";
        int count = template.update(sql, 1 );
        System.out.println(count);
    }
}
