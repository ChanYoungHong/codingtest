package programmerslv1;

public class 문자열_내p와y의_개수 {

    public static void main(String[] args) {

        문자열_내p와y의_개수 z = new 문자열_내p와y의_개수();
//        System.out.println(z.findPy("pPoooyY"));
//        System.out.println(z.findPy("Pyy"));

        System.out.println(z.findPy2("pPoooyY"));
        System.out.println(z.findPy2("Pyy"));

    }

    // 배열을 이용해서 접근 해보기
    private boolean findPy2(String s) {
        boolean answer = true;

        char[] chars = s.toCharArray();
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < s.length(); i++) {

            if(String.valueOf(chars[i]).contains("p") ||
                String.valueOf(chars[i]).contains("P")){
                cnt1++;
            } else if(String.valueOf(chars[i]).contains("y") ||
                String.valueOf(chars[i]).contains("Y")){
                cnt2++;
            }
        }

        if(cnt1 == cnt2){
            answer = true;
        } else{
            answer = false;
        }
        return answer;
    }

//    private boolean findPy(String s) {
//        boolean answer = true;
//        int cnt1 = 0;
//        int cnt2 = 0;
//
//        for (int i = 0; i < s.length(); i++) {
////            cnt1 = 0;
////            cnt2 = 0;
//
//            if(s.contains("p") && s.contains("P")){
//                cnt1++;
//            } else if(s.contains("y") && s.contains("Y")){
//                cnt2++;
//            }
//        }
//
//        if(cnt1 == cnt2) {
//            answer = true;
//        }else if(cnt1 != cnt2) {
//            answer = false;
//        }
//
//        return answer;
//    }
}
