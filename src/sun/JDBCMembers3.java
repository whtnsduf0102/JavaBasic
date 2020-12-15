package sun;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class JDBCMembers3 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "select * from bookmembers";
        String fmt = "%s %s %s %s \n";
        StringBuilder sb = new StringBuilder();

        conn = JDBCUtil.makeConn();
        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while(rs.next()){
                String custid = rs.getString(1);
                String name = rs.getString(2);
                String addr = rs.getString(3);
                String phone = rs.getString(4);
                String result = String.format
                        (fmt,custid,name,addr,phone);
                sb.append(result);
            }
        } catch (SQLException throwables) {
            System.out.println("JDBC 질의문생성오류");
        }
        JDBCUtil.destoryConn(conn, pstmt, rs);

        System.out.println(sb.toString());



    }
}
