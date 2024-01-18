package doitalgorithm;

import java.util.Scanner;

public class SumOfNumbers {

    //    일단 N값 입력 받기
//    길이 N 숫자를 입력 받아서 String 변수에 sNum 저장
//    sNum을 다시 chat[]형 변수 cNum에 변환해서 저장
//    int형 변수 sum 선언
//    for(cNum 길이만큼 반복){
//    배열의 각 자릿값을 정수형으로 변환->sum에 더해서 누적
//    }
//    sum 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;

        for (int i = 0; i < cNum.length; i++){
            sum+=cNum[i]-'0'; //아스키코드 문자1을 숫자1로 변환하려면 '1'-48 또는 '1'-'0'을 해야함
        }
        System.out.println(sum);


    }
}
