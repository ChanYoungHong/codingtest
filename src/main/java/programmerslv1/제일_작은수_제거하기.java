package programmerslv1;

public class 제일_작은수_제거하기 {

    static int[] arr;
    static int[] answer;

    public static void main(String[] args) {
//        arr = new int[]{4,3,2,1};
//
//        if(arr.length == 1){
//            answer = new int[]{-1};
//            return answer;
//        }
//
//        answer = new int[arr.length - 1];
//
//        for (int i = 0; i < answer.length; i++) {
//            answer[i] = arr[i];
//        }
//
//        return answer;


        arr = new int[]{4,3,2,1};

        if(arr.length == 1){
            answer = new int[]{-1};
            System.out.println(answer);
        }

        answer = new int[arr.length - 1];
        int min = arr[0];

        for (int i = 0; i < answer.length; i++) {
            min = Math.min(min, arr[i]);
        }

        int idx = 0;
        for (int i = 0; i < answer.length; i++) {
            if(arr[i] == min){
                continue;
            }
            answer[idx++] = arr[i];
            System.out.println(answer);
        }



    }
}
