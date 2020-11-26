package semiproject;

import java.util.Scanner;

public class EmployeeV1Main {
    public static void main(String[] args) {
        EmployeeV1Service epsrv = new EmployeeV1Service();

        Scanner sc = new Scanner(System.in);
        String menu = "";

        while(true) { //메뉴 띄우고 작업번호 입력을 반복
            epsrv.displayMenu();
            menu = sc.nextLine();

            switch(menu) {
                case "1":
                    epsrv.newInSa();
                    break;
                case "2":
                    epsrv.readInSa();
                    break;
                case "3":
                    epsrv.readOneInsa();
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못입력!!");
            }
        }


    }
}
