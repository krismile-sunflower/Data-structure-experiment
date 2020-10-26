package Test;

public class StackElem {
    private int mvalue;
    private int nvalue;//元素保存m和n的值
    //构造器

    public StackElem(int mvalue, int nvalue) {
        this.mvalue = mvalue;
        this.nvalue = nvalue;
    }

    public int getMvalue() {
        return mvalue;
    }

    public void setMvalue(int mvalue) {
        this.mvalue = mvalue;
    }

    public int getNvalue() {
        return nvalue;
    }

    public void setNvalue(int nalue) {
        this.nvalue = nalue;
    }
}
