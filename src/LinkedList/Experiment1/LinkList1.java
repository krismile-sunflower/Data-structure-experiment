package LinkedList.Experiment1;

import LinkedList.LinkList;

import java.util.Scanner;

public class LinkList1 {
    private static void creat(LinkList L) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入链表中的个元素值（0为结束）：");
        for(int x = sc.nextInt(); x != 0; x = sc.nextInt())
            L.insert(0, x);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        LinkList L = new LinkList();
        creat(L);
        System.out.println("建立的单链表为：");
        L.display();
        System.out.println("请输入待插入的位置i(0~curLen):");
        int i = sc.nextInt();
        System.out.println("请输入待插入的数值x:");
        int x = sc.nextInt();
        L.insert(i, x);
        System.out.println("传入后的链表为：");
        L.display();
        System.out.println("请输入待删除元素的位置（0~curLen - 1）:");
        i = sc.nextInt();
        L.remove(i);
        System.out.println("删除后的链表为：");
        L.display();
        System.out.println("请输入待查找的数据元素的位序号（0~curLen - 1）:");
        i = sc.nextInt();
        Object o = L.get(i);
        System.out.println("此单链表中的第" + i + "个结点的数据元素值为:" + o);
        System.out.println("长度为：" + L.length());
    }
}
