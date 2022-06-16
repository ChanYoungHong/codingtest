package problemDP;

//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class BOJ_2293dp {
////    static ArrayList<Integer> dplist;
//    static int N,K;
//    static int[] arr, dp;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        N = sc.nextInt();
//        K = sc.nextInt();
//
//        arr = new int[N+1];
//        dp = new int[K+1];
//        dp[0] = 1;
//
//        for (int i = 1; i < dp.length; i++) {
//            arr[i] = sc.nextInt();
//
//            for (int j = arr[i]; j < K; j++) {
//                dp[j] += dp[j - arr[i]];
//            }
//        }
//        System.out.println(dp[K]);
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2293dp {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int n, k;
    private static int[] arr, dp;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n + 1];
        dp = new int[k + 1];
        dp[0] = 1; // 왜 1로 하는가?

        for(int i = 1 ; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            for (int j = arr[i]; j <= k; j++)
                dp[j] += dp[j - arr[i]];
        }

        System.out.println(dp[k]);
    }

}