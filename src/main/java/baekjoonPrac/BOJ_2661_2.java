package baekjoonPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2661_2 {

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        backtrakingg("");
    }

    private static void backtrakingg(String result) {
        // 7 == N
        if(result.length() == N){
            System.out.println(result);
            System.exit(0);
        } else {
            // 1 2 3
            for (int i = 1; i <= 3; i++) {
                if(isGoodSequence(result+i)) {
                    backtrakingg(result + i);
                }
            }
        }
    }

    private static boolean isGoodSequence(String s) {
        // 앞에 2개만 알면 되니깐 일부러 나눔
        int length = s.length() / 2;

        //
        for (int i = 1; i <= length; i++) {
        // 앞에 수와 계속 비교를 해주는 작업. *2는 뒤에서 2번째 칸, -i 첫 번재 칸
            if(s.substring(s.length() - i).equals(s.substring(s.length() - 2*i, s.length() - i))) {
                return false;
            }
        }

        return true;
    }
}
