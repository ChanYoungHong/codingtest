package programmersReview2;

import programmersReview.핸드폰_번호_가리기;

public class 핸드폰번호가리기3 {
    public static void main(String[] args) {

        핸드폰번호가리기3 t = new 핸드폰번호가리기3();
        System.out.println(t.hiding("01033334444"));
        System.out.println(t.hiding("027778888"));
        
    }

    private String hiding(String phone_number) {
        String answer = "";

        String[] s1 = phone_number.split("");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < phone_number.length() - 4; i++) {
            sb.setCharAt(i, '*');
        }

        return String.valueOf(sb);
    }
}
