package programmersReview2;

import java.util.ArrayList;
import java.util.Collections;

public class 문자열내마음대로정렬하기3 {

    public static void main(String[] args) {

        문자열내마음대로정렬하기3 k = new 문자열내마음대로정렬하기3();
       System.out.println(k.k(new String[]{"abce", "abcd", "cdx"}, 2));
        System.out.println(k.k(new String[]{"sun", "bed", "car"}, 1));

    }

    private String[] k(String[] strings, int n) {
        String[] answer = {};

        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arrayList.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(arrayList);
        answer = new String[arrayList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i).substring(1);
        }


        return answer;
    }
}
