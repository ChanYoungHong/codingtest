package programmerslv1;

import java.util.Scanner;

public class 짝수_홀수 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String answer;
//
//        if(num%2 ==0) {
//            answer = "Even";
//        } else {
//            answer = "Odd";
//        }
//        System.out.println(answer);

        answer = (num%2==0) ? "Even" : "Odd";
        System.out.println(answer);

    }
}
