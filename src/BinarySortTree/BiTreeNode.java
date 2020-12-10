package BinarySortTree;

public class BiTreeNode {
    Object data;
    BiTreeNode lchild, rchild;

    public BiTreeNode() {
        this(null);
    }

    public BiTreeNode(Object data) {
        this(data, null, null);
    }

    public BiTreeNode(Object data, BiTreeNode lchild, BiTreeNode rchild) {
        this.data = data;
        this.lchild = lchild;
        this.rchild = rchild;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public BiTreeNode getLchild() {
        return lchild;
    }

    public void setLchild(BiTreeNode lchild) {
        this.lchild = lchild;
    }

    public BiTreeNode getRchild() {
        return rchild;
    }

    public void setRchild(BiTreeNode rchild) {
        this.rchild = rchild;
    }

    @Override
    public String toString() {
        return "BiTreeNode{" +
                "data=" + data +
                ", lchild=" + lchild +
                ", rchild=" + rchild +
                '}';
    }
}
