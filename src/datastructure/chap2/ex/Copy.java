package datastructure.chap2.ex;

import java.util.Scanner;

public class Copy {
    static void copy(int[] a, int[] b) {
        int num = a.length <= b.length ? a.length : b.length;
        for (int i = 0; i < num; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a의 요솟수는 : ");
        int numa = stdIn.nextInt();//요솟수
        int[] a = new int[numa];
        for (int i = 0; i < numa; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = stdIn.nextInt();
        }

        System.out.print("b의 요솟수는 : ");
        int numb = stdIn.nextInt();//요솟수
        int[] b = new int[numb];
        for (int i = 0; i < numb; i++) {
            System.out.print("b[" + i + "]: ");
            b[i] = stdIn.nextInt();
        }

        copy(a,b);//배열 b의 모든 요소를 배열 a에 copy

        System.out.println("배열 b의 모든 요소를 배열 a에 copy함");
        for (int i = 0; i < numa; i++) {
            System.out.println("a["+i+"] = "+a[i]);
        }
    }
}
