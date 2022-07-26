package problem1;

import java.util.Scanner;

public class BOJ_15650 {

    static int N, M;
    static int[] arr;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[M];

        dfs15411541(1, 0);


    }

    private static void dfs15411541(int start, int depth) {

        // 왜 깊이가 M기준으로 설정이 되는 건가 ?!?!?!
        if (depth == M) {
            for (int a : arr) {
                System.out.print(a + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= N; i++) {

            arr[depth] = i;
            dfs15411541(i + 1, depth + 1);

        }
    }
}
