package programmerslv1;

import java.util.Arrays;

public class 이상한_문자_만들기 {


// 짝수면 -> 대문자
// 홀수면 -> 소문자

    public static void main(String[] args) {

        String s = "try hello world";
        String result = "";

        String[] slist = s.split("");
        String[] answer = new String[slist.length];

        for (int i = 0; i < slist.length; i++) {

            if(i%2 == 0){
                answer[i] = slist[i].toUpperCase();
            }else if(i%2 == 1){
                answer[i] = slist[i];
            }
            result = String.join("", answer);
        }
        System.out.println(result);


//        String answer = "";
//        int cnt = 0;
//        String[] array = s.split("");
//
//        for(String ss : array) {
//            cnt = ss.contains(" ") ? 0 : cnt + 1;
//            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
//        }
//        return answer;

    }
}


