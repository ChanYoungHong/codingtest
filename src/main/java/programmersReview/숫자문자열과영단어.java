package programmersReview;

public class 숫자문자열과영단어 {

    public static void main(String[] args) {

        숫자문자열과영단어 k = new 숫자문자열과영단어();
        System.out.println(k.numAndMunja("one4seveneight"));
        System.out.println(k.numAndMunja("23four5six7"));
        System.out.println(k.numAndMunja("2three45sixseven"));
        System.out.println(k.numAndMunja("123"));
    }

    private int numAndMunja(String s) {
        int answer = 0;

        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] words = {"zero", "one", "two", "three", "four", "five"
        , "six", "seven", "eight", "nine"};

        // ㅇㅇㅇㅇ
        for (int i = 0; i < 10; i++) {
            s = s.replaceAll(words[i], String.valueOf(nums[i]));

        }

        return Integer.parseInt(s);
    }

}
