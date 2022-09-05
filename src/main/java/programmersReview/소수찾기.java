package programmersReview;

public class 소수찾기 {
    static int cnt;
    public static void main(String[] args) {

        소수찾기 t = new 소수찾기();
        System.out.println(t.lookingforing(10));
        System.out.println(t.lookingforing(5));
    }

    private int lookingforing(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            cnt = 0;
            for (int j = 1; j <= i; j++) {
                if(i%j == 0) cnt++;
            }
            if(cnt == 2){
                answer += 1;
            }
        }
        return answer;
    }
}
