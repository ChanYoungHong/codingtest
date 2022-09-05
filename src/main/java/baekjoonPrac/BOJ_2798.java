package baekjoonPrac;

import java.util.Scanner;

public class BOJ_2798 {

    static int N,M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int[] card = new int[N];
        for (int i = 0; i < N; i++) {
            card[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    int num = card[i] + card[j] + card[k];
                    if(num <= M && num > max) max = num;
                }
            }
        }
        System.out.println(max);
    }
}
