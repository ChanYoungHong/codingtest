package programmersReview;

import java.util.Arrays;
import java.util.Collections;

public class 문자열내림차순으로배치하기 {

    public static void main(String[] args) {

        문자열내림차순으로배치하기 k = new 문자열내림차순으로배치하기();
        System.out.println(k.hellollo("Zbcdefg"));

    }

    private String hellollo(String s) {
       String answer= "";

       String[] st = s.split("");
       Arrays.sort(st, Collections.reverseOrder());

       StringBuilder sb = new StringBuilder();
        for (String a:
             st) {
            sb.append(a);
        }

       return sb.toString();
    }
}
