package semiproject;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeV1Service
        extends EmployeeV1genericService {
    List<EmployeeVO> empdata = new ArrayList<>();

    @Override
    public void newInSa() {
        /*int empno;
        String fname;
        String email;
        String phone;
        String jobid;
        int mgrid;
        int deptid;
        int sal;
        double comm;
        String hdate;
        String lname;*/

        EmployeeVO emp = new EmployeeVO
                (0,"","","","","","",
                        0,0.0,0,0);

        Scanner sc =new Scanner(System.in);

        System.out.println("사번입력 : ");
        emp.setEmpno(Integer.parseInt(sc.nextLine()));

        System.out.println("성 입력 : ");
        emp.setFname(sc.nextLine());

        System.out.println("이름 입력: ");
        emp.setLname(sc.nextLine());

        System.out.println("이메일 입력 : ");
        emp.setEmail(sc.nextLine());

        System.out.println("전화번호 입력: ");
        emp.setPhone(sc.nextLine());

        System.out.println("입사일 입력: ");
        emp.setHdate(sc.nextLine());

        System.out.println("직책 입력 : ");
        emp.setJobid(sc.nextLine());

        System.out.println("월급 입력 : ");
        emp.setSal(Integer.parseInt(sc.nextLine()));

        System.out.println("커미션 입력 : ");
        emp.setComm(Double.parseDouble(sc.nextLine()));

        System.out.println("상사번호 입력 : ");
        emp.setMgrid(Integer.parseInt(sc.nextLine()));

        System.out.println("부서번호 입력 : ");
        emp.setDeptid(Integer.parseInt(sc.nextLine()));


        empdata.add(emp);



    }

    @Override
    public void readInSa() {

        String fmt = "%8s %8s %8s %8s %8s %8s\n";

        System.out.printf(fmt, "사번","성","이메일","직책","상사번호","부서번호");


        Iterator<EmployeeVO>iter = empdata.iterator();
        while(iter.hasNext()){
            EmployeeVO e = iter.next();
            System.out.printf(fmt, e.getEmpno(),e.getLname(),e.getEmail(),e.getJobid(),e.getMgrid(),e.getDeptid());
        }

    }

    @Override
    public void readOneInsa() {
        String fmt = "%8s  %8s %8s %8s %8s %8s %8s %8s %8s %8s %8s\n";

        EmployeeVO emp = new EmployeeVO();
        Scanner sc = new Scanner(System.in);
        System.out.println("조회할 사원번호 입력 : ");
        emp.setEmpno(Integer.parseInt(sc.nextLine()));

        for(EmployeeVO e : empdata){
            if(e.getEmpno() == emp.getEmpno()){
                emp=e;
            }
        }

        System.out.printf(fmt, emp.getEmpno(),emp.getFname(),emp.getLname(),
                emp.getEmail(),emp.getPhone(),emp.getHdate(),emp.getJobid(),
                emp.getSal(), emp.getComm(),emp.getMgrid(),emp.getDeptid());

    }

    public void displayMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("------------------------\n")
            .append("인사 관리 프로그램 v1\n")
            .append("------------------------\n")
            .append("1. 인사 정보 입력\n")
            .append("2. 인사 정보 조회\n")
            .append("3. 인사 정보 상세조회\n")
            .append("4. 인사 정보 수정\n")
            .append("5. 인사 정보 삭제\n")
            .append("0. 프로그램 종료\n")
            .append("------------------------\n")
            .append("원하시는 작업은 ?");
        System.out.print(sb);

    }






    }
