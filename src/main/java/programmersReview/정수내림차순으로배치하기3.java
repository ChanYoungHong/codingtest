package programmersReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 정수내림차순으로배치하기3 {
    public static void main(String[] args) {

        정수내림차순으로배치하기3 k = new 정수내림차순으로배치하기3();
        System.out.println(k.cnk(118372));
    }

    private long cnk(long n) {
//        long answer = 0;
//
//        String[] s = String.valueOf(n).split("");
//        Arrays.sort(s);
//
//        for (int i = 0; i < s.length; i++) {
//            answer = Long.parseLong(s[i]);
//            System.out.print(Integer.parseInt(s[i])+" ");
//        }
//
//        ArrayList<String> arrayList = new ArrayList<>();
//
//        for (String a : s) {
//            arrayList.add(String.valueOf(s));
//        }
//        Collections.reverse(arrayList);
//
//        long[] answer2 = new long[arrayList.size()];
//        for (int i = 0; i < answer2.length; i++) {
//            answer2[i] = Long.parseLong(arrayList.get(i));
//        }
//
//        return Long.parseLong(answer2.toString());

        String[] s = String.valueOf(n).split("");
        Arrays.sort(s); // 112378

        StringBuilder sb = new StringBuilder();

        for (String i : s) {
            sb.append(i);
        }

        long answer = Long.parseLong(sb.reverse().toString());

        return answer;







//        StringBuilder sb = new StringBuilder();
//
//
//
//        String[] strings = String.valueOf(n).split("");
//        Arrays.sort(strings);
//
//        ArrayList<String> arrayList = new ArrayList<>();
//
//        for (String a: strings) {
//            arrayList.add(a);
//        }
//
//        StringBuilder sb = new StringBuilder();
//        sb.reverse(arrayList);
//
//
//
//        Collections.reverse(arrayList);
//        long[] answer = new long[arrayList.size()];
//        for (int i = 0; i < arrayList.size(); i++) {
//            answer[i] = Long.parseLong(arrayList.get(i));
//        }


    }
}
