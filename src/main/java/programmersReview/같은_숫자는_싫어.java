package programmersReview;

import java.util.ArrayList;

public class 같은_숫자는_싫어 {

    public static void main(String[] args) {

        같은_숫자는_싫어 l = new 같은_숫자는_싫어();
        System.out.println(l.hateSameNum(new int[]{1,1,3,3,0,1,1}));
        System.out.println(l.hateSameNum(new int[]{4,4,4,3,3}));

    }

    private int[] hateSameNum(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        int temp = -1;
//        for (int k: arr) {
//            if(arr[k] != temp){
//                arrayList.add(arr[k]);
//                temp = arr[k];
//            }
//        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != temp){
                arrayList.add(arr[i]);
                temp = arr[i];
            }
        }

        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}
