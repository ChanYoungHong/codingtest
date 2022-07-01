package programmersReview;

import java.util.regex.Pattern;

public class 문자열다루기기본 {

    public static void main(String[] args) {

        문자열다루기기본 k = new 문자열다루기기본();
        System.out.println(k.munja("a234"));
        System.out.println(k.munja("1234"));
    }

    private boolean munja(String s) {
        boolean answer = true;

        // 숫자가 있는지 없는 지 확인해주는 정규표현식
        String pattern = "^[0-9]*$";
        answer = Pattern.matches(pattern, s);
        // 숫자만 구성되어 있으면 true고
        // 영어나 다른 문자가 있으면 false다.

        return answer;
    }
}
