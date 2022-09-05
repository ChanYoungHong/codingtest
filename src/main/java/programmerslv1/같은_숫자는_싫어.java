package programmerslv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 같은_숫자는_싫어 {

    public static void main(String[] args) {


        같은_숫자는_싫어 q = new 같은_숫자는_싫어();
        System.out.println(q.differnetNum(new int[]{1,1,3,3,0,1,1}));
    }

    private int[] differnetNum(int []arr) {
        int[] answer = {};

        ArrayList<Integer> arrayList= new ArrayList<>();

        int preNum = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != preNum) {
                arrayList.add(arr[i]);
                preNum = arr[i];
            }
        }
            return arrayList.stream().mapToInt(j -> j).toArray();
    }

//        ArrayList<Integer> answerList = new ArrayList<Integer>();
//        //
//        int value = -1;
//        for(int i=0; i<arr.length; i++) {
//            if(arr[i] != value) {
//                answerList.add(arr[i]);
//                value = arr[i];
//            }
//        }
//        return answerList.stream().mapToInt(i->i).toArray();





//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        int idx = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == arr[i+1]) {
//                answer[idx++] = arr[i];
//            }
//
//            System.out.println(answer[i]);
//        }
//
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        answer = arrayList.toArray(new int[0]);


    }
