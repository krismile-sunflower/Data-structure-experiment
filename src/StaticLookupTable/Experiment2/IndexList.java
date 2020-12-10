package StaticLookupTable.Experiment2;


import java.util.Arrays;

public class IndexList {
    private int curlen;
    private IndexNode[] r;

    public IndexList(int maxSize) {
        this.curlen = 0;
        this.r = new IndexNode[maxSize];
    }

    public IndexList(int curlen, IndexNode[] r) {
        this.curlen = curlen;
        this.r = r;
    }

    public int getCurlen() {
        return curlen;
    }

    public int length() {
        return curlen;
    }

    public IndexNode[] getR() {
        return r;
    }

    public void setR(IndexNode[] r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "IndexList{" +
                "curlen=" + curlen +
                ", r=" + Arrays.toString(r) +
                '}';
    }
}
