package JDBC.day01.JDBC_utils;

import JDBC.day01.JDBC_utils.utils.JDBCUtils;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBC_demo03 {
    public static void main(String[] args) {
        List<student> list = new JDBC_demo03().findAll();
        System.out.println(list);
        System.out.println(list.size());
    }

    public List<student> findAll() {
        Statement stat = null;
        Connection conn = null;
        ResultSet rs = null;
        List<student> list = null;
        try {
            /*Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///db1", "root", "x.433+vampire");*/
            conn = JDBCUtils.getConnecton();
            String sql = "select * from student";
            stat = conn.createStatement();
            rs = stat.executeQuery(sql);
            student st = null;
            list = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                float english_score = rs.getFloat("english_score");
                Date birthday = rs.getDate("birthday");
                st = new student();
                st.setId(id);
                st.setName(name);
                st.setAge(age);
                st.setEnglish_score(english_score);
                st.setBirthday(birthday);
                list.add(st);
            }

        } /*catch (ClassNotFoundException e) {
            e.printStackTrace();
        } */catch (SQLException e) {
            e.printStackTrace();
        } finally {
           /* if (rs != null) {
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

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
             }*/
           JDBCUtils.close(rs,stat,conn);
        }
        return list;
    }

}