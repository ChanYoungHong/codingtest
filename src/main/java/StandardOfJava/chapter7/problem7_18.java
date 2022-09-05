package StandardOfJava.chapter7;


// 다시 한 번 풀어보기
public class problem7_18 {

    static void action(Robot1 r) {

        if(r instanceof DanceRobot) {
            DanceRobot dr = (DanceRobot) r;
            dr.dance();
        }else if(r instanceof SingRobot){
            SingRobot sr = (SingRobot) r;
            sr.sing();
        }else if(r instanceof DrawRobot){
            DrawRobot dr = (DrawRobot) r;
            dr.draw();
        }
    }

    public static void main(String[] args) {
        Robot1[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};

        for (int i = 0; i < arr.length; i++) {
            action(arr[i]);
        }
    }
}

class Robot1 {}

class DanceRobot extends Robot1 {
    void dance() {
        System.out.println("춤을 춥니다.");
    }
}

class SingRobot extends Robot1 {
    void sing() {
        System.out.println("노래를 합니다.");
    }
}

class DrawRobot extends Robot1 {
    void draw() {
        System.out.println("그림을 그립니다.");
    }
}
