package problem2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

// bfs를 써야 함
public class BOJ_2667 {

//    static int[] dp;
// 지도 맵 혹은 사이즈 ??
//    static ArrayList<ArrayList<Integer>> map;

    static int N; // 지도의 크기
    static int[][] Map;
    static int[] dr = {-1,1,0,0,};
    static int[] dc = {0,0,-1,1};
    static int count;

    static ArrayList<Integer> result;
    static boolean[][] visited; // 방문 한 것 체크

   public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        Map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < N; j++) {
                Map[i][j] = input.charAt(j) - '0'; // char -> int로 변환하기 위해서 '0' 뺌
            }
        }

        // 단지집의 숫자
        count = 0;
        result = new ArrayList<>();

       for (int i = 0; i < N; i++) {
           for (int j = 0; j < N; j++) {
               if(Map[i][j]==1 && !visited[i][j]) {
                   count = 1;
                   Search(i,j);
                   result.add(count);
               }
           }
       }
       Collections.sort(result);
       System.out.println(result.size());
       for(int c : result) System.out.println(c);
    }

    // 4방향 확인하는 행동?
    private static int Search(int i, int j) {
            visited[i][j] = true;

        for (int k = 0; k < 4; k++) { // k -> 0 1 2 3
            int nx = i + dr[k];
            int ny = j + dc[k];

            if(nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if(Map[nx][ny] == 1 && !visited[nx][ny]) {
                    Search(nx,ny);
                    count++;
                }
            }
        }
        return count;
    }
}