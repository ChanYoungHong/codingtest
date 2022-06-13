package problem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class prac_2667 {

    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    static int count;
    static ArrayList<Integer> result;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visited = new boolean[N][N];

        // 배열 값을 지도로? 지도에? 넣어야 함
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = input.charAt(j) - '0'; // String -> char 형으로 바꿀 때, 값을 하나씩 가져오기 위해서.
            }
        }

        count = 0;
        result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if(map[i][j] == 1 && !visited[i][j]) {
                    count = 1;
                    dodosearch(i,j);
                    result.add(count);
                }
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for(int z : result) System.out.println(z);
    }

    private static int dodosearch(int i, int j) {
        visited[i][j] = true;

        for (int k = 0; k < 4; k++) {
            int nx = i + dx[k];
            int ny = j + dy[k];

            if(nx >= 0 && ny >= 0 && nx < N && ny < N){
                if(map[nx][ny] == 1 && !visited[nx][ny]){
                    dodosearch(nx, ny);
                    count++;
                }
            }
        }
        return count;
    }


}
