package programmersReview;

import java.util.ArrayList;

public class 같은숫자는싫어 {
    public static void main(String[] args) {

        같은숫자는싫어 k  = new 같은숫자는싫어();
        System.out.println(k.hateeach(new int[]{1,1,3,3,0,1,1}));
        System.out.println(k.hateeach(new int[]{4,4,4,3,3}));
    }

    private int[] hateeach(int[] arr) {
        int[] answer = {};
        int temp = -1;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] != temp){
                list.add(arr[i]);
                temp = arr[i];
            }
        }

        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }


        return answer;
    }
}
