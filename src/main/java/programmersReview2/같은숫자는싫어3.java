package programmersReview2;

import java.util.ArrayList;

public class 같은숫자는싫어3 {

    public static void main(String[] args) {

        같은숫자는싫어3 k = new 같은숫자는싫어3();
        System.out.println(k.k(new int[]{1,1,3,3,0,1,1}));
        System.out.println(k.k(new int[]{4,4,4,3,3}));
    }

    private int[] k(int []arr) {
        int[] answer = {};

        int temp = -1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] != temp){
                arrayList.add(arr[i]);
                temp = arr[i];
            }
        }

        answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {

            answer[i] = arrayList.get(i);
        }


        return answer;
    }
}
