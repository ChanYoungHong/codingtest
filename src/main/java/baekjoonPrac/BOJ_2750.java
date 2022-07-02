package baekjoonPrac;

import java.util.Arrays;

public class BOJ_2750 {

    static int answer;

    public static void main(String[] args) {

        BOJ_2750 k = new BOJ_2750();
        int[] ints = new int[] {5, 5, 2, 3, 4, 1};

        Arrays.sort(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

    }
}
