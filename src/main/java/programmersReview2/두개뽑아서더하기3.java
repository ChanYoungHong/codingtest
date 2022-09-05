package programmersReview2;

import java.util.ArrayList;
import java.util.Collections;

public class 두개뽑아서더하기3 {

    public static void main(String[] args) {

        두개뽑아서더하기3 k = new 두개뽑아서더하기3();
        System.out.println(k.k(new int[] {2, 1, 3, 4, 1}));
        System.out.println(k.k(new int[] {5, 0, 2, 7}));
    }

    private int[] k(int[] numbers) {
        int[] answer = {};
        int sum = 0;

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {

                sum = numbers[i] + numbers[j];
                if(!arrayList.contains(sum)){
                    arrayList.add(sum);
                }
            }
        }

        Collections.sort(arrayList);
        answer = new int[arrayList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}
