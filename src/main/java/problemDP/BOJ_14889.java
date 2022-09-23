package problemDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14889 {

    static int N;
    static int[][] array;
    static boolean[] visit;

    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine()); // 4

        array = new int[N][N]; // 4 4
        visit = new boolean[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j <N; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfssssss(0,0);
        System.out.println(min);


    }

    private static void dfssssss(int depth, int a) {

        if(depth == N/2) {
            diffff();
            return;
        }

        for (int i = a; i < N; i++) {
            visit[i] =true; // 비어있음
            dfssssss(depth+1, i+1);
            visit[i] = false; // 들어있음
        }

    }

    private static void diffff() {
        int start = 0;
        int link = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i+1; j < N; j++) {
                if(visit[i] == true && visit[j] == true) {
                    start += array[i][j];
                    start += array[j][i];
                } else if(visit[i] == false && visit[j] == false) {
                    link += array[i][j];
                    link += array[j][i];
                }
            }
        }

        int val = Math.abs(start - link);

        if(val == 0){
            System.out.println(val);
            System.exit(0);
        }

        min = Math.min(min, val);
    }
}