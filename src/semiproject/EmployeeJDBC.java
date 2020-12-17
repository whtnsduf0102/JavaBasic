package semiproject;

import sun.JDBCUtil;

public class EmployeeJDBC extends JDBCUtil {

    public static String insertEmp =
            "insert  into EMPLOYEES values (?,?,?,?,?,?,?,?,?,?,?)";

    public static String selectEmp =
        " select employee_id,last_name,email,job_id,manager_id,department_id " +
        " from EMPLOYEES ";

    public static String selectOneEmp =
            "select * from EMPLOYEES where employee_id = ?";

    public static String updateEmp =
            "update EMPLOYEES set first_name = ?, last_name =? , email = ? , phone_number = ?,hire_date = ? where employee_id = ?";


    public static String deleteEmp = "delete from EMPLOYEES where employee_id = ?";



}
