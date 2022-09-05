package programmersReview;

public class 소수찾기3 {

    public static void main(String[] args) {

        소수찾기3 k = new 소수찾기3();
        System.out.println(k.findingPrime(10));
        System.out.println(k.findingPrime(5));
    }

    private int findingPrime(int n) {
        int answer = 0;
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(i%j == 0){
                    cnt++;
                }
            }
            if(cnt == 2){
                answer++;
            }
            cnt = 0;
        }

        return answer;
    }
}
