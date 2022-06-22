package programmerslv1;

import java.util.Scanner;

public class 핸드폰_번호_가리기 {

    static String answer;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        String phone_number = sc.nextLine();
        String phone_number = "01033334444";

        StringBuilder sb = new StringBuilder(phone_number);

        for (int i = 0; i < phone_number.length() - 4; i++) {
            sb.append("*");
        }
        sb.append(phone_number.substring(phone_number.length()-4));
        answer = sb.toString();

        System.out.println(answer);


    }
}
