package programmerslv1;

import jdk.swing.interop.SwingInterOpUtils;

public class 최소직사각형 {

    public static void main(String[] args) {

        최소직사각형 j = new 최소직사각형();
        System.out.println(j.imcharlie(new int[][] {
            {60, 50}, {30, 70}, {60, 30}, {80, 40}}));
        System.out.println(j.imcharlie(new int[][] {
            {10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}));
        System.out.println(j.imcharlie(new int[][] {
            {14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}));

    }

    private int imcharlie(int[][] sizes) {
        int answer = 0;

        int max = 0;
        int min = 0;

        for (int[] card : sizes) {

            int premax = Math.max(card[0], card[1]);
            int premin = Math.min(card[0], card[1]);

            if (premax > max) {
                max = premax;
            }

            if (premin > min) {
                min = premin;
            }
        }
        return max * min;
    }
}
