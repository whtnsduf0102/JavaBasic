package sun;

import java.util.Scanner;

/**
 * 파일명 : SungJukV1
 * 작성일 : 2020.11.17
 *
 * 프로그램설명 : 성적처리프로그램 v1
 * 이름, 국어, 영어, 수학점수를 키보드로 입력받아
 * 총점, 평균, 학점을 계산하고 결과 출력
 * 단, 평균은 소수점 첫째 자리까지
 * 단, 학점기준은 '수우미양가'로 하되
 * switch문으로 학점 계산하도록함
 * 만점은 100점으로 10점 단위로 학점
 * 100~90, 89~80, 79~70, 69~60, 59~0
 * name, kor, eng, mat, sum, mean, grd
 *
 * 학점계산시 스위치문으로
 */
public class SungJukV2 {
    public static void main(String[] args) {

        String name;
        int kor=0, eng=0, met=0, sum = 0;
        double mean = 0;
        char grd;

        //성적데이터를 키보드로 입력받기 위해
        // Scanner 클래스 초기화

        Scanner sc = new Scanner(System.in);

        System.out.print("이름 입력 : ");
        name = sc.nextLine();
        System.out.print("국어점수입력 : ");
        kor = sc.nextInt();
        System.out.print("영어점수입력 : ");
        eng = sc.nextInt();
        System.out.print("수학점수입력 : ");
        met = sc.nextInt();
        sum = kor + eng + met;
        mean = sum / 3;

        //학점 계산은 swicth문으로 처리
        switch ((int)(mean/10))
        {
            case 10 : grd = '수'; break;
            case 9 : grd = '우'; break;
            case 8 : grd = '미'; break;
            case 7 : grd = '양'; break;
            default : grd = '가'; break;
        }

        //string.format(형식지정자,변수들
        mean= Double.parseDouble(
                String.format("%.1f", mean));


        System.out.println("이름 : "+ name);
        System.out.println("국어 : "+ kor);
        System.out.println("영어 : "+ eng);
        System.out.println("수학 : "+ met);
        System.out.println("--------------");
        System.out.println("총점 : "+ sum);
        System.out.println("평균 : "+ mean);
        System.out.println("학점 = "+grd);


    }
}
