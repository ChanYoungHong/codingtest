package programmerslv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class x만큼_간격이_있는_n개의_숫자 {

    public static void main(String[] args) throws IOException {
        long[] answer;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        answer = new long[N];
        long temp = X;

        for (int i = 0; i < answer.length; i++) {
            answer[i] = X * (i+1);
        }

        System.out.println(answer);
    }
}
