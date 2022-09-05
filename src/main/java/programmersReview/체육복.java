package programmersReview;

public class 체육복 {

    public static void main(String[] args) {

        체육복 k = new 체육복();
        System.out.println(k.cheyookbok(5, new int[]{2,4}, new int[]{1,3,5}));
        System.out.println(k.cheyookbok(5, new int[]{2,4}, new int[]{3}));
        System.out.println(k.cheyookbok(3, new int[]{3}, new int[]{1}));

    }

    private int cheyookbok(int n, int[] lost, int[] reserve) {
        int[] people = new int[n];
        int answer = n;

        for (int l : lost)
            people[l-1]--; //  1 3 people[1] people[3]--
        for (int r : reserve)
            people[r-1]++; // 0 2 4 people[0] ++

        for (int i = 0; i < people.length; i++) {
            if(people[i] == -1) {
                if(i-1>=0 && people[i-1] == 1) {
                    people[i]++;
                    people[i-1]--;
                }else if(i+1< people.length && people[i+1] == 1) {
                    people[i]++;
                    people[i+1]--;
                }else
                    answer--;
            }
        }
        return answer;
    }
}
