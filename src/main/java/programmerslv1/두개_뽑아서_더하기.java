package programmerslv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.*;

public class 두개_뽑아서_더하기 {

    public static void main(String[] args) {

        두개_뽑아서_더하기 a = new 두개_뽑아서_더하기();
        System.out.println(a.selectTwo(new int[] {2,1,3,4,1}));

    }

    private int[] selectTwo(int[] numbers) {

       ArrayList<Integer> numberlist = new ArrayList<>();

       int tmp = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {

                tmp = numbers[i] + numbers[j];
                if(!numberlist.contains(tmp)) {
                    numberlist.add(tmp);
                }
            }
        }

        Collections.sort(numberlist);

        int[] answer = new int[numberlist.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = numberlist.get(i);
        }
























        return answer;
    }
}

// 다른 사람 풀이 ->
//    ArrayList<Integer> numberlist = new ArrayList<>();
//    int temp = 0;
//
//        for (int i = 0; i < numbers.length - 1; i++) {
//    for (int j = i + 1; j < numbers.length; j++) {
//    temp = numbers[i] + numbers[j];
//    if (!numberlist.contains(temp)) {
//    numberlist.add(temp);
//    }
//    }
//    }
//    Collections.sort(numberlist);
//    int[] answer = new int[numberlist.size()];
//    for (int i = 0; i < answer.length; i++) {
//    answer[i] = numberlist.get(i);
//    }
//
//    return answer;
