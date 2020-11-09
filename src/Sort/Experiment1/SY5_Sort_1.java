package Sort.Experiment1;

import Sort.RecordNode;
import Sort.SeqList;

public class SY5_Sort_1 extends SeqList {
    static int maxSize = 20;

    public SY5_Sort_1(int maxSize) {
        super(maxSize);
    }

    /**
     * 创建一个数组大小为20的顺序表
     * @param d
     * @return
     * @throws Exception
     */
    private static SeqList createList(int[] d) throws Exception {
        SeqList SL = new SY5_Sort_1(maxSize + 1);
        for (int i = 0; i < d.length; i++) {
            RecordNode r = new RecordNode(d[i]);
            SL.insert(SL.length(), r);
        }
        SL.insert(0, new RecordNode(0));
        return SL;
    }

    public static void main(String[] args) throws Exception {
        int[] d = new int[maxSize];
        for (int i = 0; i < maxSize; i++) {
            d[i] = (int)(Math.random() * 100);
        }
        SeqList L = createList(d);
        System.out.println("排序前：");
        L.display();
        L.insertSortWithGuard();
        System.out.println("排序后：");
        L.display();
    }
}
