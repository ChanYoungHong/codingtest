package programmersReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 제일_작은수_제거하기2 {

    public static void main(String[] args) {

        제일_작은수_제거하기2 b = new 제일_작은수_제거하기2();
        System.out.println(b.removing(new int[]{4,3,2,1}));

    }

    private int[] removing(int[] arr) {

        if(arr.length == 1){
                return new int[]{-1};
            } else{

                ArrayList<Integer> arrayList = new ArrayList<>();

                for (int a:
                    arr) {
                    arrayList.add(a);
                }

                Integer min = Collections.min(arrayList);
                arrayList.remove(min);

                int[] answer = new int[arrayList.size()];

                for (int i = 0; i < answer.length; i++) {
                    answer[i] = arrayList.get(i);
                }
                return answer;
        }

        // 다른 사람의 풀이
//        if (arr.length == 1) {
//            arr[0] = -1;
//            return arr;
//        } else {
//            ArrayList<Integer> arrayList = new ArrayList<Integer>();
//            for (int a : arr) {
//                arrayList.add(a);
//            }
//            Integer minimum = Collections.min(arrayList);
//            arrayList.remove(minimum);
//            int[] resultArray = new int[arr.length - 1];
//            for (int i = 0; i < arrayList.size(); ++i) {
//                resultArray[i] = arrayList.get(i);
//            }
//            return resultArray;
//        }

    }
}
