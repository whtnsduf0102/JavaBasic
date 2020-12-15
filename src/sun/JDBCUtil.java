package sun;

import java.sql.*;

public class JDBCUtil {
    //JDBC 드라이버초기화 및 Connection 객체생성
    public static Connection makeConn(){
        String DRV = "org.mariadb.jdbc.Driver";
        String URL = "jdbc:mariadb://mariadb.cyd7bdxnvkdi.ap-northeast-2.rds.amazonaws.com:3306/playground";
        String USR = "playground";
        String PWD = "playground2020";


        Connection conn = null;
        try {
            Class.forName(DRV);
            return DriverManager.getConnection(URL,USR,PWD);
        } catch (ClassNotFoundException cnf) {
            System.out.println("JDBC 드라이버 없음!!");
        } catch (SQLException sqle) {
            System.out.println("JDBC 연결실패");
        }
        return conn;
    }

    public static void destoryConn(Connection conn, PreparedStatement pstmt){
        if (pstmt != null) {
            try { pstmt.close(); } catch (SQLException ex) { }
        }
        if(conn != null)
            try{conn.close();} catch (SQLException ex){ }

    }

    public static void destoryConn(Connection conn, PreparedStatement pstmt, ResultSet rs) {
        if (rs != null)
            try { rs.close(); } catch (SQLException ex) { }


        destoryConn(conn,pstmt);
    }
}
