package sun;

/**
 * 파일명 : SungJukV1
 * 작성일 : 2020.11.17
 *
 * 프로그램설명 : 성적처리프로그램 v1
 * 이름, 국어, 영어, 수학점수를 설정하면
 * 총점, 평균, 학점을 계산하고 결과 출력
 * 단, 학점기준은 '수우미양가'로 함
 * 만점은 100점으로 10점 단위로 학점
 * 100~90, 89~80, 79~70, 69~60, 59~0
 * name, kor, eng, mat, sum, mean, grd
 *
 * 삼항연산자 : (조건식)? 참일때처리 거짓일떄 결과값
 */
public class SungJukV1 {
    public static void main(String[] args) {
        String name = "sun";
        int kor = 99, eng = 98, met = 99, sum = 0;
        double mean = 0;
        char grd;
        sum = kor + eng + met;
        mean = sum / 3;
        grd = (mean >= 90) ? '수':
              (mean >= 90) ? '우':
              (mean >= 90) ? '미':
              (mean >= 90) ? '양':'가';



        System.out.printf("이름 : %s \n",name);
        System.out.printf("국어 =%3d\n영어 =%3d\n수학 =%3d\n",kor,eng,met);
        System.out.println("--------------------");
        System.out.printf("총점 = %3d\n평균 = %.1f\n",sum,mean);


      if(mean==100)
      {
          grd = '만';
          System.out.println("성적 = " + grd+"점");
      }
      else if(mean<=99 && mean>90)
      {
          grd = '수';
          System.out.println("성적 = " + grd);
      }
      else if(mean<=99 && mean>=90)
      {
          grd = '우';
          System.out.println("성적 = " + grd);
      } else if(mean<=89 && mean>=80)
      {
          grd = '미';
          System.out.println("성적 = " + grd);
      } else if(mean<=79 && mean>=70)
      {
          grd = '양';
          System.out.println("성적 = " + grd);
      } else
      {
          grd = '가';
          System.out.println("성적 = " + grd);
      }

    }
}
