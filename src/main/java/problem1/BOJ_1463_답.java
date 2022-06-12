package problem1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1463_답 {

    static int[] dp;
    static int num;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); // 아마 하나씩 읽어 드리기 위해서 사용하는 것으로 기억.... 아마

        dp = new int[num+1];
        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= num; i++) {

            dp[i] = dp[i-1] + 1;
            if(i % 2 == 0) dp[i] = Math.min(dp[i], dp[i/2]+1);
            if(i % 3 == 0) dp[i] = Math.min(dp[i], dp[i/3]+1);
        }

        System.out.println(dp[num]);
        br.close();
    }

}