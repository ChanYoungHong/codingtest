package programmersReview2;

public class 문자열내p와y의개수3 {

    public static void main(String[] args) {
        
        문자열내p와y의개수3 a = new 문자열내p와y의개수3();
        System.out.println(a.ad("pPoooyY"));
        System.out.println(a.ad("Pyy"));
    }

    private boolean ad(String s) {
        boolean answer = false;

        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                cnt++;
            } else if(s.charAt(i) == 'Y' || s.charAt(i) == 'y') {
                cnt--;
            }
        }

        if(cnt == 0){
            return true;
        }


        return answer;
    }
}
