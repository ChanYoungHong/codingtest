package programmerslv1;

import java.util.Arrays;

public class 문자열_내림차순으로_배치하기 {

    public static void main(String[] args) {

        문자열_내림차순으로_배치하기 a = new 문자열_내림차순으로_배치하기();
        System.out.println(a.downstring("Zbcdefg"));
    }

    private String downstring(String s) {

        // 내가 적은 답변
        String answer = "";

        StringBuilder sb = new StringBuilder(s);
        answer = sb.reverse().toString();

        return answer;


        // 다른 사람의 답변
//        char arr[] = s.toCharArray();
//        Arrays.sort(arr);
//
//        StringBuilder sb = new StringBuilder(new String(arr));
//        return sb.reverse().toString();
    }
}
