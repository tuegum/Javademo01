package JDBC.day01.JDBC_utils;

import JDBC.day01.JDBC_utils.utils.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

public class JDBC_demo04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        Boolean res = new JDBC_demo04().login(username, password);
        if (res) {
            System.out.println("登陆成功！");
        } else {
            System.out.println("用户名或密码输入有误！");
        }

    }

    public boolean login(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        Connection coon = null;
        Statement stat = null;
        ResultSet rs = null;
        PreparedStatement pstat = null;
        try {
            coon = JDBCUtils.getConnecton();
//            String sql = "select * from stu where username = '" + username + "' and password = '" + password + "'";
            String sq2 = "select * from stu where username = ? and password = ?";

//            stat = coon.createStatement();
            pstat = coon.prepareStatement(sq2);

            pstat.setString(1, username);
            pstat.setString(2, password);

//            rs = stat.executeQuery(sql);
            rs = pstat.executeQuery();

            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(rs, pstat, coon);
        }
        return false;
    }
}
