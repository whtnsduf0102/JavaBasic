package sun;

import java.util.Scanner;

/**
 * 파일명 : SungJukV7Main
 * 작성일 : 2020.11.23
 *
 * 프로그램설명 : 성적처리프로그램 V7
 * 중간고사와 기말고사 성적처리프로그램을 만들려고 함
 * SungJukV6을 토대로 중간고사성적과 기말고사 성적 클래스를
 * 인터페이스를 이용해서 작성하세요
 *
 * 부모클래스는 SungJukV7
 * 인터페이스 ISungJukV6
 * 중간고사MidSungJuk2 : 국어, 영어, 수학
 * 기말고사FinalSungJuk2 : 국어, 영어, 수학, 미술art, 과학sci
 * 성적입력 : readSungJuk
 * 성적처리 : computeSungJuk
 * 결과출력 : printSungJuk
 */

public class SungJuk7Main {
    public static void main(String[] args) {
        /*MidSungJuk2 msj2 = new MidSungJuk2();
        msj2.readSungJuk();
        msj2.computeSungJuk();
        msj2.printSungJuk();*/

        FinalSungJuk2 fsj2 = new FinalSungJuk2();
        fsj2.readSungJuk();
        fsj2.computeSungJuk();
        fsj2.printSungJuk();
    }
}
abstract class SungJuk7 {
    protected String name;
    protected int kor;
    protected int eng;
    protected int mat;
    protected int sum;
    protected double mean;
    protected char grd;

    public SungJuk7() {
    }

    public SungJuk7(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
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
}

interface ISungJukV7{
    void readSungJuk();
    void computeSungJuk();
    void printSungJuk();
}

class MidSungJuk2 extends SungJuk7 implements ISungJukV7{

    @Override
    public void readSungJuk() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 입력 : ");
        name = sc.nextLine();
        System.out.print("국어점수입력 : ");
        kor = sc.nextInt();
        System.out.print("영어점수입력 : ");
        eng = sc.nextInt();
        System.out.print("수학점수입력 : ");
        mat = sc.nextInt();
    }

    @Override
    public void computeSungJuk() {
        sum = kor + eng + mat;
        mean = (double)sum / 3;
        grd = (mean >= 90) ? '수':
                (mean >= 80) ? '우':
                        (mean >= 70) ? '미':
                                (mean >= 60) ? '양':'가';
    }

    @Override
    public void printSungJuk() {
        String fmt = "이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n합계 : %d\n평균 : %.1f\n학점 : %s\n";

        String result = String.format(fmt, name, kor,
                eng, mat, sum, mean, grd);


        System.out.println(result);
    }
}

class FinalSungJuk2 extends SungJuk7 implements ISungJukV7{

    protected int art;
    protected int sci;

    public FinalSungJuk2() {
    }

    public FinalSungJuk2(int art, int sci) {
        this.art = art;
        this.sci = sci;
    }
    @Override
    public void readSungJuk() {

        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        name = sc.nextLine();
        System.out.print("국어점수입력 : ");
        kor = sc.nextInt();
        System.out.print("영어점수입력 : ");
        eng = sc.nextInt();
        System.out.print("수학점수입력 : ");
        mat = sc.nextInt();
        System.out.print("미술점수입력 : ");
        art = sc.nextInt();
        System.out.print("과학점수입력 : ");
        sci = sc.nextInt();
    }

    @Override
    public void computeSungJuk() {
        sum = kor + eng + mat + art + sci;
        mean = (double)sum / 5;
        grd = (mean >= 90) ? '수':
                (mean >= 80) ? '우':
                        (mean >= 70) ? '미':
                                (mean >= 60) ? '양':'가';
    }

    @Override
    public void printSungJuk() {
        String fmt = "이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n" +
                "미술 : %d\n과학 : %d\n합계 : %d\n평균 : %.1f\n학점 : %s\n";

        String result = String.format(fmt, name, kor,
                eng, mat, art, sci, sum, mean, grd);

        System.out.println(result);
    }
}