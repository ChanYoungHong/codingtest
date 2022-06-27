package memospace;

import java.util.Scanner;

public class prac {

    static boolean[] arr;

    public static void main(String[] args) {

        prac k = new prac();
        System.out.println(k.hihi(10));

    }

    private boolean hihi(int x) {
        boolean answer = false;

        int y;
        int sum;

        y = x/10;
        int z = x%10;

        sum = (y+z);

        if(x%sum == 0){
           answer = true;
        }

        return answer;
    }

}
