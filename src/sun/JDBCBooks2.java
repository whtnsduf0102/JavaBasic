package sun;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCBooks2 {
    /*statement VS preparedStatement
    * 정적쿼리문과 동적쿼리문
    * 정적쿼리문은 사용하기전에 변수들을 이용해서
    * 온전한 형태의 문장을 미리 만들어 둬야함
    * 또한, 쿼리문이 실행될때 매번 1)쿼리문장 분석 2)컴파일
    * 3)실행의 과정을 거쳐야 함 -> 성능저하
    *
    * 반면, 동적쿼리문은 불완전한 형태의 문장을 먼저 만들어두고
    * 실행전에 매개변수에 실제로 전달할 값을 지정할 수 있음
    * 또한, 캐쉬기능을 지원하기 때문에 반복적으로 실행하는
    * 문장의 경우 1) 2) 과정을 건너뛰고 바로 3)으로 바로 갈수 있음
    *
    * PreparedStatement IN/OUT 매개변수
    * placeholder 매개변수, binding 매개변수라고 함
    * sql 질의문 객체 생서이 사용하는 매개변수는 ?로 표기
    * IN 매개변수는 질의문생성시 입력값 대용으로 사용
    * OUT 매개변수는 질의문을 실행하고 넘겨주는 결과값을 받을때 사용
    * java  -> ?,?
    * python ->  %s, %d
    * c# -> @name @passwd
    * oracle -> :1, :2  */





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

    public static void main(String[] args) {
        //데이터베이스 관련변수
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "insert into books Values"+"(?,?,?,?)";

        // 도서정보 입력받음
        Scanner sc = new Scanner(System.in);
        System.out.println("도서번호는?");
        int bookid = Integer.parseInt(sc.nextLine());
        System.out.println("도서제목는?");
        String bookname = sc.nextLine();
        System.out.println("도서출판사는는?");
        String publisher = sc.nextLine();
        System.out.println("도서가격은?");
        int price = Integer.parseInt(sc.nextLine());

        //입력받은 도서정보를 테이블에 저장
        conn = makeConn();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, bookid);
            pstmt.setString(2, bookname);
            pstmt.setString(3, publisher);
            pstmt.setInt(4, price);

            int cnt = pstmt.executeUpdate();
            if(cnt >0) System.out.println("도서정보추가완료!");
        } catch (SQLException ex) {
            System.out.println("JDBC 질의문 생성오류");
        }
        destoryConn(conn, pstmt);
    }
}
