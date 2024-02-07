package datastructure.chap3;

import java.util.Scanner;

class BinSearch {
    static int binSearch(int[] a, int n, int key) {
        int pl=0; //검색 범위 첫 인덱스
        int pr = n - 1; //검색 범위 마지막 인덱스
        do {
            int pc = (pl + pr) / 2;//가장 중앙 요소 인덱스
            if (a[pc] == key) {
                return pc; //한번에 검색
            } else if (a[pc] < key) {
                pl = pc + 1; //검색 범위를 뒤쪽 절반으로 좁힘 0->중앙값 보다 +1
            } else {
                pr=pc-1; //검색 범위를 앞쪽 절반으로 좁힘, n-1 인덱스 마지막 요소 ->중앙값보다 -1
            }
        } while (pl<=pr);
        return -1; //검색 실패시 -1반환
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력");

        System.out.print("x[0] : ");
        x[0] = stdIn.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x["+i+"] : ");
                x[i] = stdIn.nextInt();
            } while (x[i]<x[i-1]);//바로 앞 요소보다 작으면 계속 다시 입력
        }

        System.out.print("검색할 값:");
        int ky = stdIn.nextInt();

        int idx = binSearch(x, num, ky);//배열 x에서 값이 ky인 요소 검색

        if (idx == -1) {
            System.out.println("존재하지 않는 요소");
        } else {
            System.out.println("그 값은 x["+idx+"]에 있음");
        }

    }

}
