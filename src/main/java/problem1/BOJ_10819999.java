package problem1;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_10819999 {

    static int N;
    static int[] arr;
    static int result;
    static int[] tArr;
    static boolean[] visited;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N]; // 6 arr = new int[6]

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        visited = new boolean[N];
        tArr = new int[N];

        result = 0;
        bfs(0);
        System.out.println(result);

    }

    private static void bfs(int count) {

        if(count == N) {
            int sum = 0;
            for (int i = 0; i < N-1; i++) {
                sum += Math.abs(tArr[i] - tArr[i+1]);
            }
            result = Math.max(result, sum);
            return;
        }

        for (int i = 0; i < N; i++) {
            if(visited[i]){
                continue;
            }
            visited[i] = true;
            tArr[count] = arr[i];
            bfs(count+1);
            visited[i] = false;
        }

    }

}
