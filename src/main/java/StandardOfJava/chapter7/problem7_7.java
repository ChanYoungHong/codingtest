package StandardOfJava.chapter7;


class Parent {
    int x = 100;

    Parent() {
        this(200);
    }

    public Parent(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

class Child extends Parent {

    int x = 3000;
    Child() {
        this(1000);
    }

    public Child(int x) {
        this.x = x;
    }

}


public class problem7_7 {
    public static void main(String[] args) {
        Child c = new Child();

        System.out.println("x="+c.getX());
    }
}
