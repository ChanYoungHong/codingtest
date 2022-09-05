package programmersReview2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 문자열내림차순으로배치하기3 {

    public static void main(String[] args) {

        문자열내림차순으로배치하기3 a = new 문자열내림차순으로배치하기3();
        System.out.println(a.a("Zbcdefg"));
    }

    private String a(String s) {
        String answer = "";

        String[] strings = s.split("");
        Arrays.sort(strings);

        StringBuilder sb = new StringBuilder();

        for (String i:
             strings) {
            sb.append(i);
        }
        sb.reverse();

        return sb.toString();
    }
}
