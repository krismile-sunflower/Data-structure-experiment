package StaticLookupTable;

import Sort.Experiment2.CopareMoveNum;

import java.util.Arrays;

public class SeqList {
    private RecordNode[] r;
    private int curlen;
    public CopareMoveNum[] cm = {new CopareMoveNum(),new CopareMoveNum()};

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

    /**
     * 冒泡排序
     */
    public void bubbleSort() {
        RecordNode temp;
        boolean flag = true;
        for (int i = 1; i < this.length() && flag; i++) {
            flag = false;
            for (int j = 0; j < this.length() - i; j++) {
                if (getR()[j].getKey().compareTo(getR()[j + 1].getKey()) > 0) {
                    cm[0].setCpn(cm[0].getCpn() + 1);
                    temp = getR()[j];
                    getR()[j] = getR()[j + 1];
                    getR()[j + 1] = temp;
                    flag = true;
                    cm[0].setMvn(cm[0].getMvn() + 3);
                }
            }
        }
    }

    /**
     * 一趟快速排序
     * @param i
     * @param j
     * @return
     */
    public int Partition(int i, int j){
        RecordNode pivot = getR()[i];
        cm[1].setMvn(cm[1].getMvn() + 1);
        while (i < j) {
            while (i < j && pivot.getKey().compareTo(getR()[j].getKey()) <= 0){
                j--;
                cm[1].setCpn(cm[1].getCpn() + 1);
            }
            if(i < j) {
                getR()[i] = getR()[j];
                i++;
                cm[1].setMvn(cm[1].getMvn() + 1);
            }
            while (i < j && pivot.getKey().compareTo(getR()[i].getKey()) > 0) {
                i++;
                cm[1].setCpn(cm[1].getCpn() + 1);
            }
            if(i < j) {
                getR()[j] = getR()[i];
                j--;
                cm[1].setMvn(cm[1].getMvn() + 1);
            }
        }
        getR()[i] = pivot;
        cm[1].setMvn(cm[1].getMvn() + 1);
        return i;
    }

    /**
     * 递归形式快速排序
     * @param low
     * @param high
     */
    public void qSort(int low, int high) {
        if(low < high) {
            int pivotloc = Partition(low, high);
            qSort(low, pivotloc - 1);
            qSort(pivotloc + 1, high);
        }
    }

    /**
     * 顺序表快速排序
     */
    public void quickSort() {
        qSort(0, this.curlen - 1);
    }

    /**
     * 顺序查找
     * @param key
     * @return
     */
    public int seqSearch(Comparable key) {
        int i = 0, n = length();
        while (i < n && r[i].getKey().compareTo(key) != 0){
            i++;
        }
        if(i < n)
            return i;
        else
            return  -1;
    }

    /**
     * 二分查找
     * @param key
     * @return
     */
    public int binarySearch(Comparable key) {
        if(length() > 0){
            int low = 0, hight = length() - 1;
            while (low <= hight) {
                int mid = (low + hight) / 2;
                if(r[mid].getKey().compareTo(key) == 0) {
                    return mid;
                } else if (r[mid].getKey().compareTo(key) > 0) {
                    hight = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
