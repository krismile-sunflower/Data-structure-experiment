package LinkedList;

import java.util.Scanner;

public class DuLinkList1 {
    private static void creatDuLCircleLinkList(DuLinkList L, int n) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入双向循环链表中的各元素值：");
        for(int i = 0; i < n; i++){
            L.insert(i, sc.nextInt());
        }
    }

    public static void main(String[] args) throws Exception {
        DuLinkList L = new DuLinkList();
        int n = 4;
        creatDuLCircleLinkList(L, n);

        System.out.print("链表为：");
        L.insert(4, 5);
        L.display();

    }
}
