package sun;

import java.util.Scanner;

/**
 * 파일명 : SungJukV4
 * 작성일 : 2020.11.17
 *
 * 프로그램설명 : 성적처리프로그램 v4
 * 학생 3명의 성적데이터를 키보드로 입력받아
 * 이름, 국어, 영어, 수학점수를 키보드로 입력받아
 * 총점, 평균, 학점을 계산하고 결과 출력
 * 단, 평균은 소수점 첫째 자리까지
 * 단, 학점기준은 '수우미양가'로 하되
 * switch문으로 학점 계산하도록함
 * 만점은 100점으로 10점 단위로 학점
 * 100~90, 89~80, 79~70, 69~60, 59~0
 * name, kor, eng, mat, sum, mean, grd
 *
 * 그리고 Math.round()이용해서
 * 평균 소수점 둘째자리까지 끊어서 출력
 * 학점계산시 스위치문으로
 *
 * 코드의 가독성과 유지보수를 용이하게 하기 위해
 * 메서드 기반 코드로 재작성
 */
public class SungJukV4 {
    public static void main(String[] args) {
        //배열변수선언
        //자료형 변수형[] = new 자료형[크기]
        String name[] = new String[3];
        int kor[] = new int[3];
        int eng[] = new int[3];
        int met[] = new int[3];
        int sum[] = new int[3];
        double mean[] = new double[3];
        char grd[] = new char[3];

        //처리
        readSungJuk(name, kor, eng, met);
        computeSungJuk(kor, eng, met, sum, mean, grd);

        //결과출력
        printSungJuk(name, kor, eng, met, sum, mean, grd);

    }//main

    //성적데이터 입력받기 : readSungJuk
    public static void readSungJuk(String[] name, int[] kor, int[] eng, int[] met) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "번째 학생 성적 입력");
            System.out.print("이름 입력 : ");
            name[i] = sc.nextLine();
            System.out.print("국어점수입력 : ");
            kor[i] = sc.nextInt();
            System.out.print("영어점수입력 : ");
            eng[i] = sc.nextInt();
            System.out.print("수학점수입력 : ");
            met[i] = sc.nextInt();

            sc.skip("\r\n|[\n\r]");
        }
    }

    //성적데이터 총점, 평균, 학점 처리 : computeSungJuk
    public static void computeSungJuk (int[] kor, int[] eng, int[] met,
                                       int[] sum, double[] mean, char[] grd) {
            for (int i = 0; i < 3; i++) {
                sum[i] = kor[i] + eng[i] + met[i];
                mean[i] = (double) sum[i] / 3;

                //학점 계산은 swicth문으로 처리
                switch ((int) (mean[i] / 10)) {
                    case 10:
                        grd[i] = '수';
                        break;
                    case 9:
                        grd[i] = '수';
                        break;
                    case 8:
                        grd[i] = '우';
                        break;
                    case 7:
                        grd[i] = '미';
                        break;
                    case 6:
                        grd[i] = '양';
                        break;
                    default:
                        grd[i] = '가';
                        break;
                }
            }
        }

    //처리결과 출력 : printSungJuk
    public static void printSungJuk(String[] name, int[] kor, int[] eng, int[] met,
                                    int[] sum, double[] mean, char[] grd) {

        String fmt = "이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n합계 : %d\n평균 : %s\n학점 : %c\n";

        for (int i = 0; i < 3; i++) {
            System.out.printf(fmt, name[i], kor[i], eng[i], met[i], sum[i], mean[i], grd[i]);
        }
    }

}//class