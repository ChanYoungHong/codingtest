package programmerslv1;

import java.util.Scanner;

public class 하샤드_수 {

    static int x,a,b;
    static boolean answer;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        a = x/10;
        b = x%10;

        if(x%(a+b) == 0) {
            answer = true;
        } else{
            answer = false;
        }

        System.out.println(answer);

    }
}
