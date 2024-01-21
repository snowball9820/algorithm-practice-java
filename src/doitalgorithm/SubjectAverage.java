package doitalgorithm;

import java.util.Scanner;

public class SubjectAverage {
    public static void main(String[] args) {
        //변수 N에 과목의 수 입력받기
        //길이가 N인 1차원 배열 A[] 선언하기
        //for(A[] 길이만큼 반복하기){
//        A[i]에 각 점수 저장하기
//        }
//        for(A[] 길이만큼 반복하기){
//        최고점은 수 max에 총점은 변수 sum에 저장하기
//        }
//        sum*100/max/N 출력하기
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A[] = new int[N]; //길이가 N인 1차원 배열 A[] 선언하기

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        long sum = 0;
        long max = 0;

        for (int i = 0; i < N; i++) {
            if (A[i] > max) max = A[i];
            sum = sum + A[i];
        }
        System.out.println(sum * 100.0 / max / N);

    }
}
