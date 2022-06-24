package programmerslv1;

import java.util.Scanner;

public class 약수의_합 {

    public static void main(String[] args) {

        // 내가 푼 방법.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;

        for (int i = 1; i <=n; i++) {

            if(n%i == 0){
                answer += i;
            }
        }
        System.out.println(answer);

        // 다른 사람의 풀이.
//        약수의_합 c = new 약수의_합();
//        System.out.println(c.sumDivisor(12));
    }
//    public int sumDivisor(int num) {
//
//        int answer = 0;
//        for (int i = 1; i <= num/2; i++) {
//            if(num%i == 0) answer += i;
//        }
//        return answer + num;
//    }
}
