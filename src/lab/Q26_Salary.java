package lab;

import java.util.Scanner;

public class Q26_Salary {
    public static void main(String[] args) {
    int salary=0;
    int marry;

        System.out.println("결혼여부(1:미혼, 2:결혼) 선택");
        Scanner scanner = new Scanner(System.in);
        marry = scanner.nextInt();

        System.out.println("연봉 입력");
        Scanner scanner2 = new Scanner(System.in);
        salary = scanner2.nextInt();

        switch (marry)
        {
            case 1:
                if (salary < 3000)
                {
                    System.out.println("당신의 세율은 10% 입니다.");
                    System.out.println("납부할 금액은 " + (salary * 0.1) + "원 입니다.");
                    break;
                }
                else if (salary>=3000)
                {
                    System.out.println("당신의 세율은 25% 입니다.");
                    System.out.println("납부할 금액은 " + (salary * 0.25) + "원 입니다.");
                    break;
                }
            case 2 :
                if(salary < 6000)
                {
                    System.out.println("당신의 세율은 15% 입니다.");
                    System.out.println("납부할 금액은 " + (salary * 0.15) + "원 입니다.");
                    break;
                }
                else if (salary >= 6000)
                {
                    System.out.println("당신의 세율은 35% 입니다.");
                    System.out.println("납부할 금액은 " + (salary * 0.35) + "원 입니다.");
                    break;
                }
        }
    }
}
