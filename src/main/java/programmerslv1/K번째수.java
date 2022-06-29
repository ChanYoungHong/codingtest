package programmerslv1;

import java.util.Arrays;

public class K번째수 {
    public static void main(String[] args) {

        K번째수 k = new K번째수();
        System.out.println(k.iwanttocount(
            new int[]{1,5,2,6,3,7,4}, new int[][]{{2,5,3},{4,4,1},{1,7,3}}));
    }

    private int[] iwanttocount(int[] array, int[][] commands) {

        // 내가 하려했던 풀이.
//        int[] answer = {};
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < commands[i].length-1; j++) {
//                for (int k = commands[i][j];  k < commands[i][j]; k++) {
//
//                    answer[i] = array[k];
//
//                }
//            }
//        }
//
//        Arrays.sort(answer);
//
//        for (int i = 0; i < answer.length; i++) {
//            answer[i] = answer.charAt();
//        }
//
//        return answer;


        int[] answer = new int[commands.length];


        for (int i = 0; i < commands.length; i++) {

            int start = commands[i][0];
            int end = commands[i][1];
            int selected = commands[i][2];

            int[] splitArray = new int[end - start + 1];
            int index = 0;

            for (int j = start-1; j < end; j++) {
                splitArray[index] = array[j];
                index++;
            }

            Arrays.sort(splitArray); // 1 2 3 4 5 6 7
            answer[i] = splitArray[selected-1];  // 제로베이스로 -1을 해줘야 함.
        }
        return answer;
    }
}
