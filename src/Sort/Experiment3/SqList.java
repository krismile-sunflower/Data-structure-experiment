package Sort.Experiment3;

public class SqList {
    private Object[] listElem; //线性表储存空间
    private int curLen; //线性表的当前长度

    /**
     * 创造一个线性表的构造方法，存储空间容量为maxSize
     * @param maxSize
     */
    public SqList(int maxSize) {
        curLen = 0;
        listElem = new Object[maxSize];
    }

    public void clear() {
        curLen = 0;
    }

    public boolean isEmpty() {
        if(curLen == 0)
            return true;
        else
            return false;
    }

    public int length() {
        return curLen;
    }

    public Object get(int i) throws Exception{
        if(i > curLen - 1 || i < 0)
            throw new Exception("第" + i + "个元素不存在");
        return listElem[i];
    }

    public void insert(int i, Object x) throws Exception{
        if(curLen == listElem.length)
            throw new Exception("顺序表已满");
        if(i < 0 || i > curLen)
            throw new Exception("插入位置不合法");
        for(int j = curLen; j > i; j--){
            listElem[j] = listElem[j - 1];
        }
        listElem[i] = x;
        curLen++;

    }

    public void remove(int i) throws Exception{
        if(i < 0 || i > curLen - 1)
            throw new Exception("删除位置不合法");
        for (int j = i; j < curLen - 1; j++){
            listElem[j] = listElem[j + 1];
        }
        curLen--;
    }

    public int indexOf(Object x) throws Exception{
        int j = 0;
        while (j < curLen && !listElem[j].equals(x))
            j++;
        if(j < curLen)
            return j;
        else
            return -1;
    }

    public void display() {
        for(int i = 0; i < this.curLen; i++){
            System.out.println(listElem[i]);
        }
        System.out.println();//换行

    }
}
