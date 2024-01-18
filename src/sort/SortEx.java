package sort;

import java.util.Arrays;
import java.util.Collections;

public class SortEx {
    public static void main(String[] args) {
        int A[] = {5, 3, 2, 4, 1};
        Integer[] tmp = Arrays.stream(A).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, Collections.reverseOrder());
        System.out.println(Arrays.toString(tmp));
    }

    /*
물론, 코드를 더 자세히 설명해보겠습니다.

int A[] = {5, 3, 2, 4, 1};: 정수 배열 A를 선언하고 초기화합니다. A 배열에는 5, 3, 2, 4, 1이라는 다섯 개의 정수가 저장되어 있습니다.

Integer[] tmp = Arrays.stream(A).boxed().toArray(Integer[]::new);: int 배열 A를 Integer 객체로 변환하여 새로운 Integer 배열 tmp에 저장합니다. Arrays.stream(A)는 int 배열 A를 스트림으로 변환하고, boxed()는 각 요소를 해당하는 래퍼 클래스로 박싱합니다. 마지막으로 toArray(Integer[]::new)를 사용하여 Integer 배열로 변환합니다.

Arrays.sort(tmp, Collections.reverseOrder());: Arrays 클래스의 sort 메서드를 사용하여 Integer 배열 tmp를 내림차순으로 정렬합니다. Collections.reverseOrder()는 역순으로 정렬하는 Comparator를 생성하는 메서드입니다.

System.out.println(Arrays.toString(tmp));: 정렬된 Integer 배열 tmp를 출력합니다. Arrays.toString(tmp)는 배열의 내용을 문자열로 변환하여 출력합니다.*/

}
