package SequenceTable;

import java.util.Scanner;

public class SqList2 {
    public static void main(String[] args) throws Exception {
        System.out.print("请输入表长：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SqList L = new SqList(n);
        creatSortSqList(L,n);
        System.out.print("输出的有序顺序表中的各个数据元素：");
        L.display();
    }
    private static void creatSortSqList(SqList L, int n) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入有序顺序表中的各个数据元素：");
        for(int i = 0; i < n; i++)
            L.insert(i, sc.nextInt());
    }
}
