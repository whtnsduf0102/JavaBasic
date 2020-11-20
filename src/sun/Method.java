package sun;

import java.util.Scanner;

/**
 * 파일명 : SungJukV4
 * 작성일 : 2020.11.18
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
 * 성적처리 기능을 구현함으로써 코드가 길어지고 내용파악이
 * 어려워 지는 것을 방지하기 위해 함수(메서드)로 재정의해서 코드를 개선함
 *
 */
public class Method {

    //메서드
    //특정작업으 수행하기 위해 작성한 명령어들의 묶음
    // C언어의 함수와 비슷한 성격을 가지는 프로그래밍 요소
    //입력값을 통해 무언가를 하고 그결과를 도출하는 수학의 함수(블렉박스)와 비슷한 개념
    //메서드의 목적
    //프로그램을 작성하다 보면 반복적으로 쓰린 코드를 종종 보는데,
    //효율적으로 작성하려면 반복문으로 처리하면 되지만 반복문이 반복 된다면
    //메서드를 적용하면 기능별로 모듈화를 적용할 수 있기 때문에 프로그램의 가독성이 좋아지고 협업시에도
    //유용하며 기능변경시 유지보수에도 좋음

    //메서드 정의
    //접근제한자 리턴값 메서드이름(타입 매개변수명){
    //  메서드 몸체
    //}
    public static void main(String[] args) {
     /*   //hello world!! 메세지 출력
        System.out.println("Hello, World!!");

        //hello world!! 3번 메세지 출력
        System.out.println("Hello, World!!");
        System.out.println("Hello, World!!");
        System.out.println("Hello, World!!");

        //hello world!! 3번 메세지 출력
        for(int i=0; i>3; i++)
        {
            System.out.println("Hello, World!!");
        }

        //메세지 3번 출력을 3번 반복하는 코드
        //메세지 변경함 : Hello, Java!!
        //Hello, World!! 를 Hello, Java!!로 변경

        //인사말 출력 메서드 호출(call)*/
        /*sayHello();
        sayHello2();
        sayHello3("Hello, World!!");
        sayHello3("Hello, Java!!");
        sayHello3("Hello, Android!!");
        String result = sayHello4("안녕하세요, 세상아!");
        System.out.println(result);
        computeNum(4,5);*/
        conputeAllSum(5,1);
        conputeAllSum2(5,1);

    }


  /*  //간단한 인사말 출력 메서드
    //public : 접근제한자, 외부클래스의 메서드 사용허가 여부
    //static : 정적 메서드, 객체생성없이 바로 사용가능 메서드
    //void : 메서드가 반환하는 값이 없음
    public static void sayHello()
    {
        System.out.println("Hello, World!!");
    }
    //간단한 인사말을 3번 출력하는 메서드 : sayHello2
    public static void sayHello2()
    {
        for(int i=0; i<3; i++){
            System.out.println("Hello, World!!");
        }
    }
    //간단한 인사말을 3번 출력하는 메서드 : sayHello3
    //단. 인삿말은 언제든 변경가능하도록 재작성
    //매개변수 : 메서드처리 시 필요하는 입력값
    //단, 인삿말 출력을 메서드가 바로하지않고
    // 호출한 대상으로 넘김

    public static void sayHello3( String msg )
    {
        System.out.println( msg );
    }
    //간단한 인사말을 3번 출력하는 메서드 : sayHello4
    //단. 인삿말은 언제든 변경가능하도록 재작성
    //단, 인삿말 출력을 메서드가 바로하지않고
    // 인삿말 생성 후 호출한 대상으로 넘김
    //return : 메서드내에서 처리한 값을 외부로 보내려면
    // return 이라는 명령문 사용
    // return시 값의 type과 메서드의 return type은 반드시 일치해야함
    public static String sayHello4( String name)
    {
        return name;
    }
    //두개의 정수를 매개변수로 선언하고
    //사칙연산한 결과를 출력하는 매서드 : computeNum
    // ? + ? = ?
    // ? - ? = ?
    // ? × ? = ?
    // ? ÷ ? = ?
    public static void computeNum(int i, int j)
    {
        System.out.println(i +"+"+ j +"="+ (i+j));
        System.out.println(i +"-"+ j +"="+ (i-j));
        System.out.println(i +"*"+ j +"="+ (i*j));
        System.out.println(i +"/"+ j +"="+ (i/j));
    }
*/
    //두개의 정수를 매개변수로 선언하고
    // 두정수를 변위로 설정해서 그것의 모든 합을
    //구하고 출력하는 메서드 : computeAllSum
    public static void conputeAllSum(int a, int b)
    {
        int sum=0;
        int min = a;
        int max = b;
        String fmt = "%d ~ %d 정수범위 총합 : %d\n";
        if(a > b){min=b; max =a;}
        for(int i=min; i<=max; i++) {
            sum +=i;

        }
        System.out.printf(fmt, min,max,sum);
    }

    public static void conputeAllSum2(int a, int b)
    {
        int sum=0;
        int min = a;
        int max = b;
        String fmt = "%d ~ %d 정수범위 총합 : %d\n";
        if(a > b){min=b; max =a;}
        sum = ((min+max)*(max-min+1))/2;
        System.out.printf(fmt, min,max,sum);
    }





}


