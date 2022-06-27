package programmerslv1;

import java.util.ArrayList;

public class 부족한_금액_계산하기 {

    public static void main(String[] args) {
        
        부족한_금액_계산하기 t = new 부족한_금액_계산하기();
        System.out.println(t.calculate(3,20,4));

    }

    private long calculate(int price, int money, int count) {
        long answer = -1;
        long sum = 0;

        for (int i = 0; i < count; i++) {
            sum += price * (i + 1);
        }

        if(sum > money) answer = sum - money;

        return answer;
    }
}
