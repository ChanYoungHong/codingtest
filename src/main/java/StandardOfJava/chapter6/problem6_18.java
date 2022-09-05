package StandardOfJava.chapter6;

public class problem6_18 {

}

// static 변수는 초기화에 인스턴스변수를 사용 할 수 없음
//

class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    int cv2 = iv;

    void staticMethod1(){
        System.out.println(cv);
        System.out.println(iv);
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);

    }

    void staticMethod2() {
        staticMethod1();
        instanceMethod1();
    }

    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }
}

