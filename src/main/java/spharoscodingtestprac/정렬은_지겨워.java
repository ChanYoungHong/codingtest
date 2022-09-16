package spharoscodingtestprac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 정렬은_지겨워 {
    public static void main(String[] args) throws IOException {

//        ArrayList<Integer> originalList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            System.out.print(array[i] + " ");

            // 짝수일 때
            if(array[i] % 2 == 0){

                evenList.add(array[i]);
                Collections.reverse(evenList);
            } else { // 홀수일 때
                oddList.add(array[i]);
                Collections.sort(oddList, Collections.reverseOrder());
            }

            if(array.length%2 == 0){
                array[i] = oddList.get(i);
            } else {
                array[i] = evenList.get(i);
            }

            System.out.print(array[i] + " ");
        }




    }
}
