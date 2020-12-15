package sun;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class JDBCMembers2 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "insert into bookmembers values (?,?,?,?)";

        Scanner sc = new Scanner(System.in);

        System.out.print("고객번호를 입력하세요 : ");
        int custid = Integer.parseInt(sc.nextLine());
        System.out.print("고객이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("고객주소를 입력하세요 : ");
        String addr = sc.nextLine();
        System.out.print("고객전화번호를 입력하세요 : ");
        String phone = sc.nextLine();

        conn = JDBCUtil.makeConn();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, custid);
            pstmt.setString(2, name);
            pstmt.setString(3, addr);
            pstmt.setString(4, phone);

            int cnt = pstmt.executeUpdate();
            if (cnt>0)
                System.out.println("고객정보 추가완료!");
        } catch (SQLException ex) {
            System.out.println("JDBC 질의문 생성 오류");
        }
        JDBCUtil.destoryConn(conn,pstmt);

    }
}
