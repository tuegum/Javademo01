package JDBC.day01.JDBCTemplate.JDBCDemoTest;

import JDBC.day01.JDBCTemplate.domain.Student1;
import JDBC.day01.JDBC_pool.Druid.utils.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class JDBCDemoStudent1 {

    //Junit单元测试，可以让方法单独运行
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    /**
     *修改db1数据库student1表中id为1的学生的数学成绩为124，5
     */
    @Test
    public void test1(){
        String sql = "update student1 set math = 124.5 where num between ? and ?";
        int count = template.update(sql, 1, 1);
        System.out.println(count);
    }

    @Test
    public void test2(){
        String sql = "insert into student1 values(?,?,?,?,?,?,?)";
        int count = template.update(sql,null,"万振宇",23,"女","比亚迪",132,433);
        System.out.println(count);
    }

    @Test
    public void test3(){
        String sql = "delete from student1 where address = ?";
        int count = template.update(sql,"比亚迪");
        System.out.println(count);
    }

    @Test
    public void test4(){
        String sql = "select * from student1 where num = ?";
        //这个方法查询结果长度只能是1
        Map<String, Object> map = template.queryForMap(sql,1 );
        System.out.println(map);
    }

    //查询所有
    @Test
    public void test5(){
        String sql = "select * from student1 ";
        List<Map<String, Object>> maps = template.queryForList(sql);
        System.out.println(maps);
    }

    //查询所有 推荐Spring框架
    @Test
    public void test6(){
        String sql = "select * from student1 ";
        List<Student1> list = template.query(sql, new BeanPropertyRowMapper<Student1>(Student1.class));
        for (Student1 s : list) {
            System.out.println(s);
        }
    }

    @Test
    public void test7(){
        String sql = "select count(num) from student1 ";
        Long l = template.queryForObject(sql, Long.class);
        System.out.println(l);

    }
}
