package programmerslv1;

import java.util.ArrayList;

public class 포켓몬 {

    public static void main(String[] args) {

        포켓몬 p = new 포켓몬();
        System.out.println(p.getting(new int[]{3,1,2,3}));
        System.out.println(p.getting(new int[]{3,3,3,2,2,4}));
        System.out.println(p.getting(new int[]{3,3,3,2,2,2}));
    }

    private int getting(int[] nums) {
        int answer = 0;

        ArrayList<Integer> numslist = new ArrayList<>();

        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if(!numslist.contains(nums[i])){
                numslist.add(nums[i]);
            }
        }

        if(numslist.size() >= nums.length/2){
            answer = nums.length/2;
        } else {
            answer = numslist.size();
        }

        return answer;
    }

}
