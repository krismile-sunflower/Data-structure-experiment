package LinkedList;

public class Josephus {
    static class Node{
        int val;
        Node next;
        Node(int v){
            val=v;
        }
    }//成员类，代表节点，类似于数据结构中的结构体
    public static void main(String[] args) {
        int N=30;//这个表示总人数
        int M=9;//数到几的人出列
        Node t=new Node(1);//头节点单列出来，方便形成循环链表
        Node x=t;

        for(int i=2;i<=N;i++)x=(x.next=new Node(i));//建立单向链表
        x.next=t;//最后一个节点的next指向第一个节点，形成循环链表
        System.out.println(t.val);
        System.out.println("出圈的顺序为：");
        while(x!=x.next){
            for(int i=1;i<M;i++)
                x=x.next;
            //此时x是将出列的节点的前一个节点
            System.out.print(x.next.val+" ");
            x.next=x.next.next;
        }
        System.out.println();
        System.out.println("Survivors is "+x.val);
    }//end main
}
