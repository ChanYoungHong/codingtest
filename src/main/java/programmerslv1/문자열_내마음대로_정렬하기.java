package programmerslv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.*;

public class 문자열_내마음대로_정렬하기 {

    public static void main(String[] args) {

        문자열_내마음대로_정렬하기 j = new 문자열_내마음대로_정렬하기();
//        System.out.println(j.settingRandom(new String[]{"sun", "bed", "car"}, 1));
        System.out.println(j.settingRandom2(new String[]{"sun", "bed", "car"}, 1));
//        System.out.println(j.settingRandom(new String[]{"abce", "abcd", "cdx"}, 2));

    }

    private String[] settingRandom2(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }

        // 정렬
        Collections.sort(list);

        answer = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }

        return answer;
    }


    // 문제풀이 순서 -> 단어의 1번째를 뽑아서 -> 오름차순으로 정리하고 ->
//    private String[] settingRandom(String[] strings, int n) {
//        String[] answer = new String[strings.length];
//
//        for (int i = 0; i < strings.length; i++) {
//
//            answer[i] = String.valueOf((strings[i].charAt(n))); // u e a
//            Arrays.sort(answer); // {a,e,u}
//            System.out.println(answer);
//
//        }
//        return answer;
//    }
}
