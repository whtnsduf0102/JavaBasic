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


        System.out.print("이름 입력 : ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();

        System.out.print("국어점수입력 : ");
        Scanner scanner1 = new Scanner(System.in);
        kor = scanner.nextInt();

        System.out.print("영어점수입력 : ");
        Scanner scanner2 = new Scanner(System.in);
        eng = scanner.nextInt();

        System.out.print("수학점수입력 : ");
        Scanner scanner3 = new Scanner(System.in);
        met = scanner.nextInt();

        sum = kor + eng + met;
        mean = sum / 3;


        grd = (mean >= 90) ? '수':
                (mean >= 80) ? '우':
                        (mean >= 70) ? '미':
                                (mean >= 60) ? '양':'가';

        switch (grd)
        {
            case '수' :
                break;

            case '우' :
                break;

            case '미' :
                break;

            case '양' :
                break;

            case '가' :
                break;

        }


        System.out.printf("이름 : %s \n",name);
        System.out.printf("국어 =%3d\n영어 =%3d\n수학 =%3d\n",kor,eng,met);
        System.out.println("--------------------");
        System.out.printf("총점 = %3d\n평균 = %.1f\n",sum,mean);
        System.out.println("학점 = "+grd);


    }
}
