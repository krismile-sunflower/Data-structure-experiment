package Tree.Experiment2;

import Stack.SqStack;
import Tree.BiTree;
import Tree.BiTreeNode;

import java.util.Scanner;


public class SY5_BiTree2 {
    public static void main(String[] args) throws Exception {
        String preOrder = "ABDEGCFH";
        String inOder = "DBGEAFHC";
        BiTree biTree1 = new BiTree(preOrder, inOder, 0, 0, preOrder.length());
        BiTree biTree2 = new BiTree(preOrder, inOder, 0, 0, preOrder.length());
        BiTreeNode root1 = biTree1.getRoot();
        BiTreeNode root2 = biTree2.getRoot();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("---------------------------");
            System.out.println("1 -- 先遍历根以及镜像先根遍历   2 -- 中根遍历以及中根镜像遍历   3 -- 退出");
            System.out.print("请输入选择（1 - 3）：");
            int i = sc.nextInt();
            switch (i){
                case 1:
                        System.out.print("先根遍历：");
                        biTree1.preRootTraverse(root1);
                        System.out.println();
                        System.out.print("镜像先根遍历：");
                        exChang1(root1);
                        biTree1.preRootTraverse(root1);
                        System.out.println();
                        break;
                case 2:
                        System.out.print("中根遍历：");
                        biTree2.inRootTraverse(root2);
                        System.out.println();
                        System.out.print("镜像中根遍历：");
                        exChang2(root2);
                        biTree2.inRootTraverse(root2);
                        System.out.println();
                        break;
                case 3:
                    return;
            }
        }
    }

    private static void exChang1(BiTreeNode T) throws Exception{
        SqStack s = new SqStack(100);
        if(T != null){
            s.push(T);
            do{
                T = (BiTreeNode)s.pop();
                if(T.getLchild() != null || T.getRchild() != null){
                    BiTreeNode p = (BiTreeNode)T.getLchild();
                    T.setLchild((T.getRchild()));
                    T.setRchild(p);
                }
                if(T.getLchild() != null)
                   s.push(T.getLchild());
                if(T.getRchild() != null)
                    s.push(T.getRchild());
            }while (!s.isEmpty());
        }
    }

    private static void exChang2(BiTreeNode T){
        if(T != null){

            if(T.getLchild() != null || T.getRchild() != null){
                BiTreeNode p = (BiTreeNode)T.getLchild();
                T.setLchild(T.getRchild());
                T.setRchild(p);
            }
            exChang2(T.getLchild());
            exChang2(T.getRchild());
        }
    }

}

