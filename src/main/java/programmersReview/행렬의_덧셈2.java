package programmersReview;

public class 행렬의_덧셈2 {
    public static void main(String[] args) {

        행렬의_덧셈2 n = new 행렬의_덧셈2();
        System.out.println(n.plusplus(
            new int[][] {{1,2},{2,3}},
            new int[][]{{3,4}, {5,6}}));
    }

    // 다시
    private int[][] plusplus(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {

                answer[i][j] = arr1[i][0] + arr2[i][0];
            }
        }

        return answer;
    }


}
