package problem1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class question1 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1]; 
        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + 1;

            if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1);
        }
        System.out.println(dp[N]);
    }
}


//        int ans = 0;
//        int cnt = 0;
//
//        while (a > 0) {
//            if (a % 3 == 0) {
//                ans = a / 3;
//            } else if (a % 2 == 0) {
//                ans = a / 2;
//            } else {
//                ans = (a - 1);
//            }
//            System.out.println(ans);
//        }
//    }
//}
