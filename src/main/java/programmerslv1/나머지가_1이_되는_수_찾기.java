package programmerslv1;

public class 나머지가_1이_되는_수_찾기 {

    public static void main(String[] args) {

        나머지가_1이_되는_수_찾기 w = new 나머지가_1이_되는_수_찾기();
        System.out.println(w.findOne(10));
        System.out.println(w.findOne(12));
    }

    private int findOne(int n) {
        int answer = 0;

        for (int i = 3; i < 10000000; i++) {

            if(n%i == 1){
                answer = i;
                break;
            }
        }


        return answer;
    }
}
