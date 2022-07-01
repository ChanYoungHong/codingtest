package programmersReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 문자열내맘대로정렬하기23 {
    public static void main(String[] args) {

        문자열내맘대로정렬하기23 k = new 문자열내맘대로정렬하기23();
//        System.out.println(k.alslcm(new String[]{"abce", "abcd", "cdx"}, 2));
        System.out.println(k.alslcm(new String[]{"sun", "bed", "car"}, 1));

    }

    private String[] alslcm(String[] strings, int n) {
//        String[] answer = new String[strings.length];
//
////        String kk = "asdflaksdfjl";
//
////        char[] temp = strings.toString().toCharArray();
//        char[] temp = new char[3];
//
////        for (int i = 0; i < 10; i++) {
////            System.out.print(temp[i] + " ");
////        }
//
//
////        1번째 인덱스 값을 들고와라 어떻ㄱ ㅔ ?
//        for (int i = 0; i < strings.length; i++) {
//            temp[i] = strings[i].charAt(n); // u e a 뽑고
//        }
//        Arrays.sort(temp); // u e a 정렬 -> a e u ? -> next ??
//
//        for (int i = 0; i < 3; i++) {
//
//            if(strings.toString().contains()) {
//
//            }
//
//
//        }

        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(list);
        answer = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }
        return answer;
    }
}
