package baekjoonPrac;

import java.util.Scanner;

public class BOJ_10819 {

    static boolean[] visit;
    static int[] arr;
    static int[] select;
    static int n;
    static int result = Integer.MIN_VALUE;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        arr = new int[n];
        visit = new boolean[n];
        select = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bfs0711(0);
        System.out.println(result);
    }

    private static void bfs0711(int idx) {
        if(idx == n){
            result = Math.max(ineedResult(), result);
            return;
        }

        for (int i = 0; i < n; i++) {
            if(!visit[i]){
                visit[i] = true;
                select[idx] = arr[i];
                bfs0711(idx + 1);
                visit[i] = false;
            }
        }
    }

    private static int ineedResult() {
        int sum = 0;

        for (int i = 0; i < n-1; i++) {
            sum += Math.abs(select[i] - select[i + 1]);
        }
        return sum;
    }


}
//    static int N, result;
//    static int[] arr;
//    static boolean[] visit;
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        N = sc.nextInt();
//
//        for (int i = 0; i < N; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        dfs1234(0);
//        System.out.println(result);
//    }
//
//    private static void dfs1234(int idx) {
//        if(idx == N) {
//
//            System.out.println(dosout()+" ");
//
//        }
//        return ;
//    }
//
//    private static int dosout() {
//
//        for (int i = 0; i < N; i++) {
//            result = Math.abs(i) - Math.abs(i+1);
//        }
//
//        return result;
//    }