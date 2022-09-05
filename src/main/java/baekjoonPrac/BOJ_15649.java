package baekjoonPrac;

import java.util.Scanner;

public class BOJ_15649 {

    static int N,M;
    static int[] arr;
    static boolean[] visit;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N+1];
        visit = new boolean[N+1];

        recursion(0);
    }

    private static void recursion(int idx) {

        if(idx == M){

            for (int i = 0; i < M; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if(!visit[i]){
                visit[i] = true;
                arr[idx] = i;
                recursion(idx+1);
                visit[i] = false;
            }

        }

    }
}
