package semiproject;

import sun.SungJukVO;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeV3Service {

    public void displayMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------\n")
                .append("인사 관리 프로그램 v3\n")
                .append("-------------------\n")
                .append("1. 인사 정보 입력\n")
                .append("2. 인사 정보 조회\n")
                .append("3. 인사 정보 상세조회\n")
                .append("4. 인사 정보 수정\n")
                .append("5. 인사 정보 삭제\n")
                .append("0. 프로그램 종료\n")
                .append("-------------------\n")
                .append("원하시는 작업은 ? ");
        System.out.print(sb);
    }

    public void readEmployee() {
        StringBuilder sb = new StringBuilder();
        String fmt = "%10s %10s %10s %10s %10s %10s\n";

        String result = String.format(fmt,
                "empno","lname","email","jobid","mgrid","deptid"); // 제목출력
        sb.append(result);

        ArrayList<EmployeeVO> emps = EmployeeV3DAO.selectEmp();

        for (EmployeeVO emp : emps) {
            result = String.format(fmt, emp.getEmpno(),emp.getLname(),emp.getEmail(),
                    emp.getJobid(), emp.getMgrid(), emp.getDeptid());
            sb.append(result);
        }

        System.out.println(sb.toString());
    }

    public void newEmployee() {

        EmployeeVO emp = new EmployeeVO
                (0,"","","","","","",
                        0,0.0,0,0);
        Scanner sc =new Scanner(System.in);

        System.out.print("사번입력 : ");
        emp.setEmpno(Integer.parseInt(sc.nextLine()));

        System.out.print("성 입력 : ");
        emp.setFname(sc.nextLine());

        System.out.print("이름 입력: ");
        emp.setLname(sc.nextLine());

        System.out.print("이메일 입력 : ");
        emp.setEmail(sc.nextLine());

        System.out.print("전화번호 입력: ");
        emp.setPhone(sc.nextLine());

        System.out.print("입사일 입력: ");
        emp.setHdate(sc.nextLine());

        System.out.print("직책 입력 : ");
        emp.setJobid(sc.nextLine());

        System.out.print("월급 입력 : ");
        emp.setSal(Integer.parseInt(sc.nextLine()));

        System.out.print("커미션 입력 : ");
        emp.setComm(Double.parseDouble(sc.nextLine()));

        System.out.print("상사번호 입력 : ");
        emp.setMgrid(Integer.parseInt(sc.nextLine()));

        System.out.print("부서번호 입력 : ");
        emp.setDeptid(Integer.parseInt(sc.nextLine()));


        String result = EmployeeV3DAO.insertEmp(emp);
        System.out.println(result);
    }

    public void readOneEmployee() {
        String fmt = "%10s  %10s %10s %10s %10s %10s %10s %10s %10s %10s %10s\n";

        Scanner sc = new Scanner(System.in);
        System.out.println("조회할 사원번호 입력 : ");
        String empid = sc.nextLine();

        EmployeeVO emp = EmployeeV3DAO.selectOneEmp(empid);

        String result = String.format(fmt,emp.getEmpno(),
                emp.getFname(),emp.getLname(),emp.getEmail(),
                emp.getPhone(),emp.getHdate(),emp.getSal(),emp.getJobid(),
                emp.getComm(), emp.getMgrid(),emp.getDeptid());
        System.out.println(result);
    }

    public void modifyEmployee() {
        Scanner sc = new Scanner(System.in);
        EmployeeVO emp = new EmployeeVO();


        System.out.print("수정할 사원번호는?");
        emp.setEmpno(Integer.parseInt(sc.nextLine()) );
        System.out.print("수정할 이름은?");
        emp.setFname(sc.nextLine());
        System.out.print("수정할 성은?");
        emp.setLname(sc.nextLine());
        System.out.print("수정할 이메일은?");
        emp.setEmail(sc.nextLine());
        System.out.print("수정할 전화번호는?");
        emp.setPhone(sc.nextLine());
        System.out.print("수정할 입사일은?");
        emp.setHdate(sc.nextLine());

        String result = EmployeeV3DAO.updateEmp(emp);
        System.out.println(result);

    }

    public void removeEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("삭제할 사원번호는?");
        int empid = sc.nextInt();

        String result = EmployeeV3DAO.deleteEmp(empid);
        System.out.println(result);

    }
}
