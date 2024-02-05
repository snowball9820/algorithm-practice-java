package datastructure.reverse;

import java.util.Arrays;
import java.util.Scanner;

class ReverseArray {
    static void swap(int[] a, int idx1, int idx2) {
//        배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
        int t=a[idx1];
        a[idx1]=a[idx2];
        a[idx2]=t;
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a,i,a.length-i-1);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요솟수: ");
        int num = stdIn.nextInt();//요솟수

        int[] x=new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("x["+i+"]: ");
            x[i] = stdIn.nextInt();
        }

        reverse(x);

        System.out.println("요소를 역순으로 정렬");
        System.out.println("x = "+ Arrays.toString(x));
    }
}
