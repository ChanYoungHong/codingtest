package programmersReview2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 두개뽑아서더하기4 {

    static int[] answer;
    static int[] numbers;

    public static void main(String[] args) {

        numbers = new int[]{2,1,3,4,1};
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {

                int sum = numbers[i] + numbers[j];
                if(!integerList.contains(sum)) integerList.add(sum);
            }
        }

        Collections.sort(integerList);
        answer = new int[integerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = integerList.get(i);
            System.out.print(answer[i] + " ");
        }

    }
}
