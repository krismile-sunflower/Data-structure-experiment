package BinarySortTree.Experiment3;

import BinarySortTree.BSTree;
import BinarySortTree.BiTreeNode;
import Sort.RecordNode;
import StaticLookupTable.Experiment3.Student;

import java.util.Scanner;

public class SY8_BTree3 extends BSTree{
    public void inOderTraverse(BiTreeNode p){
        if(p != null){
            inOderTraverse(p.getLchild());
            System.out.println(((RecordNode)p.getData()).getElement());
            inOderTraverse(p.getRchild());
        }
    }
    public static void main(String[] args) {
        StaticLookupTable.Experiment3.Student student1 = new StaticLookupTable.Experiment3.Student(1001, "王小红", 88, 98);
        StaticLookupTable.Experiment3.Student student2 = new StaticLookupTable.Experiment3.Student(1002, "李小平", 78, 67);
        StaticLookupTable.Experiment3.Student student3 = new StaticLookupTable.Experiment3.Student(1003, "赵一飞", 87, 86);
        StaticLookupTable.Experiment3.Student student4 = new StaticLookupTable.Experiment3.Student(1004, "张春江", 67, 56);
        StaticLookupTable.Experiment3.Student student5 = new StaticLookupTable.Experiment3.Student(1005, "吴占豪", 88, 78);
        Student[] students = {student1, student2, student3, student4, student5};
        BSTree bsTree = new SY8_BTree3();
        for (int i = 0; i < students.length; i++) {
            bsTree.insertBST(1001 + i, students[i]);
        }
        Scanner sc = new Scanner(System.in);
        int index = -1;
        while (index != 4) {
            System.out.println("1----查找学生; 2----删除学生; 3----所有学生; 4----退出");
            System.out.print("请输入序号:");
            index = sc.nextInt();
            switch (index) {
                case 1:
                    System.out.print("请输入查找的学生(1001--1005): ");
                    int findId = sc.nextInt();
                    RecordNode p = (RecordNode) bsTree.searchBST(findId);
                    System.out.println(p.getElement());
                    break;
                case 2:
                    System.out.print("请输入删除的学生(1001--1005): ");
                    int deleteId = sc.nextInt();
                    bsTree.removeBST(deleteId);
                    break;
                case 3:
                    System.out.println("所有学生的信息: ");
                    bsTree.inOderTraverse(bsTree.getRoot());
                    break;
                case 4:
                    return;
            }
        }
    }
}
