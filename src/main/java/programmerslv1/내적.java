package programmerslv1;

public class 내적 {

    public static void main(String[] args) {

        내적 s = new 내적();
        System.out.println(s.where(new int[]{1,2,3,4}, new int[]{-3,-1,0,2}));
        System.out.println(s.where(new int[]{-1,0,1}, new int[]{1,0,-1}));
    }

    private int where(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i]*b[i];
        }

        return answer;
    }
}
