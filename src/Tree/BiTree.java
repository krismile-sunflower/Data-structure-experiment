package Tree;

import Stack.LinkStack;

public class BiTree {
    private BiTreeNode root;
    private static int index = 0;

    public BiTree(String preStr) {
        char c = preStr.charAt(index++);
        if(c != '#'){
            root = new BiTreeNode(c);
            root.setLchild(new BiTree(preStr).getRoot());
            root.setRchild(new BiTree(preStr).getRoot());
        } else
            root = null;
    }

    public BiTree(BiTreeNode root) {
        this.root = root;
    }


    public BiTree(String preOrder, String inOrder, int preIndex, int inIndex, int count){
        if(count > 0){
            char r = preOrder.charAt(preIndex);
            int i = 0;
            for(; i < count; i++)
                if(r == inOrder.charAt(i + inIndex))
                    break;
                root = new BiTreeNode(r);
                root.setLchild(new BiTree(preOrder, inOrder, preIndex + 1, inIndex, i).root);
                root.setRchild(new BiTree(preOrder, inOrder, preIndex + i + 1, inIndex + i + 1, count - i - 1).root);
        }
    }

    public BiTreeNode getRoot() {
        return root;
    }

    /**
     * 递归算法遍历前根
     * @param T
     */
    public void preRootTraverse(BiTreeNode T){
        if(T != null){
            System.out.print(T.getData());
            preRootTraverse(T.getLchild());
            preRootTraverse(T.getRchild());
        }
    }

    /**
     * 非递归算法遍历前根
     */
    public void preRootTraverse() throws Exception {
        BiTreeNode T = root;
        if(T != null){
            LinkStack S = new LinkStack();
            S.push(T);
            while (!S.isEmpty()){
                T = (BiTreeNode)S.pop();
                System.out.print(T.getData());
                while (T != null){
                    if(T.getLchild() != null){
                        System.out.print(T.getLchild().getData());
                    }
                    if(T.getRchild() != null){
                        S.push(T.getRchild());
                    }
                    T = T.getLchild();
                }
            }
        }
    }

    /**
     * 递归算法遍历中根
     * @param T
     */
    public void inRootTraverse(BiTreeNode T){
        if(T != null){
            inRootTraverse(T.getLchild());
            System.out.print(T.getData());
            inRootTraverse(T.getRchild());
        }
    }

    /**
     * 非递归算法遍历中根
     */
    public void inRootTraverse() throws Exception {
        BiTreeNode T = root;
        if(T != null){
            LinkStack S = new LinkStack();
            S.push(T);
            while (!S.isEmpty()){
                while (S.peek() != null){
                    S.push(((BiTreeNode)S.peek()).getLchild());
                }
                S.pop();
                if(!S.isEmpty()){
                    T = (BiTreeNode)S.pop();
                    System.out.print(T.getData());
                    S.push(T.getRchild());
                }
            }
        }
    }

    /**
     * 递归算法遍历后根
     * @param T
     */
    public void postRootTraverse(BiTreeNode T){
        if(T != null){
            postRootTraverse(T.getLchild());
            postRootTraverse(T.getRchild());
            System.out.print(T.getData());
        }
    }

    /**
     * 非递归算法遍历后根
     */
    public void postRootTraverse() throws Exception {
        BiTreeNode T = root;
        if(T != null){
            LinkStack S = new LinkStack();
            S.push(T);
            Boolean flag;
            BiTreeNode p = null;
            while (!S.isEmpty()){
                while (S.peek() != null){
                    S.push(((BiTreeNode)S.peek()).getLchild());
                }
                S.pop();
                while (!S.isEmpty()){
                    T = (BiTreeNode)S.peek();
                    if(T.getRchild() == null || T.getRchild() == p){
                        System.out.print(T.getData());
                        S.pop();
                        p = T;
                        flag = true;
                    } else {
                        S.push(T.getRchild());
                        flag = false;
                    }
                    if(!flag)
                        break;
                }
            }
        }
    }

    public int countNode(BiTreeNode T) {
        int count = 0;
        if (T != null) {
            ++count;
            count += countNode(T.getLchild());
            count += countNode(T.getRchild());
        }
        return count;
    }

    public int countLeafNode(BiTreeNode T){
        int count = 0;
        if(T != null){
            if(T.getLchild() == null && T.getRchild() == null){
                ++count;
            } else{
                count += countLeafNode(T.getLchild());
                count += countLeafNode(T.getRchild());
            }
        }
        return count;
    }
}

