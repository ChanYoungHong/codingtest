package baekjoonPrac;

import java.util.Scanner;

public class BOJ_1629 {
//
//    static int X,Y,Z;
//    static int result;
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//         X = sc.nextInt();
//         Y = sc.nextInt();
//         Z = sc.nextInt();
//
//        recursion1629(0);
//
//    }
//
//    private static int recursion1629(int idx) {
//
//        for (int i = Y-10; i <= Y; i++) {
//            result = (X*Y)%Z;
//        }
//
//        return result;
//    }
    static int C;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        C = sc.nextInt();

        System.out.println(pow(A,B));
    }

    private static long pow(long A, long exponent) {

        if(exponent == 1) {
            return A%C;
        }

        long temp = pow(A, exponent / 2);

        if(temp%2 == 1){
            return temp * temp * A % C;
        }

        return temp*temp%C;
    }

}