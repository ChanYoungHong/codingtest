package baekjoonPrac;

import java.util.Scanner;

public class BOJ_15649_review {

    static int N,M;
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 3
        M = sc.nextInt(); // 1

        arr = new int[N+1];
        visited = new boolean[N+1];

        recursion1(0); // 이 부분 헷갈림

    }

    private static void recursion1(int idx) {

        if(idx == M){
            for (int i = 0; i < M; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;  // 이 부분 헷갈림
        }


        for (int i = 1; i <= N; i++) {
            if(!visited[i]){
                visited[i] = true;
                arr[idx] = i;
                recursion1(idx +1);
                visited[i] = false;
            }
        }
    }
}
