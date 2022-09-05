package baekjoonPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_10989 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int[] ints = new int[N];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(ints);

        for (int i = 0; i < N; i++) {
            sb.append(ints[i]).append('\n');
        }

    }
}
