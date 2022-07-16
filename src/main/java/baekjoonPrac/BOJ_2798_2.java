package baekjoonPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2798_2 {

    static int N, M;
    static int[] arr;

    static int sum;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = search1234(arr, N, M);
        System.out.println(result);

    }

    private static int search1234(int[] arr, int N, int M) {

        int result = 0;

        //                      3
        for (int i = 0; i < N - 2; i++) {
            //                      4
            for (int j = i + 1; j < N - 1; j++) {
                //                      5
                for (int k = j + 1; k < N; k++) {

                    int sum = arr[i] + arr[j] + arr[k];

                    if(M == sum) {
                        return sum;
                    }

                    if(result < sum && sum < M) { // result < sum
                        result = sum;
                    }
                }
            }
        }

        return result;
    }
}
