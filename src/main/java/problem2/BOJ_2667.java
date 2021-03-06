package problem2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


// dfs 연습
public class BOJ_2667 {

    static int N;
    static int[][] map;
    static boolean[][] check;
    static int[] dx= {-1,1,0,0};
    static int[] dy= {0,0,-1,1};

    static ArrayList<Integer> result;

    static int count;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        check = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }

        count = 0;
        result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if(map[i][j] == 1 && !check[i][j]) {
                    count = 1;
                    dosearch(i,j);
                    result.add(count);
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for(int a : result) System.out.println(a);

    }

    private static int dosearch(int i, int j) {
        check[i][j] = true;

        // 4방향 확인해야 함.
        for (int k = 0; k < 4; k++) { // k -> 0 1 2 3
            int nx = i + dx[k]; // x = -1 1 0 0
            int ny = j + dy[k]; // y = 0 0 -1 1

            if(nx >= 0 && ny >= 0 && nx < N && ny <N) {
                // 현 위치가 1이고 check가 false면 ?
                if(map[nx][ny] == 1 && !check[nx][ny]) {
                    dosearch(nx, ny);
                    count++;
                }
            }
        }
        return count;
    }

}