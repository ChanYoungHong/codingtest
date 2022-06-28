package programmerslv1;

public class 약수의_개수와_덧셈 {

    public static void main(String[] args) {

        약수의_개수와_덧셈 w = new 약수의_개수와_덧셈();
        System.out.println(w.submultiple(13, 17));
        System.out.println(w.submultiple(24, 27));
    }

    private int submultiple(int left, int right) {
//        int answer = 0;
//        for (int i = left; i <= right; ++i) {
//            int count = 0;
//            for (int j = 1; j <= i; ++j) {
//                if (i % j == 0) {
//                    count++;
//                }
//            }
//
//            if (count % 2 == 0) {
//                answer += i;
//            } else {
//                answer -= i;
//            }
//        }
//        return answer;

        int answer = 0;

        for (int i = left; i <= right; i++) { // 13 ~ 17
            int cnt = 0; // 다시 카운트 해야하기 때문에 0으로 고정
            for (int j = 1; j <= i; j++) {

                if (j * j == i) {
                    cnt++;
                }
            }
            if (cnt % 2 == 0) {
                answer += i;
            } else if (cnt % 2 != 0) {
                answer -= i;
            }
        }

        return answer;
    }
}

