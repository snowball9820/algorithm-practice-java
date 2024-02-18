package chap5;

import java.util.Scanner;

class GCDArray {
    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y,x%y);
        }
    }

    static int gcdArray(int a[], int start, int no) {
        if (no == 1)
            return a[start];
        else if (no == 2)
            return gcd(a[start], a[start + 1]);
        else
            return gcd(a[start], gcdArray(a, start + 1, no - 1));
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("몇 개 정수의 최대 공약수를 구할까요? : ");
        int num;
        do {
            num = stdIn.nextInt();
        } while (num <= 1);

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.println("최대 공약수는 " + gcdArray(x, 0, num));
    }
}
