package JDBC.day01.JDBC_pool.Druid.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class DruidDemo02 {
    private static Connection coon = null;
    private static PreparedStatement pstat = null;
    private static ResultSet rs = null;
    private static Account account;
    private static List<Account> list;


    public static void main(String[] args) {

  /*      Connection coon = null;
        PreparedStatement pstat = null;
        ResultSet rs = null;
        Account account = null;
        List<Account> list = null;*/
        try {
            coon = JDBCUtils.getConnection();
            String sql = "select * from account where id between ? and ?";
            pstat = coon.prepareStatement(sql);

            pstat.setInt(1,1);
            pstat.setInt(2,2);

            rs = pstat.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double balance = rs.getDouble("balance");
                account = new Account(id,name,balance);
                account.setId(id);
                account.setName(name);
                account.setBalance(balance);
                System.out.println(account);
//                list.add(account);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,pstat,coon);
        }
    }
}
