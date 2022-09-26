package problem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_단지번호붙이기 {

    static int[] nx = {-1,1,0,0};
    static int[] ny = {0,0,-1,1};
    static boolean[][] visit;
    static int count;
    static ArrayList<Integer> result;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[][] array = new int[N][N];
        for (int i = 0; i < array.length; i++) {
            String input = br.readLine();
            for (int j = 0; j < array.length; j++) {

//                array[i][j] = Integer.parseInt(st.nextToken());
                array[i][j] = input.charAt(j) - '0';
                System.out.print(array[i][j]);

            }
        }

        count = 0;
        result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(array[i][j] == 1 && !visit[i][j]){
                    dfssssssss();

                }
            }
        }

    }

    private static void dfssssssss() {

    }
}
