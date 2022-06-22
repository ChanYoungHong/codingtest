package programmerslv1;

import java.util.Scanner;

public class 콜라츠_추측 {

    public static void main(String[] args) {
        long answer = 0;
        int cnt = 0;

        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();

        while(num != 1){

            if(num%2 == 0){
                num = num/2;
            } else if(num%3 == 0){
                num = (num*3) + 1;
            }
            cnt++;

            if(cnt > 500){
                cnt = -1;
                break;
            }
        }
        System.out.println(answer);
        System.out.println(cnt);


    }
}
