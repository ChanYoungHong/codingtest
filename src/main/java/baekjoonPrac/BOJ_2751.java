package baekjoonPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2751 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 1 2 3 4 5 5
        Arrays.sort(arr);
        int temp = 0;

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] != temp){
                arrayList.add(i);
                temp = arr[i];
            }
            System.out.println(arr[i]);
        }
    }
}


