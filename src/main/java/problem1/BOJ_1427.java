package problem1;

import java.util.*;

public class BOJ_1427 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String num1 = String.valueOf(sc.nextInt());

        List array2 = new ArrayList(num1.length());

        for (int i = 0; i < num1.length(); i++) {
            array2.add(num1.charAt(i));
            array2.sort(Comparator.reverseOrder());
        }
        String str = array2.toString().replaceAll("[^0-9]","");
        System.out.println(str);
    }
}
