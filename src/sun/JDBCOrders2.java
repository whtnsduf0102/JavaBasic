package sun;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCOrders2 {
        public static void main(String[] args) {
            // 1. 도서정보 입력
            Connection conn = null;
            PreparedStatement pstmt = null;
            String sql = "insert into bookorders values (?,?,?,?,?)";

            Scanner sc = new Scanner(System.in);


            System.out.print("주문번호를 입력하세요 : ");
            int orderid = Integer.parseInt(sc.nextLine());
            System.out.print("고객번호를 입력하세요 : ");
            int custid = Integer.parseInt(sc.nextLine());
            System.out.print("도서번호를 입력하세요 : ");
            int bookid = Integer.parseInt(sc.nextLine());
            System.out.print("가격을 입력하세요 : ");
            int saleprice = Integer.parseInt(sc.nextLine());
            System.out.print("주문날짜를 입력하세요 : ");
            String orderdate = sc.nextLine();

            conn = JDBCUtil.makeConn();
            try {
                pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, orderid);
                pstmt.setInt(2, custid);
                pstmt.setInt(3, bookid);
                pstmt.setInt(4, saleprice);
                pstmt.setString(5, orderdate);

                int cnt = pstmt.executeUpdate();
                if (cnt>0)
                    System.out.println("주문정보 추가완료!");
            } catch (SQLException ex) {
                System.out.println("JDBC 질의문 생성 오류");
            }

            JDBCUtil.destoryConn(conn,pstmt);


        }

    }

