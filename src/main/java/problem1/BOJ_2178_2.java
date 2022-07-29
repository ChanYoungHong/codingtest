package problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2178_2 {

    static int N,M;
    static boolean[][] visited;
    static int[][] map;
//    static int cnt;
    static int[] nx = {-1,1,0,0};
    static int[] ny = {0,0,-1,1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];

        // 4방향 다 둘러보고 확인하는 코드.
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < M; j++) {

                map[i][j] = input.charAt(j) - '0';
//                nx[i] = i + map[i][j];
//                ny[j] = j + map[i][j];

            }
        }
        visited[0][0] = true;
        dfdfdfdf1234(0,0);
        System.out.println(map[N-1][M-1]);

    }

    private static void dfdfdfdf1234(int x, int y) {
//        Queue<int[]> q = new Linked
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x,y});

        while(!q.isEmpty()) {
            int now[] = q.poll(); // 하나 제거하기.
            int nowX = now[0];
            int nowY = now[1];

            for (int i = 0; i < 4; i++) {
                int nextX = nowX + nx[i];
                int nextY = nowY + ny[i];

                if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= M)
                    continue;
                if(visited[nextX][nextY] || map[nextX][nextY] == 0)
                    continue;

                q.add(new int[]{nextX, nextY});
                map[nextX][nextY] = map[nowX][nowY] + 1;
                visited[nextX][nextY] = true;
            }
        }
    }
}
