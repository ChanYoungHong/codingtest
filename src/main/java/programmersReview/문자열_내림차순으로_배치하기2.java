package programmersReview;

import java.util.Arrays;
import java.util.Collections;

public class 문자열_내림차순으로_배치하기2 {

    public static void main(String[] args) {

        문자열_내림차순으로_배치하기2 h = new 문자열_내림차순으로_배치하기2();
        System.out.println(h.hihihihi("Zbcdefg"));
    }

    private String hihihihi(String s) {
        String answer = "";

        // 먼저 String 배열에 넣기
        String[] strings = s.split("");
        Arrays.sort(strings, Collections.reverseOrder()); // 내림차순으로 정리

        StringBuilder sb = new StringBuilder();
        for (String a: strings) {
            sb.append(a);
        }

        return sb.toString();

//        String[] arry = str.split("");
//        Arrays.sort(arry,  Collections.reverseOrder());
//        StringBuffer sb = new StringBuffer();
//        for( String s : arry )
//        {
//            sb.append(s);
//        }
//        return sb.toString();




//        String[] strings = String.valueOf(s).split("");
//
//        for (int i = 0; i < s.length(); i++) {
//            strings[i] = String.valueOf(s.charAt(i));
//        }
//        Arrays.sort(strings);
//
//        StringBuilder sb = new StringBuilder(String.valueOf(strings));
//        answer = String.valueOf(sb.reverse());
//
//        return answer.toString();
        return answer;
    }
}
