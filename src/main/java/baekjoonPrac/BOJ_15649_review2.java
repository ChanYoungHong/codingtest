package baekjoonPrac;

import java.util.Scanner;

public class BOJ_15649_review2 {

    static int N,M;
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N+1];
        visited = new boolean[N+1];

        recursion0710(0);

    }

    private static void recursion0710(int idx) {
        if(idx == M){
            for (int i = 0; i < M; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return ;
        }

        for (int i = 1; i <= N; i++) {
            if(!visited[i]){
                visited[i] = true;
                arr[idx] = i;
                recursion0710(idx + 1);
                visited[i] = false;
            }
        }
    }
}
