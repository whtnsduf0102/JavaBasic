package sun;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelloJDBC {
    /*JDBC
    * java database connectivity
    * 자바를 통해 다양한 관계형 데이터베이스에 접속하고
    * SQL 문을 실행해서 관리하도록 할떄
    * 사용하는 표준 SQL 인터페이스
    * 이것을 통해 데이터베이스 코드를 한번만 작성해 두면
    * 어떤 DBMS 라도 코드 변경없이 동일하게 작동시킬 수 있음
    * JDK 에 포함된 JDBC 인터페이스는
    * java.sql 패키지 아래에 있음
    *
    * 하지만, 이것만으로는 작동하지 않고
    * JDBC 인터페이스에 맞게 각 데이터베이스 제조사가
    * 구현한 JDBC 클래스들이 필요한데,
    * 이것을 JDBC 드라이버라고 함
    * JDBC 드라이버들은 제조사 홈페이지에서
    * 다운로드 할수 있음.
    *
    * mariadb.org -> Download MariaDB Connector/J */
    public static void main(String[] args) {
        // 1. JDBC 드라이버를 메모리에 적제함
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException cnf) {
            System.out.println("jdbc 드라이버를 설치하세요");
        }
        // 2. 데이터베이스 서버에 접속하기
        Connection conn = null;
        String url = "jdbc:mariadb://"+"mariadb.cyd7bdxnvkdi.ap-northeast-2.rds.amazonaws.com"+
                ":3306/playground";
        try {
            conn = DriverManager.getConnection
                    (url,
                    "playground","playground2020");
            if(!conn.isClosed())
                System.out.println("데이터베이스 접속성공");
        } catch (SQLException sqlex) {
            System.out.println("디비 접속 주소나 아이디/비번 확인하세요");
        }finally {
            if (conn != null) {
                try {conn.close(); } catch (SQLException sqlex) {  }
            }
        }

    }
}
