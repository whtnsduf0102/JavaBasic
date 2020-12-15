package sun;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCBookorders {
    // plaground 데이터베이스의 Members 테이블에
    // 새로운 회원정보를 입력하는 JDBC프로그램을 작성하세요
    // 컬럼정보 : orderid, cusrid,bookid,saleprice,orderdate
    // 입력은 Scanner 이용
    public static void main(String[] args) {
        //데이터베이스연결정보
        String DRV = "org.mariadb.jdbc.Driver";
        String URL = "jdbc:mariadb://mariadb.cyd7bdxnvkdi.ap-northeast-2.rds.amazonaws.com:3306/playground";
        String USR = "playground";
        String PWD = "playground2020";

        // JDBC 관련 객체변수
        Connection conn = null;
        Statement stmt = null;

        // 기타 객체변수
        Scanner sc= new Scanner(System.in);

        // 주문정보 입력받기
        System.out.println("주문번호는?");
        int orderid = Integer.parseInt(sc.nextLine());

        System.out.println("고객번호는?");
        int cusrid = Integer.parseInt(sc.nextLine());

        System.out.println("책번호는?");
        int bookid = Integer.parseInt(sc.nextLine());

        System.out.println("판매가격은?");
        int saleprice = Integer.parseInt(sc.nextLine());

        System.out.println("주문날짜는?");
        String orderdate = sc.nextLine();

        //쿼리문작성
        String sql = "insert into bookorders Values"+"("+orderid+","+cusrid+","+bookid+", "+saleprice+",'"+orderdate+"')";
        System.out.println(sql);


        //JDBC 드라이버초기화
        //JDBC Connection 객체생성
        //JDBC Statement 객체생성
        //SQL 문 실행 및 결과 확인
        //JDBC 관련객체제거

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









    }//main


}//class
