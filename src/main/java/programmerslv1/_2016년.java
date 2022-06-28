package programmerslv1;

import java.util.Calendar;

public class _2016년 {

    public static void main(String[] args) {


        _2016년 a = new _2016년();
        System.out.println(a.calender(5, 24));
    }

    private String calender(int a, int b) {
        String answer = "";

        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED",
            "THU"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int allDate = 0;
        for (int i = 0; i < a - 1; i++) {
            allDate += month[i];
        }

        allDate += (b-1); // -1을 하지 않으면 1월 1일이 지난 걸로 계산 됨
        answer = day[allDate%7];

        return answer;



//        switch(){
//            case 1:
//                System.out.println("FRI");
//                break;
//            case 2:
//                System.out.println("SAT");
//            case 3:
//                System.out.println("SUN");
//            case 4:
//                System.out.println("MON");
//            case 5:
//                System.out.println("TUE");
//            case 6:
//                System.out.println("WED");
//            case 7:
//                System.out.println("THU");
//        }
//
//        return answer;
    }
}
