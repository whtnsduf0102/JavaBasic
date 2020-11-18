package lab;

import java.util.Scanner;

public class Q27_LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("년도를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();

        if(year%400==0);
        else if(year%4==0 && year%100!=0){
            System.out.println(year+"년도는 윤년입니다.");
        }
        else
            System.out.println(year+"년도는 윤년이 아닙니다.");
    }
}
