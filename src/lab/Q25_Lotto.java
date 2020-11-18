package lab;

import java.util.Scanner;

public class Q25_Lotto {
    public static void main(String[] args) {
        int [] num = new int[3];
        int [] lottokey = new int[3];
        int i,j;
        //사용자 입력번호 저장
        for( i=0; i<3; i++)
        {
            System.out.printf("%d 번째 번호를 입력하세요( 1~45 ) : ",i+1);
            Scanner scanner = new Scanner(System.in);
            num[i] = scanner.nextInt();
            if(num[i]<1 || num[i]>45)
            {
                System.out.printf("번호는 1부터 45까지만 입력하세요( 1~45 )\n",i+1);
                i--;
                continue;
            }
            if(i>0)
            {
                for( j=0; j<i; j++)
                {
                    if(num[i] == num[j])
                    {
                        System.out.printf("번호는 중복되어서는 안됩니다.\n");
                        i--;
                        break;
                    }
                }
            }
        }
        System.out.printf("\n------번호출력------\n");
        for(i=0; i<3; i++)
        {
            System.out.printf("%6d", num[i]);
        }
        System.out.printf("\n------------------");




        //당첨 번호 저장
        for(i=0; i<3; i++)
        {
            lottokey[i] = (int)(Math.random()*45)+1;
            if(i>0)
            {
                for( j=0; j>3; j++)
                {
                    if(lottokey[i] == lottokey[j])
                    {
                        System.out.printf("번호는 중복되어서는 안됩니다.\n");
                        i--;
                        break;
                    }
                }
            }
        }
        System.out.printf("\n");
        System.out.printf("\n-----당첨 번호 출력-----\n");
        for(i=0; i<3; i++)
        {
            System.out.printf("%6d", lottokey[i]);

        }
        System.out.printf("\n-------------------\n");



        //맞춘 개수 검사
        int cnt =0;
        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                if (num[i] == lottokey[j])
                {
                    cnt++;
                }
            }
        }


        if(cnt == 3) {
            System.out.printf("상금100만원 지급\n");
        }
        else
        {
            System.out.printf("다음기회에.\n");
        }

    }

}






