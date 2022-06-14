package problem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_2468dfs_답 {

    static int N;
    static int[][] Map;
    static int[][] transmap;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static boolean[][] check;
    static int count;
    static int Max;

    public static void main(String[] args) throws IOException {

//        Scanner sc = new Scanner(System.in);
//        N = sc.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());


        Map = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                Map[i][j] = Integer.parseInt(st.nextToken());
//                Map[i][j] = sc.nextInt();
            }
        }

        Max = 1;

        for (int i = 1; i < 101; i++) {
            transmap = new int[N][N];
            count = 0;

            check = new boolean[N][N];

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if(Map[j][k] <= i) {
                        transmap[j][k] = 0;
                    }
                    else transmap[j][k] = 1;
                }
            }

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if(transmap[j][k] == 1 && !check[j][k]){
                        hellosearch(j,k);
                        count++;
                    }
                }
            }
            Max = Math.max(Max, count);
        }
        System.out.println(Max);
    }

    private static void hellosearch(int j, int k) {
        check[j][k] = true;

        for (int i = 0; i < 4; i++) {
            int nx = j + dx[i];
            int ny = k + dy[i];

            if(nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if(transmap[nx][ny] == 1 && !check[nx][ny]) {
                    hellosearch(nx,ny);
                }
            }
        }
    }
}
