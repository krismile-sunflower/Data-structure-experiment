package Sort;

import java.util.Arrays;

public class SeqList {
    private RecordNode[] r;
    private int curlen;

    public SeqList() {
    }

    public SeqList(RecordNode[] r, int curlen) {
        this.r = r;
        this.curlen = curlen;
    }

    public SeqList(int maxSize) {
        this.curlen = 0;
        this.r = new RecordNode[maxSize];
    }

    public RecordNode[] getR() {
        return r;
    }

    public void setR(RecordNode[] r) {
        this.r = r;
    }

    public int getCurlen() {
        return curlen;
    }

    public void setCurlen(int curlen) {
        this.curlen = curlen;
    }

    @Override
    public String toString() {
        return "SeqList{" +
                "r=" + Arrays.toString(r) +
                ", curlen=" + curlen +
                '}';
    }

    /**
     * 插入一个结点
     * @param i
     * @param x
     * @throws Exception
     */
    public void insert(int i, RecordNode x) throws Exception{
        if(this.curlen == r.length)
            throw new Exception("表已经满了！");
        if(i < 0 || i > this.curlen)
            throw new Exception("插入位置不合法！");
        for (int j = this.curlen; j > i; j--) {
            r[j] = r[j - 1];
        }
        r[i] = x;
        this.curlen++;
    }

    /**
     * 顺序表的长度
     * @return
     */
    public int length() {
        return curlen;
    }

    /**
     * 打印顺序表
     */
    public void display() {
        for (int i = 1; i < this.length(); i++) {
            System.out.print(" " + getR()[i].getKey().toString());
        }
        System.out.println();
    }

    /**
     * 带监视哨的直接插入排序
     */
    public void insertSortWithGuard() {
        int i, j;
        System.out.println("带监视哨的直接插入序列");
        for (i = 2; i < this.curlen; i++) {
            r[0] = r[i];
            for (j = i - 1; r[0].getKey().compareTo(r[j].getKey()) < 0; j--) {
                r[j + 1] = r[j];
            }
            r[j + 1] = r[0];
        }
    }

}
