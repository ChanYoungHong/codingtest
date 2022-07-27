package problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_2667 {

    static int N;
    static int[] check = new int[]{1,-1,1,-1};
    static int[][] arr;
    static boolean[][] visited;
    static int[] result;

    //답 추가 코드
    static int count;

    // 동 서 남 북 다 돌아보기 위한 코드
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    // 마지막 결과 리스트
    static ArrayList<Integer> result1541;

    // 주변에 1이나 숫자가 있는지 확인하면서 돌기
    // 벽 근처나, 막 다른 길이면 어떻게 처리할지 생각하기 ???
    // 마지막 배열에 각각 숫자마다 개수 카운트해서 순서대로 sort 진행하기

    public static void main(String[] args) throws IOException {

//        Scanner sc = new Scanner(System.in);
//        N = sc.nextInt();
//
//        arr = new int[N][N];
//        visited = new boolean[N][N];
////        result = new int[3];
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                arr[i][j] = sc.nextInt();
//             }
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        visited = new boolean[N][N];

        //지도 배열 값 입력
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = input.charAt(j) - '0';
            }
        }

        //답 추가 코드
        count = 0;
        result1541 = new ArrayList<>();


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {


                if(arr[i][j] == 1 && !visited[i][j]) {
                    count = 1;
                    dffsfinding(i,j);
                    result1541.add(count);
                }
            }
        }

//        dfsfind(0);

        // 답 코드 추가
        Collections.sort(result1541);
        System.out.println(result1541.size());
        for (int a : result1541) {
            System.out.println(a);
        }

    }

    private static int dffsfinding(int i, int j) {
        visited[i][j] = true;

        // 4가 어디서 나오는 걸까 ????
        for (int k = 0; k < 4; k++) {

            int nx = i + dx[k];
            int ny = j + dy[k];

            if(0<=nx && nx<N && 0<=ny && ny<N){
                if(arr[nx][ny] == 1 && !visited[nx][ny]){
                    dffsfinding(nx, ny);
                    count++;
                }
            }
        }
        return count;

    }

//    private static void dfsfind(int idx) {
//        if(!visited[idx][idx]) {
//
//        }
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//
//
//
//            }
//        }
//    }



}
