package baekjoonPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_14889 {

    static int[][] arr;
    static int N;
    static boolean[][] visit;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        arr = new int[N][N];
        visit = new boolean[N][N];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        recursion14889(0);

    }

    private static int recursion14889(int idx) {
        int sum1 = 0;

        for (int i = 0; i < arr.length+1; i++) {
            for (int j = 0; j < arr[i].length+1; j++) {

                sum1 = (arr[i+1][j+1] + arr[j-1][i-1]);
            }
        }

        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                sum2 = (arr[i+1][j+1] + arr[j-1][i-1]);
            }

        }

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            if(sum1 > sum2){
                arrayList.add(i);
            } else if(sum1 == sum2) {
                arrayList.add(i);
            } else {
                arrayList.add(i);
            }
        }

        Collections.sort(arrayList);

        return arrayList.get(0);
    }
}
