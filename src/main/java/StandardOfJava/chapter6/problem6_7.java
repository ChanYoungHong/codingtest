package StandardOfJava.chapter6;

public class problem6_7 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1,1);

        System.out.println(p.getDistance(2,2));
    }

    private static class MyPoint {
        int x;
        int y;

        public MyPoint(int x, int y) {
            this.x = x;
            this.y = y;
        }

        // 메소드 매개변수 쓰는 것 알아두기.
        double getDistance(int x1, int y1){

            return Math.sqrt((x - x1)*(x-x1) + (y-y1)*(y-y1));
        }
    }
}
