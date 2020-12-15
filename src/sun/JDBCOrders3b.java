package sun;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCOrders3b {
        public static void main(String[] args) {
            //도서제목으로 도서정보 조회
            Connection conn = null;
            PreparedStatement pstmt = null;
            ResultSet rs = null;
            String sql = "select * from bookorders where orderid = ?";
            String fmt = "%s %s %s %s %s \n";
            StringBuilder sb = new StringBuilder();

            Scanner sc = new Scanner(System.in);
            System.out.print("주문번호를 입력하세요 : ");
            int order = Integer.parseInt(sc.nextLine());


            conn = JDBCUtil.makeConn();
            try {
                pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, order);
                rs = pstmt.executeQuery();

                while(rs.next()){
                    String orderid = rs.getString(1);
                    String custid = rs.getString(2);
                    String bookid = rs.getString(3);
                    String saleprice = rs.getString(4);
                    String orderdate = rs.getString(5);
                    String result = String.format(fmt, orderid, custid, bookid,saleprice,orderdate);
                    sb.append(result);


                }
            } catch (SQLException throwables) {
                System.out.println();
            }

            JDBCUtil.destoryConn(conn,pstmt,rs);

            System.out.println(sb.toString());



        }

    }

