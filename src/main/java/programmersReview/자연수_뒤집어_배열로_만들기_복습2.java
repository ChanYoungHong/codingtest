package programmersReview;

import org.w3c.dom.ls.LSOutput;

public class 자연수_뒤집어_배열로_만들기_복습2 {


    public static void main(String[] args) {

        자연수_뒤집어_배열로_만들기_복습2 k = new 자연수_뒤집어_배열로_만들기_복습2();
        System.out.println(k.making(12345));
    }

    private int[] making(long n) {

        // String이 됨
        String s = Long.toString(n);

        // 뒤짚음
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();

        String[] slist = String.valueOf(sb).split("");

        // 다시 배열로 만들기
        int[] answer = new int[sb.length()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(slist[i]);
        }

        return answer;
    }
}
