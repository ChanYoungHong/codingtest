package programmerslv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대공약수_최대공배수 {

    public static void main(String[] args) throws IOException {
        int[] answer = new int[2];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 2; i++) {

            if(m%n == 1) { // n, m -> 2, 5가 됨
                answer[0] = m%n;
                answer[1] = m*n;
            } else if(m%n == 0) { // n, m -> 3, 12가 됨
                answer[0] = n;
                answer[1] = (m/n)*n;
            }

            System.out.println(answer[i]);
        }

    }
}

//class TryHelloWorld {
//    public int[] gcdlcm(int a, int b) {
//        int[] answer = new int[2];
//
//        answer[0] = gcd(a,b);
//        answer[1] = (a*b)/answer[0];
//        return answer;
//    }
//
//    public static int gcd(int p, int q)
//    {
//        if (q == 0) return p;
//        return gcd(q, p%q);
//    }
//
//    // 아래는 테스트로 출력해 보기 위한 코드입니다.
//    public static void main(String[] args) {
//        TryHelloWorld c = new TryHelloWorld();
//        System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
//    }
//}

