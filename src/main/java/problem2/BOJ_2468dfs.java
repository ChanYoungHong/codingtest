package problem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 문제에서 봐야 할 point
// 4방향에서 가장 큰 숫자를 골라야 한다.


public class BOJ_2468dfs {

    // 행과 열의 나타내는 지도 N
    static int N;
    static int[][] map;
    static boolean[][] visited;

    static ArrayList<Integer> result;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < N; j++) {
                // String -> char형으로 바꾸는 것
                map[i][j] = input.charAt(j) - '0';
            }
        }

        result = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if(map[i][j] == 1 && !visited[i][j] {

                }


            }
        }
    }
}
