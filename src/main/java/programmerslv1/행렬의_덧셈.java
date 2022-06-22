package programmerslv1;

public class 행렬의_덧셈 {
        static int[][] answer;
        static int[][] arr1, arr2;
    public static void main(String[] args) {

        arr1 = new int[][] {{1}, {2}};
        arr2 = new int[][] {{3},{4}};

//        arr1 = new int[][] {{1,2}, {2,3}};
//        arr2 = new int[][] {{3,4},{5,6}};

        answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                answer[i][j] += arr1[i][j] + arr2[i][j];
                System.out.print(answer[i][j]+" ");
            }
        }




    }
}
