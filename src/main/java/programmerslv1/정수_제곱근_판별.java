package programmerslv1;

import java.util.Scanner;

public class 정수_제곱근_판별 {

    public static void main(String[] args) {

    // 내 풀이 -> 144가 나와야 하는데 244가 나옴.
        long n = 121;
        long answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i * j == n) {
                    answer = (i + 1) * (j + 1);
                } else {
                    answer = -1;
                }

            }
            System.out.println(answer);
        }

        // 정답
//        for (int i = 1; i <= n; i++) {
//
//            if(i*i == n) {
//                answer = (i+1)*(i+1);
//                break;
//            } else {
//                answer = -1;
//            }
//        }
//        return answer;




    }
}
