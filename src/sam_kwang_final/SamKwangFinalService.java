package sam_kwang_final;

public class SamKwangFinalService {

    public void displayMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------\n")
                .append("삼광 관리 프로그램 v1\n")
                .append("-------------------\n")
                .append("1. 주문 정보 조회\n")
                .append("2. 배송 정보 조회\n")
                .append("3. ????????????\n")
                .append("4. ????????????\n")
                .append("5. ????????????\n")
                .append("0. 프로그램 종료\n")
                .append("-------------------\n")
                .append("원하시는 작업은 ? ");
        System.out.print(sb);
    }

    public void readCODP() {
        StringBuilder sb = new StringBuilder();
    }
}
