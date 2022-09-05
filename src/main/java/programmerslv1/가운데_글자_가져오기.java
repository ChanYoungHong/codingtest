package programmerslv1;

public class 가운데_글자_가져오기 {

    public static void main(String[] args) {

        가운데_글자_가져오기 a = new 가운데_글자_가져오기();
        System.out.println(a.bringbetween("abcde"));
        System.out.println(a.bringbetween("qwer"));

    }

    private String bringbetween(String s) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {

            int slength2 = s.length()/2;

            if(s.length()%2 == 0){ // 짝수
                return s.substring(slength2-1, slength2+1);
            }else {  // 홀수
                return s.substring(slength2, slength2+1);
            }
        }

        return answer;
        // 다른 사람 답 1줄로.
       //return s.substring((s.length()-1)/2, s.length()/2+1);
    }
}
