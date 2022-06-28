package programmerslv1;

import java.util.ArrayList;
import java.util.Arrays;

public class 예산 {
    public static void main(String[] args) {


        예산 d = new 예산();
        System.out.println(d.budget(new int[]{1,3,2,5,4}, 9));
        System.out.println(d.budget(new int[]{2,2,3,3}, 10));

    }

    private int budget(int[] d, int budget) {

        // 다른 사람 풀이
        int answer = 0;
        int result = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            result += d[i];

            if(result > budget) {
                answer = i;
                break;
            }
        }
        if(result <= budget) {
            answer = d.length;
        }
        return answer;
    }
}

// 내가 풀었던 방식
//    int cnt = 0;
//    int tmp = 0;
//
//    ArrayList<Integer> dlist = new ArrayList();
//
//        for (int i = 0; i < d.length; i++) {
//    for (int j = i+1; j < d.length; j++) {
//    for (int k = j+1; k < d.length; k++) {
//
//    tmp = d[i]+d[j]+d[k];
//    if((tmp) <= budget){
//    cnt++;
//    }
//    }
//    }
//    }
//    answer = cnt;