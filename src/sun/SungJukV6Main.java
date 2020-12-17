package sun;

import java.util.Scanner;

/**
 * 파일명 : SungJukV6Main
 * 작성일 : 2020.11.23
 *
 * 프로그램 설명 : 성적처리프로그램 v6
 * 중간고사와 기말고사 성적처리 프로그램을 만들려고 함
 * SungJukV1을 토대로 중간고사와 기말고사 성적 클래스를
 * 상속을 이용해서 작성하세요
 *
 * 중간고사MidSungJuk : 국어kor,영어eng,수학mat
 * 기말고사FinalSungJuk : 국어,영어,수학,미술art,과학sci
 * 성적처리 : computeSungjuk
 * 결과출력 : printSungjuk
 *
 */
public class SungJukV6Main {
    public static void main(String[] args) {
        MidSungJuk msj = new MidSungJuk();

        //msj.readSungJuk();
        //msj.computeSungJuk();
        //msj.printSungJuk();

        FinalSungJuk fsj = new FinalSungJuk();
        fsj.readSungJuk();
        fsj.computeSungJuk();
        fsj.printSungJuk();
    }
}

class MidSungJuk {
    protected String name;
    protected int kor;
    protected int eng;
    protected int mat;
    protected int sum;
    protected double mean;
    protected char grd;

    public MidSungJuk() { }

    public MidSungJuk(
            String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        // sum = 0;
        // mean = 0.0;
        // grd = '가';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public double getMean() {
        return mean;
    }

    public void setMean(double mean) {
        this.mean = mean;
    }

    public char getGrd() {
        return grd;
    }

    public void setGrd(char grd) {
        this.grd = grd;
    }

    protected void readSungJuk() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        name = sc.nextLine();
        System.out.print("국어를 입력하세요 : ");
        kor = sc.nextInt();
        System.out.print("영어를 입력하세요 : ");
        eng = sc.nextInt();
        System.out.print("수학을 입력하세요 : ");
        mat = sc.nextInt();
    } // readSungJuk

    protected void computeSungJuk() {
        sum = kor + eng + mat;
        mean = (double)sum / 3;
        grd = (mean >= 90) ? '수':
                (mean >= 80) ? '우':
                (mean >= 70) ? '미':
                (mean >= 60) ? '양': '가';
    } // computeSungJuk

    protected void printSungJuk() {
        String fmt = "이름 : %s\n국어 : %d\n영어 : %d\n"
                + "수학 : %d\n총점 : %d\n평균 : %.1f\n"
                + "학점 : %c";
        String result = String.format(fmt,
               name, kor, eng, mat,
                sum, mean, grd);

        System.out.println(result);
    }
}

class FinalSungJuk extends MidSungJuk {
    protected int art;
    protected int sci;

    public FinalSungJuk() {  }

    public FinalSungJuk(
            String name, int kor, int eng, int mat,
            int art, int sci) {
        // 부모클래스에 정의된 멤버변수 초기화 코드를
        // super라는 이름으로 치환해서 호출할 수 있음
        // super(생성자 매개변수목록)
        //this.name = name;
        //this.kor = kor;
        //this.eng = eng;
        //this.mat = mat;
        super(name, kor, eng, mat);

        this.art = art;
        this.sci = sci;
    }

    public int getArt() {
        return art;
    }

    public void setArt(int art) {
        this.art = art;
    }

    public int getSci() {
        return sci;
    }

    public void setSci(int sci) {
        this.sci = sci;
    }

    @Override
    protected void readSungJuk() {
        // 부모클래스에 정의된 성적 입력코드를
        // super라는 이름으로 치환해서 호출할 수 있음
        // => super.메서드이름()
        super.readSungJuk();

        Scanner sc = new Scanner(System.in);
        System.out.print("미술을 입력하세요 : ");
        art = sc.nextInt();
        System.out.print("과학을 입력하세요 : ");
        sci = sc.nextInt();
    }

    @Override
    protected void computeSungJuk() {
        // 부모클래스에 정의된 총점 변수를
        // super라는 이름으로 치환해서 호출할 수 있음
        // super.멤버변수명
        // super.computeSungJuk();
        // sum = super.sum + sci + art;
        sum = kor + eng + mat + sci + art;
        mean = (double)sum / 5;
        grd = (mean >= 90) ? '수':
              (mean >= 80) ? '우':
              (mean >= 70) ? '미':
              (mean >= 60) ? '양': '가';
    }

    @Override
    protected void printSungJuk() {
        String fmt = "이름 : %s\n국어 : %d\n영어 : %d\n"
                + "수학 : %d\n과학 : %d\n미술 : %d\n"
                + "총점 : %d\n평균 : %.1f\n"
                + "학점 : %c";
        String result = String.format(fmt,
                name, kor, eng, mat, sci, art,
                sum, mean, grd);

        System.out.println(result);
    }

}






