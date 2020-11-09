package Tree.Experiment2;

import Tree.BiTree;
import Tree.BiTreeNode;

public class DebugBiTree {
    public BiTree createBiTree(){
        BiTreeNode d = new BiTreeNode('D');
        BiTreeNode g = new BiTreeNode('G');
        BiTreeNode h = new BiTreeNode('H');
        BiTreeNode e = new BiTreeNode('E', g, null);
        BiTreeNode b = new BiTreeNode('B', d, e);
        BiTreeNode f = new BiTreeNode('F', null, h);
        BiTreeNode c = new BiTreeNode('C', f, null);
        BiTreeNode a = new BiTreeNode('A', b, c);
        return new BiTree(a);
    }

    public static void main(String[] args) throws Exception {
        DebugBiTree debugBiTree = new DebugBiTree();
        BiTree biTree = debugBiTree.createBiTree();
        BiTreeNode root = biTree.getRoot();
        BiTreeNode root1 = biTree.getRoot();
        System.out.println("先根遍历：");
        biTree.preRootTraverse(root);
        System.out.print("\t");
        biTree.preRootTraverse();
        System.out.println();
        System.out.println("中根遍历：");
        biTree.inRootTraverse(root1);
        System.out.print("\t");
        biTree.inRootTraverse();
    }
}
