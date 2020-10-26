package Queue.Experiment2;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入斐波那契序列的阶级k:");
        int k = sc.nextInt();
        System.out.print("请输入斐波那契序列的项n:");
        int n = sc.nextInt();
        GetFib_CyQueue(k, n);
    }

    private static void GetFib_CyQueue(int k, int n){
        int i, m, sum;
        CircleSqQueue Q = new CircleSqQueue(k);
        for(i = 0; i < k - 1; i++){
            Q.offer(0);
        }
        Q.offer(1);
        System.out.print("k阶斐波那契序列的前n+1项值为:");
        for(i = 0; i < k;i++)
            System.out.print(Q.getElem(i) + " ");
        for(i = k; i <= n; i++){
            m = i % k;
            sum = 0;
            for(int j = 0; j < k; j++)
                sum += Q.getElem((m + j) % k);
            Q.offer(sum);
            System.out.print(sum + " ");
        }
    }
}
