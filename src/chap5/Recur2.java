package chap5;

import java.util.Scanner;

public class Recur2 {
    static void recur2(int n) {
        if (n > 0) {
            recur2(n-2);
            System.out.println(n);
            recur2(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수 입력:");
        int x = stdIn.nextInt();

        recur2(x);
    }
}
