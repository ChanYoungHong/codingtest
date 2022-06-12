package problem1;

import java.util.Scanner;

public class BOJ_1463 {

    static int cnt;

    public static void main(String[] args) {
        // 어떤 방향성으로 할 지 고민하기.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(num >= 1){
            if(num == 1) {
                if(num%3 == 0){
                    num /= 3;
                    cnt++;
                } else if(num%2 == 0) {
                    num /= 2;
                    cnt++;
                } else {
                    num -= 1;
                    cnt++;
                }
                break;
            }
        }

        System.out.println(num);
        System.out.println(cnt);
    }

}
