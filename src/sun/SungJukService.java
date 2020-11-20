package sun;

import java.util.Scanner;

/**
 * 파일명 : SungJukService
 * 작성일 : 2020.11.20
 *
 * 프로그램설명 : 성적처리프로그램 v5
 * 이름, 국어, 영어, 수학점수를 키보드로 입력받아
 * 총점, 평균, 학점을 계산하고 결과 출력
 * 단, 평균은 소수점 첫째 자리까지
 * 단, 학점기준은 '수우미양가'로 하되
 * switch문으로 학점 계산하도록함
 * 만점은 100점으로 10점 단위로 학점
 * 100~90, 89~80, 79~70, 69~60, 59~0
 * name, kor, eng, mat, sum, mean, grd
 */
public class SungJukService {
    /* 성적데이터 입력 메서드
    @return 키보드로 입력받은 성적데이터  SungJukVO*/
    public SungJukVO readSungJuk(){
        String name;
        int kor, eng, met;

        Scanner sc = new Scanner(System.in);

        System.out.print("이름 입력 : ");
        name = sc.nextLine();
        System.out.print("국어점수입력 : ");
        kor = sc.nextInt();
        System.out.print("영어점수입력 : ");
        eng = sc.nextInt();
        System.out.print("수학점수입력 : ");
        met = sc.nextInt();

        return new SungJukVO(name, kor, eng, met, 0, 0, ' ');
    } //readSungJuk

    /*입력받은 성적에 대하 총점, 평균, 학점을 계산하는 메서드*/
    public void computeSungJuk(SungJukVO sj){
        sj.setSum(sj.getKor() + sj.getEng() + sj.getMet());
        sj.setMean ( (double)sj.getSum() / 3);

        switch ((int)(sj.getMean()/10))
        {
            case 10 :
            case 9 : sj.setGrd('수'); break;
            case 8 : sj.setGrd('우'); break;
            case 7 : sj.setGrd('미'); break;
            case 6 : sj.setGrd('양'); break;
            default : sj.setGrd('가');
        }//switch
    } //computeSungJuk

    /*
    *입력한 이름, 국어, 영어, 수학점수와 계산된
    * 총점, 평균, 학점등을 출력하는 메서드 */
    public void printSungJuk(SungJukVO sj){
        String fmt = "이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n합계 : %d\n평균 : %.1f\n학점 : %s\n";

        String result = String.format(fmt, sj.getName(), sj.getKor(),
                sj.getEng(), sj.getMet(), sj.getSum(), sj.getMean(), sj.getGrd());


        System.out.println(result);

    }
}