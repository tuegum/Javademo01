package JDBC.day01.JDBC_utils;


import JDBC.day01.JDBC_utils.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_demo_fianl {
    public static void main(String[] args) {
        Connection coon = null;
        PreparedStatement pstat1 = null;
        PreparedStatement pstat2 = null;
        try {
            coon = JDBCUtils.getConnecton();

            coon.setAutoCommit(false);

            String sql1 = "update account set balance = balance - ? where id =  ?";
            String sql2 = "update account set balance = balance + ? where id = ? ";
            pstat1 = coon.prepareStatement(sql1);
            pstat2 = coon.prepareStatement(sql2);

            pstat1.setDouble(1,500);
            pstat1.setInt(2,1);

            pstat2.setDouble(1,500);
            pstat2.setInt(2,2);

            pstat1.executeUpdate();

            //手动制造异常
            int i = 1/0;

            pstat2.executeUpdate();

            coon.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                if (coon != null){
                    coon.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }finally {
            JDBCUtils.close(pstat1,coon);
            JDBCUtils.close(pstat2,null);
        }
    }
}
 