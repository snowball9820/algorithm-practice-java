package chap5;

import java.util.Scanner;

public class Hanoi {
    static void move(int no, int x, int y) {
        if (no > 1) {
            move(no-1,x,6-x-y);
        }
        System.out.printf("원반[%d]를 %d번 기둥에서 %d번 기둥으로 옮김\n",no,x,y);

        if (no > 1) {
            move(no-1,6-x-y,y);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("하노이의 탑 도전");
        System.out.print("원반의 개수: ");
        int n = scanner.nextInt();

        move(n,1,3);//1번 기둥에 있는 n개의 원반을 3번 기둥으로 옮김

    }


}
