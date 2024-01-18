package doitalgorithm;

public class timeComplexityExample1 {
    public static void main(String[] args) {
        //1~100 사이 값 랜덤 선택
        int findNumber = (int) (Math.random() * 100);
        for (int i = 0; i < 100; i++) {
            if (i == findNumber) {
                System.out.println(i);
                break;
            }
        }
    }
}
//findNumber가 0일때가 가장 좋음 바로 찾을 수 있음 -빅 오메가
//보통일 때 average니까 50 정도 N/2 -빅 세타
//99가 나오는게 제일 최악 -빅 오


