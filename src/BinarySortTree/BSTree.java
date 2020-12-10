package BinarySortTree;

import Sort.RecordNode;

public class BSTree {
    protected BiTreeNode root;

    public BSTree() {
        root = null;
    }

    /**
     * 中根次序遍历
     * @param p
     */
    public void inOderTraverse(BiTreeNode p){
        if(p != null){
            inOderTraverse(p.lchild);
            System.out.print(((RecordNode)p.data).toString() + "");
            inOderTraverse(p.rchild);
        }
    }

    /**
     * 前根次序遍历
     * @param p
     */
    public void preOderTraverse(BiTreeNode p){
        if(p != null){
            System.out.print(((RecordNode)p.data).toString() + "");
            inOderTraverse(p.lchild);
            inOderTraverse(p.rchild);
        }
    }

    /**
     * 后根次序遍历
     * @param p
     */
    public void postOderTraverse(BiTreeNode p){
        if(p != null){
            inOderTraverse(p.lchild);
            inOderTraverse(p.rchild);
            System.out.print(((RecordNode)p.data).toString() + "");
        }
    }

    public boolean insertBST(Comparable key, Object theElement){
        if(key == null || !(key instanceof Comparable)){
            //不能插入空对象或不可比较大小的对象
            return false;
        }
        if(root == null){
            root = new BiTreeNode(new RecordNode(key, theElement));
            return true;
        }
        return insertBST(root, key, theElement);
    }

    private boolean insertBST(BiTreeNode p, Comparable key, Object thElement){
        if(key.compareTo(((RecordNode)p.getData()).getKey()) == 0){
            return false;
        }
        if(key.compareTo(((RecordNode)p.getData()).getKey()) < 0){
            if(p.getLchild() == null){
                p.setLchild(new BiTreeNode(new RecordNode(key, thElement)));
                return true;
            } else {
                return insertBST(p.getLchild(), key, thElement);
            }
        } else if(p.getRchild() == null){
            p.setRchild(new BiTreeNode(new RecordNode(key, thElement)));
            return true;
        }else {
            return insertBST(p.getRchild(), key, thElement);
        }
    }

    public BiTreeNode getRoot() {
        return root;
    }
}
