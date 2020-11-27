package sun;


import java.io.*;

/**
 * 2차원 표형태의 데이터를 파일에 저장하기
 * */
public class FileReaderWriter2 {
    public static void main(String[] args) throws IOException {
        //학번,이름,주소,생년월일,학과명,교수등으로
        // 구성된 2차원 표 형태의 데이터를 student.dat 저장

        //어떤 학생의 기본정보
        int hakbun = 201350050;
        String name = "김태희";
        String addr = "경기도 고양시";
        String birth = " 1985.3.22";
        String dname = "컴퓨터";
        int prof = 504;

        //학생 기본정보를 student.dard에 저장함
        String fpath ="c:/java/student.dat";
        FileWriter fw = new FileWriter(fpath);

        //기본 정보를 저장할 형식 정의
        //각 항목들은 ,로 구분함
        String fmt ="%s,%s,%s,%s,%s,%s";
        String data = String.format(fmt, hakbun, name, addr, birth, dname, prof);

        fw.write(data);

        fw.close();

        //버퍼기능을 지원하는 Writer 사용하기
        fw = new FileWriter(fpath);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(data);

        bw.close();
        fw.close();


        /*과목번호 과목명 과목개요 담당교수 등으로
        * 구성괸 2차원 표형태의 데이터를 subject.dat에 저장*/
        String subno = "0205";
        String sub= "프로그래밍";
        String subgeyo = "자바프로그래밍";
        int prfe = 301;

        fpath = "c:/java/subject.dat";

        fw = new FileWriter(fpath);
        bw = new BufferedWriter((fw));

        String fmt1 ="%s,%s,%s,%s";
        data = String.format(fmt1, subno,sub, subgeyo, prfe);

        fw.write(data);

        fw.close();

        fw = new FileWriter(fpath);
        BufferedWriter bw1 = new BufferedWriter(fw);

        bw1.write(data);

        bw1.close();
        fw.close();

        //과목 정보가 저장된  파일을 읽어서
        //출력하기
        //과목번호 : ~~
        //과목이름 : ~~

        FileReader fr = new FileReader(fpath);
        BufferedReader br = new BufferedReader(fr);
        fmt = "과목번호 : %s\n과목명 : %s\n과목개요 : %s\n담당교수 : %s\n";
        while(br.ready()){
            String line = br.readLine();
            //System.out.println(line);

            //읽어온 데이터를 ,단위로 분리해서
            //배열변수에 저장
            String[] items = line.split(",");
            String result = String.format(fmt, items[0],items[1],items[2],items[3]);
            System.out.println(result);
        }
        br.close();
        fr.close();
    }
}
