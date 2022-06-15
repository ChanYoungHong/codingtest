package problem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 문제에서 봐야 할 point
// 4방향에서 가장 큰 숫자를 골라야 한다.


public class BOJ_2468dfs {

    // 행과 열의 나타내는 지도 N
    static int N;
    static int[][] map;
    static int[][] transmap;
    static boolean[][] visited;

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int count;
    static int Max;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];

        for (int i = 0; i < N; i++) {
//            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                // String -> char형으로 바꾸는 것
//                map[i][j] = input.charAt(j) - '0';
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Max = 1;

        for (int z = 0; z < 101; z++) {

            transmap = new int[N][N];
            count = 0;

            visited = new boolean[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(map[i][j] <= i){
                        transmap[i][j] = 0;
                    }
                    else transmap[i][j] = 1;
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(transmap[i][j] == 1 && !visited[i][j]) {
                        dddosearch(i,j);
                        count++;
                    }
                }
            }
            Max = Math.max(Max, count);
        }
        System.out.println(Max);
    }

    private static void dddosearch(int i, int j) {
        visited[i][j] = true;

        for (int k = 0; k < 4; k++) {
            int nx = i + dx[k];
            int ny = j + dy[k];

            if(nx > 0 && ny > 0 && nx < N && ny < N) {
                if(transmap[nx][ny] == 1 & !visited[nx][ny]) {
                    dddosearch(nx,ny);
                }
            }
        }
    }
}
