package datastructure.chap4;

public class IntQueue {
    private int[] que;            // 큐용 배열
    private int capacity;         // 큐의 크기
    private int front;            // 맨 처음 요소 커서
    private int rear;             // 맨 끝 요소 커서
    private int num;              // 현재 데이터 개수

    // 실행시 예외: 큐가 비어있음
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() { }
    }

    // 실행시 예외: 큐가 가득 찼음
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() { }
    }

    // 생성자(constructor)
    public IntQueue(int maxlen) {
        num = front = rear = 0; //num,front,rear 모두 0으로 초기화, 큐가 비어있음
        capacity = maxlen; //capacity 변수에 maxlen할당 생성자를 호출할 때 사용자가 전잘한 큐의 최대용량
        try {
            que = new int[capacity];          // 큐 본체용 배열을 생성,코의 크기는 capacity와 같음
        } catch (OutOfMemoryError e) {        // 크기를 초과하여 메모리를 할당하려하면 OutOfMemory에러
            capacity = 0; //예외 발생하면 배열을 생성할 수 없음
        }
    }


    // 큐에 데이터를 인큐
    public int enque(int x) throws OverflowIntQueueException {
        if (num >= capacity) //num이 큐의 용량 capacity와 같거나 큰 경우 확인
            throw new OverflowIntQueueException();            // 큐가 가득 찼음, 예외
        que[rear++] = x;//큐 끝에 데이터를 추가,rear값 증가
        num++;//데이터를 추가한 후 데이터 개수도 증가
        if (rear == capacity) //rear이 큐의 용량과 같아지면
            rear = 0;//rear를 다시 으로 설정하여 배열 처음으로 돌아가게 함
        return x; //마지막으로 추가한 x 반환
    }

    // 큐에서 데이터를 디큐
    public int deque() throws EmptyIntQueueException {
        if (num <= 0)
            throw new EmptyIntQueueException();            // 큐가 비어있음
        int x = que[front++];
        num--;
        if (front == capacity)
            front = 0;
        return x;
    }

    // 큐에서 데이터를 피크(프런트 데이터를 들여다봄)
    public int peek() throws EmptyIntQueueException {
        if (num <= 0)
            throw new EmptyIntQueueException();            // 큐가 비어있음
        return que[front];
    }

    //큐를 비움
    public void clear() {
        num = front = rear = 0;
    }

    //큐에서 x를 검색하여 인덱스(찾지 못하면 –1)를 반환
    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if (que[idx] == x)                // 검색 성공
                return idx;
        }
        return -1;                            // 검색 실패
    }

    //큐의 크기를 반환
    public int getCapacity() {
        return capacity;
    }

    //큐에 쌓여 있는 데이터 개수를 반환
    public int size() {
        return num;
    }

    // 큐가 비어있는가?
    public boolean isEmpty() {
        return num <= 0;
    }

    //큐가 가득 찼는가?
    public boolean isFull() {
        return num >= capacity;
    }

    //큐 안의 모든 데이터를 프런트 → 리어 순으로 출력
    public void dump() {
        if (num <= 0)
            System.out.println("큐가 비어있습니다.");
        else {
            for (int i = 0; i < num; i++)
                System.out.print(que[(i + front) % capacity] + " ");
            System.out.println();
        }
    }
}
