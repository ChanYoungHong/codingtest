package problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_2798_2 {

    static int N,M;
    static int sum;

    public static void main(String[] args) throws IOException {


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        int max = 0;

        for (int i = 0; i < N-3; i++) { // 0 1 2
            for (int j = i+1; j < N-2; j++) { // 1 2 3
                for (int k = j+1; k < N-1; k++) { // 2 3 4

                    int num = array[i] + array[j] + array[k];
                    if(num <= M && num > max) max = num;

//                    if(array[i] + array[j] + array[k] == sum) {
//                        break;
//                    }
//                    } else {
//                        (array[i+1] + array[j+1] + array[k+1]);
//                    }
                }
            }
        }
        System.out.println(max);


    }
}
