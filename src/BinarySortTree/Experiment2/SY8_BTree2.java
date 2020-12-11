package BinarySortTree.Experiment2;


import BinarySortTree.BSTree;
import BinarySortTree.BiTreeNode;
import Sort.RecordNode;

import java.util.Scanner;

public class SY8_BTree2 extends BSTree{
    public void inOderTraverse(BiTreeNode p){
        if(p != null){
            inOderTraverse(p.getLchild());
            System.out.print(((RecordNode)p.getData()).getKey() + " ");
            inOderTraverse(p.getRchild());
        }
    }
    public static void main(String[] args) {
        BSTree bsTree = new SY8_BTree2();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入二叉树排序树的结点个数: ");
        int n = sc.nextInt();
        System.out.print("请输入结点的关键字序列: ");
        for (int i = 0; i < n; i++) {
            bsTree.insertBST(sc.nextInt(), null);
        }
        System.out.println("\n" + "创建的二叉树排序树的中序遍历序列为: ");
        bsTree.inOderTraverse(bsTree.getRoot());
        System.out.println();
        System.out.print("请输入删除的关键字: ");
        int key = sc.nextInt();
        while (bsTree.removeBST(key) == null){
            System.out.print("您输入的关键字不存在, 请输入正确的关键字: ");
            key = sc.nextInt();
        }
        System.out.println("删除该关键字后的二叉排序树的中序遍历序列为: ");
        bsTree.inOderTraverse(bsTree.getRoot());
    }
}
