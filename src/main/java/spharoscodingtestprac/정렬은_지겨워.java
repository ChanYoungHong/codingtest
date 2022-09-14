package spharoscodingtestprac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 정렬은_지겨워 {
    public static void main(String[] args) throws IOException {

//        ArrayList<Integer> originalList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(br.readLine());
            System.out.println(i + " ");
        }



    }
}
