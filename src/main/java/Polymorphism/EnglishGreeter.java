package Polymorphism;

public class EnglishGreeter implements Greeter {

    @Override
    public boolean sayHello() {
        System.out.println("Hello world");
        return false;
    }
}
