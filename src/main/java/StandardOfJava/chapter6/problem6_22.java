package StandardOfJava.chapter6;

import java.util.regex.Pattern;

public class problem6_22 {

    static Boolean isNumber(String str){
       boolean answer = false;
//
//        // 숫자가 있는지 없는 지 확인해주는 정규표현식
        String pattern = "^[0-9]*$";
        answer = Pattern.matches(pattern, str);
        if(answer = Pattern.matches(pattern, str)){
            return true;
        }

        // 숫자만 구성되어 있으면 true고
        // 영어나 다른 문자가 있으면 false다.
        return false;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));

        str = "1234o";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));

    }
}
