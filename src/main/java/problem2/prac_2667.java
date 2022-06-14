package problem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class prac_2667{

    static int N; // 총 지도의 크기
    static int[][] map;
    static boolean[][] visited;
    static int count;
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
                map[i][j] = input.charAt(j) - '0';
            }
        }

        count = 0;
        result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if(map[i][j] == 1 && !visited[i][j]){
                    count = 1;
                    ddosearch(i,j);
                    result.add(count);
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for(int z : result) System.out.println(z);
    }

    private static int ddosearch(int i, int j) {
        visited[i][j] = true;

        for (int k = 0; k < 4; k++) {

            int nx = i + dx[k];
            int ny = j + dy[k];

            if(nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if(map[nx][ny] == 1 && !visited[nx][ny] ){
                    ddosearch(nx,ny);
                    count++;
                }
            }
        }
        return count;
    }
}