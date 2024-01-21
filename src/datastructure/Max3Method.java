package datastructure;

public class Max3Method {
    public static void main(String[] args) {
        System.out.println(max3(3, 2, 1));
        System.out.println(max3(4, 2, 1));
        System.out.println(max3(3, 5, 1));
        System.out.println(max3(3, 7, 1));
        System.out.println(max3(3, 7, 9));
        System.out.println("------------------");
        System.out.println(min3(3, 2, 1));
        System.out.println(min3(3, 2, 5));
        System.out.println(min3(3, 7, 5));
        System.out.println(min3(3, 3, 9));
        System.out.println("------------------");
        System.out.println(max4(4,3,2,1));
        System.out.println(max4(7,8,9,10));
        System.out.println(max4(7,8,11,10));
        System.out.println(max4(7,12,11,10));
    }

    static int max3(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;

    }

    static int max4(int a, int b, int c, int d) {
        int max=a;
        if (b > max) {
            max=b;
        }
        if (c > max) {
            max=c;

        }
        if (d > max) {
            max=d;
        }
        return max;
    }

    static int min3(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}
