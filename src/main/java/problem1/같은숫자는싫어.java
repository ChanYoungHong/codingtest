package problem1;

import java.util.ArrayList;
import java.util.List;

public class 같은숫자는싫어 {

    static int[] answer;
    static int[] result;

    public static void main(String[] args) {

        answer = new int[]{1,1,3,3,0,1,1};

        List<Integer> list = new ArrayList<>();
        list.add(answer[0]);

        for (int i = 1; i < answer.length; i++) {

            if(answer[i] != answer[i-1]) {
                list.add(answer[i]);
            }
        }

        result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
    }
}
