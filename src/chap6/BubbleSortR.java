package chap6;

import java.util.Scanner;

public class BubbleSortR {
    //배열의 요소 a[idx1]과 a[idx2]를 교환
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }

    //단순교환정렬
    static void bubbleSort(int[] a, int n) {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++)	// 맨앞 → 맨끝 순서로 스캔
                if (a[j] > a[j + 1])
                    swap(a, j, j + 1);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("단순교환정렬(버블 정렬)");
        System.out.print("요솟수 : ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        bubbleSort(x, nx);// 배열 x를 단순교환정렬

        System.out.println("오름차순으로 정렬.");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "]＝" + x[i]);
    }
}
