package baekjoonPrac;

import java.util.Scanner;

public class BOJ_14889_5 {

    static int N;
    static int[][] map;
    static boolean[] visit;
    static int result = Integer.MIN_VALUE;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        map = new int[N][N];
        visit = new boolean[N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        
        dfs789(0, 0);
        System.out.println(result);
        
    }

    private static void dfs789(int idx, int cnt) {

        if(cnt == N/2){
            didifferent();
            return;
        }

        for (int i = idx; i < N; i++) {
            if(!visit[i]){
                visit[i] = true;
                dfs789(i+1, cnt+1);
                visit[i] = false;
            }
        }

    }

    private static void didifferent() {
        int team_start = 0;
        int team_link = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i+1; j < N; j++) {

                if(visit[i] == true && visit[j] == true){
                    team_start += map[i][j];
                    team_start += map[j][i];
                } else if(visit[i] == false && visit[j] == false){
                    team_link += map[i][j];
                    team_link += map[j][i];
                }
            }
        }
        int val = Math.abs(team_start - team_link);

        if(val == 0){
            System.out.println(val);
            System.exit(0);

        }

        result = Math.min(val, result);

    }
}