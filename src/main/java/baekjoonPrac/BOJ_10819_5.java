package baekjoonPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_10819_5 {

    static int N;
    static boolean[] visit;
    static int[] selected;
    static int[] arr;
    static int result = Integer.MIN_VALUE;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Scanner sc = new Scanner(System.in);


        arr = new int[N];
        visit = new boolean[N];
        selected = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs1234444(0);
        System.out.println(result);

    }

    private static void dfs1234444(int idx) {

        if(idx == N){
            result = Math.max(helpinggg(), result);
        }

        for (int i = 0; i < N; i++) {
            if(!visit[i]) {
                visit[i] = true;
                selected[idx] = arr[i];
                dfs1234444(idx + 1);
                visit[i] = false;
            }
        }

    }

    private static int helpinggg() {
        int sum = 0;

        for (int i = 0; i < N-1; i++) {
            sum += Math.abs(selected[i] - selected[i+1]);
        }

        return sum;
    }
}