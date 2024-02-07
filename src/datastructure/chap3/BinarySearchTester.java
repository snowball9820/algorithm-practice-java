package datastructure.chap3;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력.");

        System.out.print("x[0]: "); //배열의 첫 요소를 먼저 받음, 다음 요소랑 비교하려고
        x[0] = stdIn.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = stdIn.nextInt();

            } while (x[i] < x[i - 1]);//바로 앞 요소보다 작은 값이 들어오면 계속 반복
        }

        System.out.println("검색할 값: ");
        int ky = stdIn.nextInt();

        int idx = Arrays.binarySearch(x, ky);
        //배열 x에서 값이 ky인 요소 검색 java.util.Arrays 클래스의 binarySearch->자바 표준 라이브러리
        //이진검색 메서드 직접 작성X, 배열요소 자료형 관계없이 검색 가능

        if (idx < 0) {
            System.out.println("그 값의 요소 없음");
        } else {
            System.out.println("그 값은 x[" + idx + "]에 있음");
        }
    }
}
