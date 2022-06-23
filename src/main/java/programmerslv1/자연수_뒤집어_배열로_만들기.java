package programmerslv1;

public class 자연수_뒤집어_배열로_만들기 {

    public static void main(String[] args) {

        long n = 12345;
        int[] answer;
        
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        sb.reverse();
        
        String[] sblist = String.valueOf(sb).split("");

        answer = new int[sblist.length];
        // String 배열을 -> int형 배열로 바꿀 때 사용
        for (int i = 0; i < sblist.length; i++) {
            answer[i] = Integer.parseInt(sblist[i]);
        }

        // String을 -> String[]열로
//        long result = Long.parseLong(ans);
//        long[] answer =
//
//        answer = new long[(int) result];
//
//        for (int i = 0; i < 5; i++) {
//            answer[i] = result;
//            System.out.println(answer[i]);
//        }
//
//        String[] strings = Long.parseLong(n).



    }
}
