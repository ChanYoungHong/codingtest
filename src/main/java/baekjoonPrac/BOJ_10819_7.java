package baekjoonPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10819_7 {

    static int N;
    static int[] arr;
    static boolean[] visit;
    static int[] selected;
    static int result;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        arr = new int[N];
        visit = new boolean[N];
        selected = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        bfs(0);
        System.out.println(result);


    }

    private static void bfs(int idx) {
        if(idx == N) {
            result = Math.max(searchl(), result);
        }

        for (int i = 0; i < N; i++) {
            if(!visit[i]){
                visit[i] = true;
                selected[idx] = arr[i];
                bfs(idx+1);
                visit[i] = false;
            }
        }

    }

    private static int searchl() {
        int sum = 0;

        for (int i = 0; i < N-1; i++) {
            sum += Math.abs(selected[i] - selected[i+1]);
        }
        return sum;
    }
}
