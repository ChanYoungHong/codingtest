package programmersReview;

public class 최소직사각형 {

    public static void main(String[] args) {

        최소직사각형 k = new 최소직사각형();
        System.out.println(k.sns(new int[][] {
            {60, 50}, {30, 70}, {60, 30}, {80, 40}}));
        System.out.println(k.sns(new int[][] {
            {10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}));
        System.out.println(k.sns(new int[][] {
            {14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}));
    }

    private int sns(int[][] sizes) {
        int answer = 0;

        int max = 0;
        int min = 0;

        for (int[] card : sizes) {

            int preMax = Math.max(card[0], card[1]);
            int preMin = Math.min(card[0], card[1]);

            if(preMax > max){
                max = preMax;
            }

            if(preMin > min){
                min = preMin;
            }
        }

        return max * min;
    }
}
