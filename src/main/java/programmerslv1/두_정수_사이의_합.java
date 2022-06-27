package programmerslv1;

public class 두_정수_사이의_합 {

    public static void main(String[] args) {

        두_정수_사이의_합 q = new 두_정수_사이의_합();
        System.out.println(q.absum(3, 5));
        System.out.println(q.absum(5, 3));

    }

    private long absum(int a, int b) {
        long answer = 0;

        if(a > b){
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        } else {
            for (int i = a; i <=b; i++) {
                answer += i;
            }
        }
        return answer;
    }
}
