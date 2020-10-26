package Stack.Experiment2;

public class StackElem {
    private int mval;
    private int nval;

    public StackElem(int mval, int nval) {
        this.mval = mval;
        this.nval = nval;
    }

    public int getMval() {
        return mval;
    }

    public void setMval(int mval) {
        this.mval = mval;
    }

    public int getNval() {
        return nval;
    }

    public void setNval(int nval) {
        this.nval = nval;
    }

    @Override
    public String toString() {
        return "StackElem{" +
                "mval=" + mval +
                ", nval=" + nval +
                '}';
    }
}
