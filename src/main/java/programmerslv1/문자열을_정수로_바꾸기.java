package programmerslv1;

public class 문자열을_정수로_바꾸기 {

    public static void main(String[] args) {

        문자열을_정수로_바꾸기 a = new 문자열을_정수로_바꾸기();
        System.out.println(a.show("-1234"));

    }

    private int show(String s) {
        // String -> int로 바꿀 때 Integer.parseInt를 사용
        int answer = Integer.parseInt(s);

        return answer;
    }
}
