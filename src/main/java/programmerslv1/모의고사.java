package programmerslv1;

import java.util.ArrayList;

public class 모의고사 {

    public static void main(String[] args) {
        모의고사 a = new 모의고사();
        System.out.println(a.a(new int[]{1,2,3,4,5}));
        System.out.println(a.a(new int[]{1,3,2,4,2}));
    }

    private int[] a(int[] answers) {
        int[] answer = {};
        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};
//        int answer1=0, answer2=0, answer3=0;


        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        for (int i = 0; i < answers.length; i++) {
            if(person1[i%person1.length] == answers[i]) cnt1++;
            if(person1[i%person2.length] == answers[i]) cnt2++;
            if(person1[i%person3.length] == answers[i]) cnt3++;
        }
//        for (int i = 0; i < person1.length; i++) {
//
//            if(person1[i] == answers[i]){
//                cnt1++;
//            }
//        }
//
//        for (int i = 0; i < person2.length; i++) {
//            if(person2[i] == answers[i]){
//                cnt2++;
//            }
//        }
//
//        for (int i = 0; i < person3.length; i++) {
//            if(person3[i] == answers[i]){
//                cnt3++;
//            }
//        }

        int max = Math.max(Math.max(cnt1, cnt2), cnt3);

        ArrayList<Integer> arrayList = new ArrayList<>();

        if(max == cnt1) arrayList.add(1);
        if(max == cnt2) arrayList.add(2);
        if(max == cnt3) arrayList.add(3);

        answer = new int[arrayList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }

}
