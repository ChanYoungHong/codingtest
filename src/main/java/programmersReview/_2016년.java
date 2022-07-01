package programmersReview;

public class _2016년 {
    public static void main(String[] args) {

        _2016년 k = new _2016년();
        System.out.println(k.theYear(5, 24));
    }

    private String theYear(int a, int b) {
        String answer = "";

        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] date = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

        int allDate = 0;
        for (int i = 0; i < a-1; i++) {
            allDate += month[i] + (b-1);

        }
        for (int i = 0; i < a - 1; i++) {
            i = allDate%7;
            answer = date[i+1];
        }

        return answer;
    }
}
