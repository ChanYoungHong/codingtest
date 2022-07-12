package StandardOfJava.chapter7;

class Outer123 {
    int value = 10;

    class Inner1234 {
        int value = 20;

        void method1() {
            int value = 30;

            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer123.this.value);

        }
    }
}






public class problem7_27 {
    public static void main(String[] args) {

//        Outer123 o = new Outer123();
//        Outer123.Inner1234 inner123 = Outer123.Inner1234;
//
//        Outer123.Inner1234 inner1234 = new Outer123.Inner1234();
//        inner1234.method1();

        Outer123 outer = new Outer123();
        Outer123.Inner1234 inner = outer.new Inner1234();

        inner.method1();
    }
}
