package problemDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2294dp {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, K;
    static int[] dp, arr;
    static int[] result;

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N];
        dp = new int[K];

        for (int i = 1; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            for (int j = arr[i]; j < K; j++) {
                dp[j] = dp[j - arr[i]];
//                result = dp[j];
            }
        }

        for (int z : result)

        System.out.println(dp[K]);
    }
}
