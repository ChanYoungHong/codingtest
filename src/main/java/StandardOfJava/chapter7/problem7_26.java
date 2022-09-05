package StandardOfJava.chapter7;

class Outer12 {
    static class Inner12 {
        int iv = 200;
    }
}



public class problem7_26 {
    public static void main(String[] args) {
        Outer12 a = new Outer12();
        Outer12.Inner12 z = new Outer12.Inner12();
        System.out.println(z.iv);

    }
}
