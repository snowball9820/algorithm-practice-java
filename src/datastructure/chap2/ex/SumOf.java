package datastructure.chap2.ex;

import java.util.Scanner;

class SumOf {

    //배열 a의 요소값 출력
    static int sumOf(int[] a) {
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return  sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요솟수 : ");
        int num=stdIn.nextInt();

        int[] a = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("a[" + i + "]:");
            a[i] = stdIn.nextInt();
        }

        System.out.println("모든 요소 합계: "+sumOf(a));
    }
}
