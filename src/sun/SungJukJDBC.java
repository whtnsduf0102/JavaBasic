package sun;

public class SungJukJDBC extends JDBCUtil{

    public static String insertSungJuk =
            " insert into sungjuk (name, kor, eng, mat, tot, mean, grd) " +
                    "values ( ?,?,?,?,?,?,?);";
    public static  String selectSungJuk =
            " select sjno,name,kor,eng,mat, regdate from sungjuk order by sjno desc";
    public static String selectOneSungJuk =
            " select * from sungjuk where sjno = ?;";
    public static String updateSungJuk =
            "update sungjuk set kor=?,eng =?, mat = ?, tot= ?,mean = ?, grd = ?, regdate = sysdate() where sjno = ?";
    public static String deleteSungJuk =
            "delete from sungjuk where sjno = ?";
}
