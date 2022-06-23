package programmerslv1;

import java.util.Arrays;

public class 정수_내림차순으로_배치하기 {

    public static void main(String[] args) {
        // 지금 안 되는게 long형을 long 배열로 어떻게 만드는지 모르겠다.

        long n = 118372;

        // long -> string[] 배열로 만들어서 하나씩 넣기
        String[] strings = String.valueOf(n).split("");
        Arrays.sort(strings);

        StringBuilder sb = new StringBuilder();
        for (String a: strings) {
            sb.append(a);
        }

        long result =  Long.parseLong(sb.reverse().toString());
        System.out.println(result);

            // 내가 접근했던 방식
//        String ans = Long.toString(n);
//
//        StringBuilder sb = new StringBuilder(ans);
//        sb.reverse();
//
//        System.out.println(sb);
//
//        // 왜 String.valueOf를 가져다 써야 하는가?
//        long m = Long.parseLong(String.valueOf(sb));
//
//        ArrayList<Long> arrayList = new ArrayList<>();
//
//        for (int i = 0; i < 6; i++) {
//
//        }



//        long[] ans = new long[6];
//
//        ans[0] = n%10;
//        ans[1] = n%10;
//        ans[2] = n%10;
//        ans[3] = n%10;
//        ans[4] = n%10;
//        ans[5] = n%10;
//
//
//
//        Arrays.sort(ans);
//
//        for (int i = 0; i < ans.length; i++) {
//            System.out.print("[" + ans[i] + "] ");
//        }

    }
}
