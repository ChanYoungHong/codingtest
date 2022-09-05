package programmersReview;

import java.util.ArrayList;
import java.util.HashSet;

public class 폰켓몬2 {

    public static void main(String[] args) {

        폰켓몬2 k = new 폰켓몬2();
        System.out.println(k.ckwndk(new int[]{3,1,2,3}));
        System.out.println(k.ckwndk(new int[]{3,3,3,2,2,4}));
        System.out.println(k.ckwndk(new int[]{3,3,3,2,2,2}));
    }

    private int ckwndk(int[] nums) {
//        int answer = 0;
//        int tmp = -1;
//
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//
//            if(nums[i] != tmp){
//                arrayList.add(nums[i]);
//                tmp = nums[i];
//            }
//        }
//
//        return arrayList.size();
        int answer = 0;

        // 중복을 제거한다.
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
            System.out.print(hs+" ");
        }
        // 3 > 2, 3 > 3
        if(hs.size() > nums.length/2){
            // 2, 3
            return nums.length/2;
        }

        return hs.size();
    }
}
