package programmerslv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.w3c.dom.ls.LSOutput;

public class 나누어_떨어지는_숫자_배열 {

    public static void main(String[] args) {


        나누어_떨어지는_숫자_배열 o = new 나누어_떨어지는_숫자_배열();
        System.out.println(o.divide(new int[]{5,9,7,10}, 5));

    }

    private int[] divide(int[] arr, int divisor) {
//        int[] answer = {};
//        ArrayList<Integer> a1 = new ArrayList<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]%divisor == 0) a1.add(arr[i]);
//        }
//
//        if(a1.isEmpty()) {
//            a1.add(-1);
//        }
//
//        answer = new int[a1.size()];
//
//        for (int i = 0; i < a1.size(); i++) {
//            answer[i] = a1.get(i);
//        }
//        Arrays.sort(answer);

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i <arr.length; i++) {

            if(arr[i]%divisor == 0){
                arrayList.add(arr[i]);
            }

        }


        if(arrayList.isEmpty()){
            arrayList.add(-1);
        }

        int[] answer = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] += arrayList.get(i);
        }
        Arrays.sort(answer);
        return answer;

    }
}

// 내가 작성해 본 답

