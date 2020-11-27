package semiproject;

import sun.SungJukVO;

import java.io.*;

public class EmployeeV2Service extends EmployeeV1Service {

    private String fpath = "c:/Java/Employee.dat";
    private FileReader fr = null;
    private FileWriter fw = null;
    private BufferedReader br = null;
    private BufferedWriter bw = null;

    public EmployeeV2Service(){
        try {
            loadInSa();
        } catch (IOException e) {
            System.out.println("오류");
            e.printStackTrace();
        }
    }




    public void displayMenu()
    {
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

    @Override
    public void newInSa() {
        super.newInSa();

        try{
            writeEmployee(emp);
        } catch (IOException e) {
            System.out.println("파일쓰기중 오류!");
            e.printStackTrace();
        }
    }

    protected void writeEmployee(EmployeeVO em) throws IOException {
        String fmt = "%d,%s,%s,%s,%s,%s,%s,%d,%.1f,%d,%d";

        fw = new FileWriter(fpath, true);
        bw = new BufferedWriter(fw);

        String data = String.format(fmt, em.getEmpno(),em.getFname(),em.getLname(),
                em.getEmail(),em.getPhone(),em.getHdate(),em.getJobid(),
                em.getSal(), em.getComm(),em.getMgrid(),em.getDeptid());

        bw.newLine();
        bw.write(data);

        bw.close();
        fw.close();
    }

    protected void loadInSa() throws IOException {
        fr = new FileReader(fpath);
        br = new BufferedReader(fr);

        while (br.ready()) {
            String s[] = br.readLine().split(",");

            emp = new EmployeeVO(Integer.parseInt(s[0]), s[1], s[2],
                    s[3], s[4],s[5],s[6],Integer.parseInt(s[7]), Double.parseDouble(s[8]),
                    Integer.parseInt(s[9]),Integer.parseInt(s[10]));

            empdata.add(emp);
        }

        br.close();
        fr.close();
    }








}//class
