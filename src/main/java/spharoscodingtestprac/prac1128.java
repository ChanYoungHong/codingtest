package spharoscodingtestprac;

public class prac1128 {
    public static void main(String[] args) {
        int answer = 0;
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};

        for (int i = 0; i < absolutes.length; i++) {
            if(signs[i] == true){
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }

        System.out.println(answer);
    }
}