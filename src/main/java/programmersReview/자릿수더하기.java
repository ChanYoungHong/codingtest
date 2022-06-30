package programmersReview;

public class 자릿수더하기 {

    public static void main(String[] args) {

        자릿수더하기 w = new 자릿수더하기();
        System.out.println(w.wleicsk(123));
        System.out.println(w.wleicsk(987));
    }

    private int wleicsk(int n) {
        int answer = 0;

        String[] strings = String.valueOf(n).split("");

        // 내가 푼 방법
        int[] answer2 = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            answer2[i] += Integer.parseInt(strings[i]);
            answer += answer2[i];
        }

        // 다른 사람 푼 방법
//        for (String i: strings) {
//            answer += Integer.parseInt(i);
//        }

        return answer;
    }
}
