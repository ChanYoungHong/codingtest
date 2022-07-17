package baekjoonPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BOJ_2798_3 {

    static int N, M;
    static int[] arr;
    static int result;
    static int sum;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        result = seeeearching(arr, N, M);
        System.out.println(result);

    }

    private static int seeeearching(int[] arr, int N, int M) {

        for (int i = 0; i < N - 2; i++) {
            for (int j = i+1; j < N-1; j++) {
                for (int k = j+1; k < N; k++) {

                    sum = arr[i] + arr[j] + arr[k];

                    if(M == sum){
                        return sum;
                    }

                    if(sum < result & result < M ){
                        result = sum;
                    }

                }
            }
        }

        return result;
    }
}