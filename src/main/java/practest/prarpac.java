package practest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class prarpac {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("jordan", "coco", "comtin", "manty");
        names.replaceAll(new UnaryOperator<String>() { // 단항 연산자 // 하나의 인자를 받아서 대문자로 바꾸는 메소드
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        });

        System.out.println(names);




        List<String> names2= Arrays.asList("jordan", "coco", "comtin", "manty");
        names.replaceAll(s -> s.toUpperCase()); // 메서드의 인자정보와 구현정보만 알면 된다.
        System.out.println(names);

        List<String> academy = Arrays.asList("이민", "곽영", "강수", "남주", "이후");
        academy.replaceAll( a -> a.toUpperCase());
        System.out.println(academy);

        System.out.println("======================================================================");

        List<String> names3 = Arrays.asList("jordan", "coco", "comtin", "manty");
        names.replaceAll(
                new UnaryOperator<String>() {   // 익명 클래스 선언과 객체화
                    @Override
                    public String apply(String s) {
                        return s.toUpperCase(); // 이 부분이 구현의 핵심
                    }
                });
        System.out.println(names);

        List<String> names4 = Arrays.asList("jordan", "coco", "comtin", "manty");
        // names.replaceAll((String s) -> { return s.toUpperCase(); }); // 문이 하나인 경우 return 생략 가능
        // names.replaceAll((String s) -> s.toUpperCase()); // 인자의 타입 생략 가능
        // names.replaceAll((s) -> s.toUpperCase());        // 인자가 하나인 경우 () 생략 가능
        names.replaceAll(s -> s.toUpperCase()); // 람다식
        // 이 다음 단계도 있는데 이따가 배울 거에요. 메서드 레퍼런스
        System.out.println(names);


    }
}