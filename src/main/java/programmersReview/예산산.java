package programmersReview;

import java.util.Arrays;

public class 예산산 {

    public static void main(String[] args) {

        예산산 k = new 예산산();
        System.out.println(k.yemountains(new int[]{1,3,2,5,4}, 9));
        System.out.println(k.yemountains(new int[]{2,2,3,3}, 10));
    }

    private int yemountains(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);
        int sum = 0;

        for (int i = 0; i < d.length; i++) {
            sum += d[i];

            if(budget >= sum) {
                answer++;
            } else {
                break;
            }
        }

        return answer;
    }
}
