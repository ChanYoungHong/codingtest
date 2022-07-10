package baekjoonPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15649_4 {

    static int N,M;
    static int[] arr;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        N = Integer.parseInt(br.readLine());
//        M = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N+1];
        visit = new boolean[N+1];

        recursionsion(0);
    }

    private static void recursionsion(int idx) {
        if(idx == M){
            for (int i = 0; i < M; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return ;
        }

        for (int i = 1; i <= N; i++) {
            if(!visit[i]) {
                visit[i] = true;
                arr[idx] = i;
                recursionsion(idx + 1);
                visit[i] = false;
            }

        }

    }
}
