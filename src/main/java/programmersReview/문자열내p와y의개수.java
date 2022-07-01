package programmersReview;

public class 문자열내p와y의개수 {

    public static void main(String[] args) {

        문자열내p와y의개수 k = new 문자열내p와y의개수();
        System.out.println(k.ckckckckck("pPoooyY"));
        System.out.println(k.ckckckckck("Pyy"));
    }

    private boolean ckckckckck(String s) {
        boolean answer = false;

        s = s.toLowerCase();
        int cnt = 0;
        int cnt2 = 0;

        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == 'p'){
                cnt++;
            } else if(s.charAt(i) == 'y'){
                cnt2++;
            }
        }

        if(cnt == cnt2){
            return true;
        }else {
            return false;
        }
    }
}
