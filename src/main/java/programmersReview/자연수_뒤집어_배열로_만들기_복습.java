package programmersReview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 자연수_뒤집어_배열로_만들기_복습 {

    public static void main(String[] args) {

        자연수_뒤집어_배열로_만들기_복습 k = new 자연수_뒤집어_배열로_만들기_복습();
        System.out.println(k.naturalReverse(12345));

    }

    private int[] naturalReverse(long n) {
        String s = String.valueOf(n);

        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();

        // 틀린 부분
//        String[] sblist = new String[sb.length()];
        String[] sblist = sb.toString().split("");

        int[] answer = new int[sblist.length];
        for (int i = 0; i < sblist.length; i++) {
            answer[i] = Integer.parseInt(sblist[i]);
        }

        return answer;
    }
}
