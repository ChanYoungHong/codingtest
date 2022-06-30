package programmersReview;

public class 이상한문자만들기 {
    public static void main(String[] args) {

         이상한문자만들기 q = new 이상한문자만들기();
        System.out.println(q.coasdnfoaisd("try hello world"));
    }

    private String coasdnfoaisd(String s) {
//        String answer = "";
//
//        String[] strings = s.split("");
//        String[] answer2 = new String[s.length()];
//
//
//        for (int i = 0; i < strings.length; i++) {
//
//            if(i%2 == 0){
//                answer2[i] = strings[i].toUpperCase();
//             }else if(i%2 == 1){
//                answer2[i] = strings[i].toLowerCase();
//            }
//            answer = String.join("", answer2);
//
//        }
//        return answer;


        // 다르게 푼 방법
//        String answer = "";
//
//        for (int i = 0; i < s.length(); i++) {
//
//            if(i%2 == 0){
//                answer += s.toUpperCase().charAt(i);
//            }else {
//                answer += s.toLowerCase().charAt(i);
//            }
//        }
//        return answer;

        String answer = "";

        int cnt = 0;
        String[] array = s.split("");

        for (String a: array) {
            cnt = a.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? a.toLowerCase() : a.toUpperCase();
        }
        return answer;

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
