package sun;

import java.util.Scanner;

/**
 * 파일명 : SungJukV2b
 * 작성일 : 2020.11.17
 *
 * 프로그램 설명 : 성적처리프로그램 v2b
 * 이름,국어,영어,수학점수를 키보드로 입력받아
 * 총점,평균,학점을 계산하고 결과 출력
 *
 * 단, 평균은 소수점 첫째 자리까지 출력하고
 * 학점기준은 '수우미양가'로 하되
 * switch문으로 학점을 계산하도록 함
 *
 * 만점은 100점, 100~90, 89~80,
 * 79~70, 69~60, 59~0기준으로 학점부여
 * name, kor, eng, mat, sum, mean, grd
 *
 * 단, 성적처리 결과 출력시 출력문을 하나만 사용
 * 그리고, Math.round(값)를 이용해서
 * 평균은 소수점 둘째자리까지 끊어서 출력함
 *
*/
public class SungJukV2b {
    public static void main(String[] args) {
        // 변수선언
        String name;
        int kor;
        int eng;
        int mat;
        int sum;
        double mean;
        char grd;
        String fmt =
            "이름 : %s\n국어 : %d\n영어 : %d\n"
            + "수학 : %d\n총점 : %d\n평균 : %s\n"
            + "학점 : %c";
        String result;

        // 처리
        // 성적데이터를 키보드로 입력받기 위해
        // Scanner 클래스 초기화
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        name = sc.nextLine();
        System.out.print("국어를 입력하세요 : ");
        kor = sc.nextInt();
        System.out.print("영어를 입력하세요 : ");
        eng = sc.nextInt();
        System.out.print("수학을 입력하세요 : ");
        mat = sc.nextInt();

        sum = kor + eng + mat;
        mean = (double)sum / 3;
        switch((int)(mean/10)) {
            case 10:
            case 9: grd = '수'; break;
            case 8: grd = '우'; break;
            case 7: grd = '미'; break;
            case 6: grd = '양'; break;
            default: grd = '가';
        }
        // Math.round(값) : 반올림하는 메서드
        // 98765.4321 => round => 98765
        // 98765.4321 x 100 => 9876543.21
        // round(9876543.21) => 9876543
        // 9876543 / 100 => 98765.43
        mean = Math.round(mean * 100) / 100.0;

        // String.valueOf(값)
        // 숫자를 문자로 변환
        result = String.format(
                fmt, name, kor, eng, mat,
                sum, String.valueOf(mean), grd);

        // 결과출력
        //System.out.println("이름 : " + name);
        //System.out.println("국어 : " + kor);
        //System.out.println("영어 : " + eng);
        //System.out.println("수학 : " + mat);
        //System.out.println("----------");
        //System.out.println("총점 : " + sum);
        //System.out.println("평균 : " + mean);
        //System.out.println("학점 : " + grd);
        //System.out.println(
        //     "이름 : " + name + "\n" +
        //     "국어 : " + kor + "\n" +
        //     "영어 : " + eng + "\n" +
        //     "수학 : " + mat + "\n" +
        //     "총점 : " + sum + "\n" +
        //     "평균 : " + mean + "\n" +
        //     "학점 : " + grd );
        // 문자열 연결 연산자(+)로 문장을 만드는 경우
        // String 변수의 특성때문에 성능저하 발생
        System.out.println(result);
    }
}
