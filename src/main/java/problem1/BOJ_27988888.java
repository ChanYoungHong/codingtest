package problem1;

import java.util.Scanner;

public class BOJ_27988888 {

    static int N, M;
    static int[] exArr;
    static int q;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        exArr = new int[N];

        for (int i = 0; i < exArr.length; i++) {
            exArr[i] = sc.nextInt();
        }

        int result = searching12341234(exArr, N, M);
        System.out.println(result);
    }

    private static int searching12341234(int[] exArr, int n, int m) {
        int result = 0;

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {

                    int sum = exArr[i] + exArr[j] + exArr[k];

                    if(M == sum) {
                        return sum;
                    }

                    // 이 부분을 구현하지 못 했음.
                    if((result < sum) && (sum < M)){
                        result = sum;
                    }

                }
            }
        }

        return result;
    }
}
