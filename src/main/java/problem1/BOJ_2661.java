package problem1;

import java.util.Scanner;

public class BOJ_2661 {

    static int N;
//    static int[] arr;
//    static boolean[] visit;
//    static String result;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        bakkkkikikng("");

//        arr = new int[N];
//        visit = new boolean[N];
//
//        backkkkkk("");
//        System.out.println(result);

    }

    private static void bakkkkikikng(String result) {

        if (result.length() == N) {
            System.out.println(result);
            System.exit(0);
        } else {
            for (int i = 1; i <= 3; i++) {
                if (useGoodSequence(result + i)) {
                    bakkkkikikng(result + i);
                }
            }
        }
    }

    private static boolean useGoodSequence(String s) {

        int length = s.length() / 2;

        for (int i = 1; i <= length; i++) {

            if(s.substring(s.length() - i).equals(s.substring(s.length() - 2*i, s.length() - i))) {
                return false;
            }
        }


        return true;
    }

//    private static String backkkkkk(String s) {
//
//        for (int j = 1; j <= 3; j++) {
//            result += s+arr[j];
//            ckckck();
//        }
//
//        return s;
//    }

//    private static void ckckck() {
//
//        int length = arr.length / 2;
//
//        for (int i = 1; i <= N; i++) {
//            result += result.substring(result.substring(length).equals(result.substring(N * 2, 1)));
//        }
//    }

}


