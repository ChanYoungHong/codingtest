package problem1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10819_2 {

    static int[] nums;
    static int n;
    static boolean[] visited;
    static int[] selected;
    static int result = Integer.MIN_VALUE;

//    6
//    20 1 15 8 4 10

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()); // 띄어쓰기 기준으로 나눔
        nums = new int[n];
        visited = new boolean[n];
        selected = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken()); // nextToken : 토큰을 하나씩 가져 옴
        }
        dfs(0);
        System.out.println(result);
    }

    private static void dfs(int count) {
        if(count == n) {
            result = Math.max(getResult2(), result);
            return;
        }
        for (int i = 0; i < n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                selected[count] = nums[i];
                dfs(count +1);
                visited[i] = false;
            }
        }
    }

    private static int getResult2() {
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += Math.abs(selected[i] - selected[i+1]);
        }
        return sum;
    }
}