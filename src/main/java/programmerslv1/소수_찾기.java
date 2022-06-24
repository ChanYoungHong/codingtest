package programmerslv1;

public class 소수_찾기 {

    public static void main(String[] args) {

        소수_찾기 a = new 소수_찾기();
        System.out.println(a.findPrime(1000000));

    }

    // 에라토스테네스의 체를 사용한다, 2의 3의 배수들을 지운다.
    // 테스트 3개 통과가 안 됨.
    private int findPrime(int n) {
        int cnt = 0;
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                if(i%j == 0) cnt++;
            }
            if(cnt == 2) answer++;
            cnt = 0;
        }
        return answer;
    }
}
