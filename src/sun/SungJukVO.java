package sun;
/**
 * 파일명 : SungJukV5
 * 작성일 : 2020.11.20
 *
 * 프로그램설명 : 성적처리프로그램 V5
 * 이름, 국어, 영어, 수학점수를 키보드로 입력받아
 * 총점, 평균, 학점에 관한 변수를 정의한 클래스
 *
 */
public class SungJukVO {
    private String name;
    private int kor;
    private int eng;
    private int mat;
    private  int sum;
    private double mean;
    private char grd;

    public SungJukVO() {
    }

    public SungJukVO(String name, int kor, int eng, int mat, int sum, double mean, char grd) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.sum = sum;
        this.mean = mean;
        this.grd = grd;
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

    public void setMat(int met) {
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
