package BinarySortTree;

import Sort.RecordNode;

public class BSTree {
    protected BiTreeNode root;

    public BSTree() {
        root = null;
    }

    /**
     * 返回根结点
     * @return
     */
    public BiTreeNode getRoot() {
        return root;
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

    /**
     * 在二叉排序中插入结点的算法：在二叉排序树中插入关键字key，数据项为theElement的结点，
     * 若插入成功，则返回true，否者返回false
     * @param key
     * @param theElement
     * @return
     */
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

    /**
     * 递归算法。将关键字为key，数据项为theElement的结点插入到以p为根的二叉排序树中，
     * 若插入成功，则返回true，否者返回false
     * @param p
     * @param key
     * @param thElement
     * @return
     */
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

    /**
     * 在二叉排序树中删除关键字为key的结点，若删除成功，则返回删除结点的关键字值，
     * 否者返回null
     * @param key
     * @return
     */
    public Object removeBST(Comparable key){
        if (root == null || key == null || !(key instanceof Comparable)){
            return null;
        }
        return removeBST(root, key, null);
    }

    /**
     * 在以p为根的二叉排序树中删除关键字为elemKey的结点，parent是p的父结点，递归算法
     * @param p
     * @param elemKey
     * @param parent
     * @return
     */
    private Object removeBST(BiTreeNode p, Comparable elemKey, BiTreeNode parent){
        if (p != null){
            if (elemKey.compareTo(((RecordNode)p.getData()).getKey()) < 0){
                return removeBST(p.getLchild(), elemKey, p);
            } else if(elemKey.compareTo(((RecordNode)p.getData()).getKey()) > 0){
                return removeBST(p.getRchild(), elemKey, p);
            } else if(p.getLchild() != null && p.getRchild() != null){
                BiTreeNode innext = p.getRchild();
                while (innext.getLchild() != null){
                    innext = innext.getLchild();
                }
                p.setData(innext.getData());
                return removeBST(p.getRchild(), ((RecordNode)p.getData()).getKey(), p);
            } else {
                if (parent == null){
                    if(p.getLchild() != null){
                        root = p.getLchild();
                    } else {
                        root = p.getRchild();
                    }
                    return p.getData();
                }
                if(p == parent.getLchild()){
                    if (p.getLchild() != null){
                        parent.setLchild(p.getLchild());
                    } else {
                        parent.setLchild(p.getRchild());
                    }
                } else if(p.getLchild() != null){
                    parent.setRchild(p.getLchild());
                } else {
                    parent.setRchild(p.getRchild());
                }
                return p.getData();
            }
        }
        return null;
    }

    /**
     * 查找关键字值为key的结点，若查找成功，则返回结点值，否者返回null
     * @param key
     * @return
     */
    public Object searchBST(Comparable key){
        if(key == null || !(key instanceof Comparable)) {
            return null;
        }
        return searchBST(root, key);
    }

    /**
     * 二叉排序树查找的递归算法
     * 在二叉排序中查找关键字值为key的结点，若查找成功，则返回结点值，否者返回null
     * @param p
     * @param key
     * @return
     */
    private Object searchBST(BiTreeNode p, Comparable key) {
        if (p != null) {
            if (key.compareTo(((RecordNode) p.getData()).getKey()) == 0) {
                return p.getData();
            }
            if (key.compareTo(((RecordNode) p.getData()).getKey()) < 0) {
                return searchBST(p.getLchild(), key);
            } else {
                return searchBST(p.getRchild(), key);
            }
        }
        return null;
    }
}
