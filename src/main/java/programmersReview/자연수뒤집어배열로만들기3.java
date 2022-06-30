package programmersReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 자연수뒤집어배열로만들기3 {
    public static void main(String[] args) {
        
        자연수뒤집어배열로만들기3 k = new 자연수뒤집어배열로만들기3();
        System.out.println(k.cowkernd(12345));
    }

    private int[] cowkernd(long n) {

        // String으로 만들고 하나씩 다 쪼갬
        String[] s = String.valueOf(n).split("");

        ArrayList<String> arrayList = new ArrayList<>();
        for (String a: s) {
            arrayList.add(a);
        }
        Collections.reverse(arrayList);


        int[] answer2 = new int[arrayList.size()];
        for (int i = 0; i < answer2.length; i++) {
            answer2[i] = Integer.parseInt(arrayList.get(i));
        }

        return answer2;
    }
}
