package programmersReview;

import java.util.ArrayList;
import java.util.Arrays;

public class 제일_작은수_제거하기_복습 {

    public static void main(String[] args) {

        제일_작은수_제거하기_복습 v = new 제일_작은수_제거하기_복습();
        System.out.println(v.remove(new int[]{4,3,2,1}));
    }

    private int[] remove(int[] arr) {
        if(arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        int[] copyArr = arr.clone();
        Arrays.sort(copyArr);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < copyArr.length; i++) {
            if(arr[i] != copyArr[0]) {
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
