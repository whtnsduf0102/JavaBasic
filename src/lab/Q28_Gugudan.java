package lab;

import java.util.Scanner;

public class Q28_Gugudan
{
    public static void main(String[] args)
    {
        int dan;
        int ans;

        System.out.println("단을입력하세요");
        Scanner sc = new Scanner(System.in);
        dan = sc.nextInt();

        if(dan>0 && dan<10) {
            for (int times=0; times < 10; times++) {
                ans = dan*times;

                System.out.println(dan + "X" + times + "=" + ans);
            }
        }

        else {
            System.out.println("잘못 입력하셨습니다!!");
        }

    }

}
