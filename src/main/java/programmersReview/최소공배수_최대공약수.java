package programmersReview;

public class 최소공배수_최대공약수 {

    public static void main(String[] args) {

        최소공배수_최대공약수 k = new 최소공배수_최대공약수();
//        System.out.println(k.findfinding(3, 12));
//        System.out.println(k.findfinding(2, 5));

        System.out.println(k.pracprac(3, 12));
        System.out.println(k.pracprac(2, 5));
    }

    private int[] pracprac(int n, int m) {
        int[] answer = new int[2];

        int a = Math.max(n, m);
        int b = Math.min(n, m);

        answer[0] = gcd1234(n, m);
        answer[1] = (n*m)/answer[0];

        return answer;
    }

    private int gcd1234(int k, int m) {

        if(m == 0) return k;

        return gcd1234(m, k%m);
    }

//    private int[] findfinding(int n, int m) {
//        int[] answer = {};
//
//        answer[0] = Math.min(n, m);
//        answer[1] = gcd123(n, m);
//
//
//        return  answer;
//    }
//
//    private int gcd123(int n, int m) {
//
//        if(m%n == 0){
//            return (m/n) * n;
//        } else {
//
//        }
//        return gcd123(n, m);
//    }
}
