package sun;
/*
* 로그인 확인 프로그램
* 0.인증용 아이디와 비밀번호를 하나 생성해둠
* => Id = abc123 pw =987xyz
* 1.Scanner로 아이디,비밀번호 입력받음
* 2a. 아이디와 비밀번호가 틀리면 "가입되지 않은 아이디!"
* 2b. 아이디만 맞으면 "비밀번호가 틀렸음!"
* 2c. 아이디와 비밀번호가 맞으면 "로그인 성공!"*/

import java.util.Scanner;

public class LoginMe {
    public static void main(String[] args) {
        String uid = "abc123";
        String pwd = "987xyz";
        String myuid = "";
        String mypwd = "";

        while (true) {
        System.out.print("아이디 입력 :");
        Scanner sc = new Scanner(System.in);
        myuid = sc.nextLine();
        System.out.print("비밀번호 입력 : ");
        Scanner sc2 = new Scanner(System.in);
        mypwd = sc2.nextLine();


            if (!uid.equals(myuid) && pwd.equals(mypwd)) {
                System.out.println("가입되지않은 아이디");
            } else if (uid.equals(myuid) && !pwd.equals(mypwd)) {
                System.out.println("비밀번호가 틀렷음");
            } else if (uid.equals(myuid) && pwd.equals(mypwd)) {
                System.out.println("로그인 성공");
                break;
            }
        }

    }
}

