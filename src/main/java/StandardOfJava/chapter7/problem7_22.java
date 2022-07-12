package StandardOfJava.chapter7;


abstract class Shape {
    Point p;

    Shape() {
        this(new Point(0,0));
    }

    Shape(Point p) {
        this.p = p;
    }

    abstract double calcArea();

    Point getPosition() {
        return p;
    }

    void setPosition(Point p){
        this.p = p;
    }

}

class Point {
    int x;

    int y;
    Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "["+x+","+y+"]";
    }
}


class Circle extends Shape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public Circle(Point p, double r) {
        super(p);
        this.r = r;
    }

    @Override
    double calcArea() {
        return 0;
    }

}

class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Point p, double width, double height) {
        super(p);
        this.width = width;
        this.height = height;
    }

    boolean isSquare() {


        return false;
    }


    @Override
    double calcArea() {
        return 0;
    }
}


public class problem7_22 {

    public static void main(String[] args) {


    }
}
