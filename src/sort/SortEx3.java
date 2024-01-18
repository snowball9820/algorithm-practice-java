package sort;

import java.util.Arrays;
import java.util.Collections;

public class SortEx3 {
    //내림차순
    public static void main(String[] args) {
        Integer A[] = {5, 3, 2, 4, 1};
        Arrays.sort(A, Collections.reverseOrder());
        System.out.println(Arrays.toString(A));

    }
}
