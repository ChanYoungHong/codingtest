package StandardOfJava.chapter6;

import java.util.Arrays;

public class problem6_20 {

    public static int[] shuffle(int[] arr){
        arr = new int[]{};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.round(i);
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(Arrays.toString(result));
    }

}
