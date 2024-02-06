package datastructure.reverse;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray2 {

    //배열 요소 a[idx1]과 a[idx2]의 자리 교체
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1]; //일단 t에 idx1을 보관
        a[idx1] = a[idx2];//a[idx1]에 a[idx2]를 대입
        a[idx2] = t;//a[idx2]에 t에 보관한 idx1값을 대입

    }

    //배열 a의 요소를 역순으로 정렬
    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {//교환횟수가 요솟수/2, 요솟수가 홀수 일때에는 가운데 요소 교환X 나머지 버림
            swap(a, i, a.length - i - 1);
            //i=0일때에는 요솟수가 7이면 7-i-1=7-0-1=6 i=6과 교환
            //i=1일때에는 요솟수가 7이면 7-1-1=5 i=5와 교환
            //i=2일때에는 요솟수가 7이면 7-2-1=4 i=4와 교환
            //--> n-i-1과 교환하게 됨
        }
    }

    public static void main(String[] args) {
        //Scanner 객체
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수:");
        //int num 에 요솟수 받아줌
        int num = stdIn.nextInt();

        //배열 x 생성 요솟수 num 크기
        int[] x = new int[num];
        //for문으로 입력 받은 수 대입
        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "]" + i);
            x[i] = stdIn.nextInt();
        }
        //reverse메서드 사용해서 배열 a요소를 역순으로 정렬
        reverse(x);

        System.out.println("요소를 역순으로 정렬했습니다.");
        //Arrays.toString 메서드를 사용해서 배열의 전체 요솟값을 한번에 표시해줌
        //모든 요소를 쉼표(,)로 구분하여 []로 둘러싼 문자열을 얻음
        System.out.println("x = "+ Arrays.toString(x));
    }
}
