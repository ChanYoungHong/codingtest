package problemDP;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1463_답 {

    static int[] dp;
    static int num;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());

        dp = new int[num+1];
        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= num; i++) {

            dp[i] = dp[i-1]+1; // 이 식을 왜 사용할까? or 왜 +1을 할까?
            if(i%2 == 0) dp[i] = Math.min(dp[i], dp[i/2]+1);
            if(i%3 == 0) dp[i] = Math.min(dp[i], dp[i/3]+1);
        }
        System.out.println(dp[num]);
        br.close();
    }
}

