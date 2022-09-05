package programmersReview;

import java.util.Arrays;

public class K번째수 {
    public static void main(String[] args) {

        K번째수 k = new K번째수();
        System.out.println(k.kkk(
            new int[]{1,5,2,6,3,7,4},
            new int[][]{{2,5,3},{4,4,1},{1,7,3}}));

    }

    private int[] kkk(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int selected = commands[i][2];

            //내가 적은 코드
           //           2           5
//            for (int j = start; j <= end; j++) {
//                answer[i] = array[j-1];
//            }

            int[] Array = new int[end - start +1];
            int index = 0;

            for (int j = start-1; j < end; j++) {
                Array[index] = array[j];
                index++;
            }

            Arrays.sort(Array); // 2 3 5 6
            answer[i] = Array[selected-1];
        }


        return answer;
    }
}
