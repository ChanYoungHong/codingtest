package programmersReview2;

public class 행렬의덧셈3 {
    public static void main(String[] args) {

        행렬의덧셈3 k = new 행렬의덧셈3();
        System.out.println(k.k(
            new int[][] {{1,2},{2,3}},
            new int[][]{{3,4}, {5,6}}));
    }

    private int[][] k(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {

                answer[i][j] = arr1[i][j] + arr2[i][j];

            }
        }

        return answer;
    }
}
