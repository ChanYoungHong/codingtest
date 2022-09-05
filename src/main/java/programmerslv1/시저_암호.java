package programmerslv1;

public class 시저_암호 {

    public static void main(String[] args) {

        시저_암호 z = new 시저_암호();
//        System.out.println(z.example("AB", 1));
//        z.prac();
        System.out.println(z.hello("AB", 1));
    }

    private String hello(String s, int n) {
        String answer = "";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isLowerCase(ch)){ //소문자
                ch = (char)((ch-'a'+n)%26 + 'a');
            }
            else if(Character.isUpperCase(ch)){ //대문자
                ch = (char)((ch-'A'+n)%26 + 'A');
            }
            answer += ch;
        }
        return answer;
    }

    // charAt 어떻게 활용하나 and String[]에는 사용불가.
//    private void prac() {
//
//        String[] a = new String[]{"안녕하세요"};
//        String b = "반가워";
//
//        char c = b.charAt(0);
//        char d = b.charAt(1);
//        char e = b.charAt(2);
//
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//
//    }

    // 내가 이런 방식으로 풀었으나 잘못 풀은 듯.
//    private String example(String s, int n) {
//        String result = null;
//
//        byte[] bytes = new byte[s.length()];
//
//        for (int i = 0; i < bytes.length; i++) {
//            bytes[i] = (byte) s.charAt(i);
//            char ch = (char) (bytes[i]);
//            result = ch;
//        }
//
//        Character.isLowerCase();
//
//        return result;
//    }
}
