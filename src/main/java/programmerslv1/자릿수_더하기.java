package programmerslv1;

public class 자릿수_더하기 {

    public static void main(String[] args) {

        int n = 123;
        int answer = 0;

        String[] nlist = String.valueOf(n).split("");

        // String 배열을 int로 바꿔서 다 더해준 상향된 for문? 향상된 for문?
        for(String a : nlist){
            answer += Integer.parseInt(a);
        }

        System.out.println(answer);

    }
}
