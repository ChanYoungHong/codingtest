package programmersReview;

public class 최대공약수_최대공배수_복습 {

    public static void main(String[] args) {

        최대공약수_최대공배수_복습 a = new 최대공약수_최대공배수_복습();
//        System.out.println(a.excute(3, 12));
        System.out.println(a.excute(2, 5));

    }

    private int[] excute(int n, int m) {
        int[] answer = new int[2];
        int big = Math.max(n, m);
        int small = Math.min(n, m);

        answer[0] = gcd2(big, small);
        answer[1] = (big*small) / answer[0];

        return answer;
    }

    private int gcd2(int a, int b) {

        if(a%b == 0){
            return b;
        }
        return gcd2(b, a%b);
    }

}
