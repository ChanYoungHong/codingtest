package programmersReview;

public class 핸드폰_번호_가리기 {

    public static void main(String[] args) {

        핸드폰_번호_가리기 t = new 핸드폰_번호_가리기();
        System.out.println(t.hiding("01033334444"));
        System.out.println(t.hiding("027778888"));

    }

    private String hiding(String phone_number) {
        String answer = "";
        int size = phone_number.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < phone_number.length() - 4; i++) {
            sb.append("*");
        }
        sb.append(phone_number.substring(size-4, size));

        return sb.toString();


//        StringBuilder sb = new StringBuilder(phone_number);
//
//        for (int i = 0; i < phone_number.length() - 4; i++) {
//            sb.setCharAt(i, '*');
//        }
//
//        return sb.toString();


//        String answer = "";
//
//        for (int i = 0; i < phone_number.length() - 4; i++)
//            answer += "*";
//        answer += phone_number.substring(phone_number.length() - 4);
//        return answer;
    }
}
