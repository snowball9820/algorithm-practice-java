package doitalgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumOfTheSections {
    //    suNo(숫자개수), quizNo(질의개수) 저장하기
//    for(숫자 개수만큼 반복){
//     합 배열 생성(S[i]=S[i-1]+A[i])
//    }
//    for(질의 개수 만큼 반복){
//     질문 범위 받기(i~j)
//     구간 합 출력하기(S[j]=S[i-1])
//    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer를 사용해서 분리해서 사용
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int suNo = Integer.parseInt(stringTokenizer.nextToken()); //데이터 수 저장
        int quizNo = Integer.parseInt(stringTokenizer.nextToken()); //질의 개수 저장
        //합 배열 long형으로 선언
        long[] S = new long[suNo + 1];//배열은 0번째 인덱스를 가지고 있는데 그걸 무시하기 위함
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 1; i <= suNo; i++) {
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for (int q = 0; q < quizNo; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            //첫번째 나온 숫자
            int i = Integer.parseInt(stringTokenizer.nextToken());
            //두번째 나온 숫자
            int j = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(S[j] - S[i - 1]);


        }

    }

}
//10만개 이상 입력될 수 있으니 BufferedReader 사용
