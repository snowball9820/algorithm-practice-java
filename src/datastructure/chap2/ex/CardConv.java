package datastructure.chap2.ex;

import java.util.Scanner;

class CardConv {
    // 정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어 두고 자릿수를 반환
    static int cardConv(int x, int r, char[] d) {
        int digits = 0;                        // 변환 뒤 자릿수
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);    // r로 나눈 나머지를 저장를 배열 d에 저장하면 됨
            x /= r; //나누고 나온 몫은 x에 게속 대입
        } while (x != 0); //x가 0이 아니면 계속 반복

        for (int i = 0; i < digits / 2; i++) {    // 배열 d의 숫자 문자열을 역순 정렬
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t;
        }
        //저장된 값을 역순으로 바꿔줘야 함

        return digits;
        //변환된 자릿수를 알 수 있음 , 배열 d에 저장된 숫자의 갯수
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;                       // 변환할 정수
        int cd;                       // 기수
        int dno;                      // 변환 뒤 자릿수
        int retry;                    // 다시 한 번?
        char[] cno = new char[32];    // 변환 후 각 자리의 숫자를 넣어 두는 문자 배열

        System.out.println("10진수를 기수 변환합니다.");
        do {
            do {
                System.out.print("변환하는 음이 아닌 정수: ");
                no = stdIn.nextInt();
            } while (no < 0);

            do {
                System.out.print("어떤 진수로 변환할까요?(2-36): ");
                cd = stdIn.nextInt();
            } while (cd < 2 || cd > 36);//2~36 사이의 수가 나올 때 까지 계속 반복하기 위함
            //2보다 작거나 36보다 큰 수를 입력한다면 계속 어떤 진수로 변환할까요 물어봄

            dno = cardConv(no, cd, cno);            // no를 cd 진수로 변환

            System.out.print(cd + "진수로 ");
            for (int i = 0; i < dno; i++)            // 순서대로 표시
                System.out.print(cno[i]);
            System.out.println("입니다.");

            System.out.print("다시 한 번 할까요? (1…예/0…아니오): ");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }
}