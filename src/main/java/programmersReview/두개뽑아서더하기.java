package programmersReview;

import java.util.ArrayList;
import java.util.Collections;

public class 두개뽑아서더하기 {
    public static void main(String[] args) {

        두개뽑아서더하기 k = new 두개뽑아서더하기();
        System.out.println(k.twoChoose(new int[] {2, 1, 3, 4, 1}));
        System.out.println(k.twoChoose(new int[] {5, 0, 2, 7}));
    }

    private int[] twoChoose(int[] numbers) {
//        int[] answer = {};
//
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        int tmp = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i+1; j < numbers.length; j++) {
//
//                tmp = numbers[i] + numbers[j];
//
//                if(!arrayList.contains(tmp)){
//                    arrayList.add(tmp);
//                }
//            }
//        }
//
//        Collections.sort(arrayList);
//
//        answer = new int[arrayList.size()];
//
//        for (int i = 0; i < answer.length; i++) {
//            answer[i] = arrayList.get(i);
//        }
//
//
//        return answer;


        // 내가 푼 방식 틀림
        int[] answer = {};

        ArrayList<Integer> arrayList = new ArrayList<>();

// 길이 -> 5
        for (int i = 0; i < numbers.length; i++) {
            // 5 -> 1 2 3 4
            for (int j = i + 1; j < numbers.length; j++) {

                answer[i] = numbers[i] + numbers[j];
            }
        }


        int tmp = -3;

        // 중복 제거하기.
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] != tmp) {
                arrayList.add(answer[i]);
                tmp = answer[i];
            }
            System.out.print(arrayList + " ");
        }
        Collections.sort(arrayList);

        int[] answer2 = new int[arrayList.size()];
        for (int i = 0; i < answer2.length; i++) {
            answer2[i] = arrayList.get(i);
        }

        return answer2;
    }

}

