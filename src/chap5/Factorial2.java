package chap5;

import java.util.Scanner;

public class Factorial2 {

    static int factorial(int n) {
        return (n > 0) ? n * factorial(n - 1) : 1; //조건 연산자로 한줄 정리

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수를 입력: ");
        int x = stdIn.nextInt();

        System.out.println(x + "의 팩토리얼은" + factorial(x));
    }
}
