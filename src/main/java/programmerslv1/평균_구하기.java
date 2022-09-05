package programmerslv1;

import java.util.Scanner;

public class 평균_구하기 {

    static int[] arr;
    static double answer;

    public static void main(String[] args) {

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        answer = answer/(double)arr.length;
//        return answer;
        System.out.println(answer);
    }
}
