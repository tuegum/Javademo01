package JDBC.day01.JDBCTemplate;

import JDBC.day01.JDBC_pool.Druid.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCTemplateDemo02 {
    private static Connection conn;

    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        try {
            conn = JDBCUtils.getConnection();

            conn.setAutoCommit(false);

            String sql1 = "update student1 set math = 100 where num between ? and ?";
            String sql2 = "insert into student1 values(null,'万振宇',23,'男','红灯区',132,433)";
            String sql3 = "delete from student1 where num = ? ";

            template.update(sql1, 1, 3);
            template.update(sql2);
            template.update(sql3,14);

            conn.commit();
        } catch (Exception e) {
            try {
                if (conn != null){
                    conn.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally {
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
