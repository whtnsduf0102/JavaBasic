package semiproject;

import java.util.Scanner;

public class EmployeeV2Main {
    public static void main(String[] args) {
        EmployeeV2Service empsrv = new EmployeeV2Service();

        Scanner sc = new Scanner(System.in);
        int menu = 0;

                while(true) {
                    empsrv.displayMenu();
                    menu = sc.nextInt();

                    switch (menu){
                        case 1 : empsrv.newInSa(); break;
                        case 2 : empsrv.readInSa(); break;
                        case 3 : empsrv.readOneInsa(); break;
                        case 4 : break;
                        case 5 : break;
                        case 0 : System.exit(0); break;
                        default:
                            System.out.println("잘못입력!!");
                    }
                }
    }
}
