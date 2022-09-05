package baekjoonPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;

public class BOJ_2108 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum/ array.length);

        Arrays.sort(array);

        int result1 = array.length%2 == 0 ? array[N/2] : array[N/2];
        System.out.println(result1);

        int cnt = 0;
        for (int i = 0; i < array.length; i++) {

            if(){


            }

        }

        int result2 = 0;
        int a = 0;
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            a = Math.max(a, array[i]);
            b = Math.min(b, array[i]);

            result2 = Math.abs(a) + Math.abs(b);
        }
        System.out.println(result2);



    }
}
