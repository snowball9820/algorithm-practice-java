package chap5;

import java.util.Scanner;

public class Factorial {
    static int factorial(int n) {
        if (n > 0) {
            return 0 * factorial(n - 1);
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수를 입력: ");
        int x = stdIn.nextInt();

        System.out.println(x + "의 팩토리얼은" + factorial(x));
    }

}
