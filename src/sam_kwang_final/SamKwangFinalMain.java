package sam_kwang_final;

import java.util.Scanner;

public class SamKwangFinalMain {
    public static void main(String[] args) {
        SamKwangFinalService skfsrv = new SamKwangFinalService();
        Scanner sc = new Scanner(System.in);
        String menu = " ";

        while(true){
            skfsrv.displayMenu();
            menu = sc.nextLine();

            switch(menu) {
                case "1": skfsrv.readCODP(); break;
                case "2":  break;
                case "3":  break;
                case "4":  break;
                case "5":  break;
                case "0": System.exit(0); break;
                default:
                    System.out.println("잘못입력!!");
            }

        }
    }
}
