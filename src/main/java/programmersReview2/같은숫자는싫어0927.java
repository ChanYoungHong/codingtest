package programmersReview2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 같은숫자는싫어0927 {

    static int[] arr = new int[]{1,1,3,3,0,1,1};
//    static int[] arr = new int[]{4,4,4,3,3};
    static List<Integer> temp = new ArrayList<>();
    static int[] result;

    public static void main(String[] args) {

        int x = -1;
        for (int i = 0; i < arr.length; i++) { // 0 1 2 3 4 5 6
//            if(arr[i] != x) {
//                temp.add(arr[i]);
//                x = arr[i];
//            }

            if(!temp.contains(arr[i])){
                temp.add(arr[i]);
            }

        }

        result = new int[temp.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = temp.get(i);
            System.out.print(result[i] + " ");

        }

    }
}
