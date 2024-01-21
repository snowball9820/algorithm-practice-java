package doitalgorithm;

import java.util.Scanner;

public class SubjectAverageRef {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        //배열 날려버리고
//        int A[] = new int[N]; //길이가 N인 1차원 배열 A[] 선언하기
//
//        for (int i = 0; i < N; i++) {
//            A[i] = scanner.nextInt();
//        }
        long sum = 0;
        long max = 0;

        for (int i = 0; i < N; i++) {
            //그냥 바로 입력 받아도 됨
            int temp = scanner.nextInt();
            if (temp > max) max = temp;
            sum = sum + temp;
        }
        System.out.println(sum * 100.0 / max / N);

    }
}
