package datastructure;

import java.util.Scanner;

public class Median {

    static int med3(int a, int b, int c) {
        if(a>=b){
            if (b >= c) {
                return b;
            } else if (a <= c) {
                return a;

            } else {
                return c;
            }
        } else if (a>c) {
            return a;
        } else if (b > c) {
            return c;
        } else {
            return b;
        }
    }

    static int med3Ref(int a,int b,int c) {
        if ((b >= a && c <= a) || (b <= a && c >= a)) {
            return a;

        } else if ((a > b && c < b) || (a < b && c > b)) {
            return b;

        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("세 정수의 중앙값을 구합니다.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("중앙값은 : "+med3(a,b,c));
        System.out.println("중앙값은 : "+med3Ref(a,b,c));
    }

}
