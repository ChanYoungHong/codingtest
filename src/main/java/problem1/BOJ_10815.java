package problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_10815 {

    static int N, M;
    static int[] arr;
//    static int[] check;
//    static ArrayList<Integer> result;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
//        M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " "); // 공백을 기준으로 값을 넣기.
        for (int i = 0; i < N; i++) { // 5
            arr[i] = Integer.parseInt(st.nextToken());
            // 어떻게 수를 받고 넣는지 헷갈림.
        }

        M = Integer.parseInt(br.readLine()); // 8
        Arrays.sort(arr);

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            int reuslt123 = BinarySearch(Integer.parseInt(st.nextToken()));
            if(reuslt123 != -1) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        }

//        Scanner sc = new Scanner(System.in);
//        N = sc.nextInt();
//        M = sc.nextInt();

        // 6 3 2 10 -10
//        for (int i = 0; i < N; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < M; i++) {
//            check[i] = sc.nextInt();
//        }

//        for (int i = 0; i < M; i++) {
//            for (int j = 0; j < N; j++) {
//                if(check[i] == arr[j]){
//                    result.add(1);
//                } else{
//                    result.add(0);
//                }
//            }
//        }
    }

    private static int BinarySearch(int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while(left <= right) {
            mid = (left + right) / 2;
            if(arr[mid] < target)
                left = mid + 1;
            else if(arr[mid] > target)
                right = mid - 1;
            else
                return mid;
        }
        return -1;
    }


}
