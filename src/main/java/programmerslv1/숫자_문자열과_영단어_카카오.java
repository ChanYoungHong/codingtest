package programmerslv1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class 숫자_문자열과_영단어_카카오 {
    public static void main(String[] args) {
        숫자_문자열과_영단어_카카오 k = new 숫자_문자열과_영단어_카카오();
        System.out.println(k.iwanttogokakao("one4seveneight"));
        System.out.println(k.iwanttogokakao("23four5six7"));
        System.out.println(k.iwanttogokakao("2three45sixseven"));
        System.out.println(k.iwanttogokakao("123"));
    }

    private int iwanttogokakao(String s) {

        // 내가 풀고 싶었던 방식 -> 근데 좀 복잡해짐
//        Map<String, Integer> answer2 = new HashMap<>();
//
//        answer2.put("zero", 0);
//        answer2.put("one", 1);
//        answer2.put("two", 2);
//        answer2.put("three", 3);
//        answer2.put("four", 4);
//        answer2.put("five", 5);
//        answer2.put("six", 6);
//        answer2.put("seven", 7);
//        answer2.put("eight", 8);
//        answer2.put("nine", 9);
//
//        Iterator<String> iter = answer2.keySet().iterator();
//
//        while(iter.hasNext()){
//            String key = iter.next();
//            Integer value = answer2.get(key);
//
//            s = s.replaceAll(key, String.valueOf(answer2.get(key)));
//
//        }
//        return Integer.parseInt(s);

        // 다른 사람의 풀이 쉽고 간단함 - replaceAll() 활용 봐 둘 것
        int[] number = {0,1,2,3,4,5,6,7,8,9};
//        String[] number = {"0","1","2","3","4","5","6","7","8","9"};
        String[] words = {"zero", "one", "two", "three", "four", "five",
        "six", "seven", "eight"," nine"};

        for (int i = 0; i < 10; i++) {
            s = s.replaceAll(words[i], String.valueOf(number[i]));
        }

        return Integer.parseInt(s);

//        String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
//        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};
//
//        for(int i=0; i<10; i++){
//            s = s.replaceAll(alphabets[i],digits[i]);
//        }
//
//        return Integer.parseInt(s);
    }
}

