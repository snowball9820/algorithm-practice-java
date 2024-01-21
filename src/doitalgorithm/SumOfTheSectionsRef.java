package doitalgorithm;


import java.util.Scanner;

public class SumOfTheSectionsRef {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int []arr=new int[n+1];
        for(int i=1;i<=n;i++) {
            arr[i]=arr[i-1]+sc.nextInt();
        }
        for(int i=0;i<m;i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(arr[b]-arr[a-1]);
        }


//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//        int[] sum = new int[N + 1];
//        for(int i = 1; i <= N; i++) {
//            sum[i] = sum[i - 1] + sc.nextInt();
//        }
//        for (int i = 0; i < M; i++) {
//            System.out.println( -sum[sc.nextInt() - 1] + sum[sc.nextInt()]);
//        }


    }

}

