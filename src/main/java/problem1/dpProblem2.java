package problem1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class dpProblem2 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] dp = new int[N+1];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 0;
        
    }
}
