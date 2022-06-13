package problem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_2667_답 {

    static int N;
    static int count;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    static ArrayList<Integer> result;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visited = new boolean[N][N];

        //지도 배열 값 입력
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

                if(map[i][j] == 1 && !visited[i][j]) {
                    count = 1;
                    dosearching(i,j);
                    result.add(count);
                }
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for(int e : result) System.out.println(e);
    }

    private static int dosearching(int i, int j) {
        visited[i][j] = true;

        for (int k = 0; k < 4; k++) {

            int nx = i + dx[k];
            int ny = j + dy[k];

            if(0<=nx && nx<N && 0<=ny && ny<N){
                if(map[nx][ny] == 1 && !visited[nx][ny]) {
                    dosearching(nx, ny);
                    count++;
                }
            }
        }
        return count;
    }

}