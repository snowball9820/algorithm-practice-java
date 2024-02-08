package datastructure.chap4;

public class IntStack {

    private int[] stk;           // 스택용 배열: 푸시된 데이터를 저장하는 스택용 배열
    private int capacity;        // 스택의 크기: 스택의 용량(최대로 쌓을 수 있는 데이터 수)
    private int ptr;             // 스택 포인터:스택에 쌓여있는 데이터 수를 나타냄

    // 실행시 예외: 스택이 비어있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {
        }
    }

    // 실행시 예외: 스택이 가득 참
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {
        }
    }

    //생성자
    public IntStack(int maxlen) {
        ptr = 0;
        capacity = maxlen;
        try {
            stk = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public int push(int x) throws OverflowIntStackException {
        if (ptr >= capacity) {
            throw new OverflowIntStackException();
        }
        return stk[ptr++] = x; //전달받은 데이터 x를 저장하고 ptr를 1 증가시킴
    }

    public int pop() throws EmptyIntStackException {
        if (ptr <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[--ptr];//스택 포인터 1감소, stk[ptr]에 저장된 값 반환
    }

    //peek으로 가장 정상에 있는 데이터 들여다봄 ptr-1(정상에 있는 데이터)
    public int peek() throws EmptyIntStackException {
        if (ptr <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[ptr - 1];//비어있지 않으면 ptr-1 값 반환

    }

    //clear 스택 비움
    public void clear() {
        ptr = 0;
    }

    //스택에서 x를 찾아 인덱스를 반환(없으면 -1반환)
    public int indexOf(int x) {
        for (int i = ptr - 1; i >= 0; i--) {//정상부터 선형검색 들어감
            if (stk[i] == x) {
                return i;
            }
        }
        return -1;
    }

    //스택 크기 반환
    public int getCapacity() {
        return capacity;
    }

    //스택에 쌓인 데이터 갯수 반환
    public int size() {
        return ptr;
    }

    //스택이 비었는지
    public boolean isEmpty() {
        return ptr<=0;
    }

    //스택이 가득 찼는지
    public boolean isFull() {
        return ptr >= capacity;
    }

    //스택 안의 모든 데이터를 바닥->정상 순서로 표시함
    public void dump() {
        if (ptr <= 0) {
            System.out.println("스택이 빔");
        } else {
            for (int i = 0; i < ptr; i++) {
                System.out.print(stk[i]+" ");
            }
            System.out.println();
        }
    }


}
