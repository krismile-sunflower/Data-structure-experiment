package Queue.Experiment1;

import Queue.CircleSqQueue;
import Queue.LinkQueue;

import java.util.Scanner;

public class SY4_Queue1 {
    public static void main(String[] args) throws Exception {
        CircleSqQueue Q1 = new CircleSqQueue(100);
        LinkQueue Q2 = new LinkQueue();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入队列的长度:");
        int n = sc.nextInt();
        System.out.println("请输入队列中的各元素值:");
        for(int i = 0; i < n; i++){
            int data = sc.nextInt();
            Q1.offer(data);
            Q2.offer(data);
        }
        System.out.println("建立的循环顺序队列中各元素值为(从队首到队尾):");
        Q1.display();
        System.out.println("建立的链队列中各元素值为(从队首到队尾):");
        Q2.display();
        System.out.print("请输入待入队的元素值x:");
        int x = sc.nextInt();
        Q1.offer(x);
        System.out.println("入队后的循环顺序队列中各元素值为(从队首到队尾):");
        Q1.display();
        Q2.offer(x);
        System.out.println("入队后的链队列中各元素值为(从队首到队尾):");
        Q2.display();
        Object t1 = Q1.poll();
        Object t2 = Q2.poll();
        if(t1 != null && t2 != null){
            System.out.println("删除的循环顺序队列的队首元素为:" + t1);
            System.out.println("删除的链队列的队首元素为:" + t2);
            System.out.println("删除队首元素后,循环顺序队列中各元素值为(从队首到队尾):");
            Q1.display();
            System.out.println("删除队首元素后,链队列中各元素值为(从队首到队尾):");
            Q2.display();
        }
    }
}
