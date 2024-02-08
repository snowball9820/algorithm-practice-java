package datastructure.chap4;

public class IntArrayQueue {
    private int[] que; //큐 본체
    private int capacity; //큐 용량
    private int num; //현재 데이터 개수

    //실행 시 예외 : 큐가 비어 있음
    public class EmptyIntArrayQueueException extends RuntimeException {
        public EmptyIntArrayQueueException() { }
    }

    //실행 시 예외 : 큐가 가득 참
    public class OverflowIntArrayQueueException extends RuntimeException {
        public OverflowIntArrayQueueException() { }
    }

    //생성자
    public IntArrayQueue(int maxlen) {
        num=0;
        capacity = maxlen;
        try {
            que = new int[capacity];
        } catch (OutOfMemoryError error) {
            capacity=0;
        }
    }

    //인큐
    public int enque(int x) throws OverflowIntArrayQueueException{
        if (num >= capacity) {
            throw new OverflowIntArrayQueueException();
        }
        que[num++]=x;
        return x;
    }
    //디큐
    public int deque()throws EmptyIntArrayQueueException {
        if (num <= 0) {
            throw new EmptyIntArrayQueueException();
        }
        int x = que[0]; //큐가 비어있지 않은 경우, 큐의 첫 번째 원소를 변수 x에 저장
        for (int i = 0; i < num - 1; i++) {//큐에서 원소를 제거하기 위해 for 루프를 사용,루프는 배열의 첫 번째 원소부터 마지막 원소의 이전 원소까지 반복(num - 1까지).
            que[i] = que[i + 1]; //각 반복에서는 현재 인덱스의 원소를 그 다음 인덱스의 원소로 덮음. 즉, que[i] = que[i + 1]과 같이 작성
        }
        num--;//모든 원소를 한 칸씩 앞으로 이동, 이제 큐의 크기를 하나 줄임
        return x;
    }
// que 배열의 첫 번째 원소를 변수 x에 저장, 나머지 원소들을 한 칸씩 앞으로 당김
//마지막으로 num을 감소
    public int peek() throws EmptyIntArrayQueueException {
        if (num <= 0)
            throw new EmptyIntArrayQueueException();			// 큐가 비어 있음
        return que[num - 1];
    }

    //큐에서 x를 검색하여 인덱스(발견하지 못하면 -1)를 반환
    public int indexOf(int x) {
        for (int i = 0; i < num; i++)
            if (que[i]  == x)					// 검색 성공
                return i;
        return -1;									// 검색 실패
    }

    //큐를 비움
    public void clear() {
        num = 0;
    }

    // 큐의 용량을 반환
    public int capacity() {
        return capacity;
    }

    // 큐에 쌓여있는 데이터수를 반환
    public int size() {
        return num;
    }

    // 큐가 비어 있는가?
    public boolean isEmpty() {
        return num <= 0;
    }

    // 큐가 가득 찼는가?
    public boolean isFull() {
        return num >= capacity;
    }

    //큐 안의 모든 데이터를 맨앞 → 맨끝의 순서로 출력
    public void dump() {
        if (num <= 0)
            System.out.println("큐가 비어 있습니다.");
        else {
            for (int i = 0; i < num; i++)
                System.out.print(que[i] + " ");
            System.out.println();
        }
    }

}
//deque 메서드에서는 원소를 제거하고 나머지 원소들을 한 칸씩 옮기는 과정이 비효율적
// deque 메서드의 성능을 개선하기 위해서는 배열 대신 연결 리스트 등의 자료구조를 활용