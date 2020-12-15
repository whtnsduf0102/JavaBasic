package sun;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
// plaground 데이터베이스의 Members 테이블에
// 새로운 회원정보를 입력하는 JDBC프로그램을 작성하세요
// 컬럼정보 : custid, name,address,phone
// 입력은 Scanner 이용
public class JDBCMembers {

    public static void main(String[] args) {
        // 데이터베이스연결정보
        String DRV = "org.mariadb.jdbc.Driver";
        String URL = "jdbc:mariadb://mariadb.cyd7bdxnvkdi.ap-northeast-2.rds.amazonaws.com:3306/playground";
        String USR = "playground";
        String PWD = "playground2020";

        //회원정보입력
        Scanner sc= new Scanner(System.in);
        System.out.println("고객번호는?");
        int custid = Integer.parseInt(sc.nextLine());

        System.out.println("고객이름은?");
        String name = sc.nextLine();

        System.out.println("고객주소는?");
        String address = sc.nextLine();

        System.out.println("전화번호는?");
        String phone = sc.nextLine();

        //질의문 작성
        String sql = "insert into bookmembers Values"+"("+custid+",'"+name+"','"+address+"', '"+phone+"')";
        System.out.println(sql);





        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(DRV);
            conn= DriverManager.getConnection(URL,USR,PWD);
            stmt = conn.createStatement();
            int cnt = stmt.executeUpdate(sql);
            if(cnt>0)
                System.out.println("데이터추가완료");
        } catch (ClassNotFoundException cnf) {
            System.out.println("JDBC 드라이버 없음!!");
        }catch (SQLException se) {
            System.out.println("디비주소나 아이디비번 확인!!");
        } finally {
            if (stmt != null) {
                try { stmt.close(); } catch (SQLException se) { }
            }
            if(conn != null)
                try{conn.close();} catch (SQLException se){ }
        }










    } // main
} // class
