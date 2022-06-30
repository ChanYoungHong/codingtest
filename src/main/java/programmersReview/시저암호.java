package programmersReview;

public class 시저암호 {

    static char ch;
    static int num;

    public static void main(String[] args) {
        
        시저암호 k = new 시저암호();
        System.out.println(k.chanwon("AB", 1));
        System.out.println(k.chanwon("z", 1));
        System.out.println(k.chanwon("a B z", 4));


        System.out.println(k.kkk("AB", 1));
        System.out.println(k.kkk("z", 1));
        System.out.println(k.kkk("a B z", 4));
    }


    // 다른 사람이 풀었던 풀이.
    private String kkk(String s, int n) {
        String result = "";
        n = n % 26;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }
            result += ch;
        }
        return result;
    }

    private String chanwon(String s, int n) {
        String answer = "";

//        for (int i = 0; i < s.length(); i++) {
//            answer += String.valueOf(s.charAt(i)+n);
//        }

        for (int i = 0; i < s.length(); i++) {
            num = (s.charAt(i)+n);
        }

        return String.valueOf(ch);
    }

}
