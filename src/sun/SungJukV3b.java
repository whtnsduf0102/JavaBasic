package sun;

import java.util.Scanner;

/**
 * 파일명 : SungJukV3
 * 작성일 : 2020.11.17
 *
 * 프로그램설명 : 성적처리프로그램 v3
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
 */
public class SungJukV3b {
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
        String fmt = "이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n합계 : %d\n평균 : %s\n학점 : %c\n";
        String result;


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
        }
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

        //Math.round(값)
        //98765.4321 => round => 98765
        //98765.4321*100 => 9876543.21
        //round(9876543.21) => 9876543
        //9876543/100 => 98765.43
        // mean = Math.round(mean * 100) / 100.0;

        //String.valueOf(값) 숫자를 문자로 변환
        for (int i = 0; i < 3; i++) {
            System.out.printf(fmt, name[i], kor[i], eng[i], met[i], sum[i], mean[i], grd[i]);


            //System.out.println("이름 : " + name + "\n국어 : " + kor + "\n영어 : " + eng + "\n수학 : " + met + "\n--------------\n총점 : " + sum + "\n평균 : " + mean + "\n학점 = " + grd);

        }
        //문자열 연결 연산자로 문장을 만드는경우에 String 변수의 특성때문에 성능저하 발생



    }

}
