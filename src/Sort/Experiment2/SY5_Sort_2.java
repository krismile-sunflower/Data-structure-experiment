package Sort.Experiment2;

import Sort.RecordNode;
import Sort.SeqList;

public class SY5_Sort_2 extends SeqList {
    static int maxSize = 10000;

    public SY5_Sort_2(int maxSize) {
        super(maxSize);
        cm[0].setCpn(0);
        cm[0].setMvn(0);
        cm[1].setCpn(0);
        cm[1].setMvn(0);
    }

    /**
     * 算法执行时间的统计计算
     *
     * @param L
     * @param sortmethod
     * @return
     */
    public static long testSortTime(SeqList L, int sortmethod) {
        long startTime, endTime, testTime;
        startTime = System.currentTimeMillis();
        switch (sortmethod) {
            case 0:
                L.bubbleSort();
                break;
            case 1:
                L.quickSort();
                break;
        }
        endTime = System.currentTimeMillis();
        testTime = endTime - startTime;
        return testTime;
    }

    /**
     * 创建顺序表
     *
     * @param d
     * @return
     * @throws Exception
     */
    private static SeqList createList(int[] d) throws Exception {
        SeqList L = new SY5_Sort_2(maxSize);
        for (int i = 0; i < d.length; i++) {
            RecordNode r = new RecordNode(d[i]);
            L.insert(L.length(), r);
        }
        return L;
    }

    /**
     * 重写打印方法
     */
    public void display() {
        for (int i = 0; i < this.length(); i++) {
            System.out.print(getR()[i].getKey().toString() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        int[] d = new int[maxSize];
        for (int i = 0; i < maxSize; i++) {
            d[i] = (int) (Math.random() * 100);
        }
        /*
         两个L1,L2是为了保证进行冒泡排序和快速排序的时候，排序的数字相同
         */
        SeqList L1 = createList(d);
        SeqList L2 = createList(d);
        /*
           冒泡排序测试
         */
        System.out.println("排序前：");
        L1.display();
        long bubbleSortTime = testSortTime(L1, 0);
        System.out.println("冒泡排序后：");
        L1.display();
        System.out.println("冒泡排序的时间是：" + bubbleSortTime);
        System.out.println("冒泡比较次数：" + L1.cm[0].getCpn());
        System.out.println("冒泡移动次数：" + L1.cm[0].getMvn());

        /*
           快速排序测试
         */
        System.out.println("排序前：");
        L2.display();
        long quickSortTime = testSortTime(L2, 1);
        System.out.println("快速排序后：");
        L2.display();
        System.out.println("快速排序的时间是：" + quickSortTime);
        System.out.println("快速排序比较次数：" + L2.cm[1].getCpn());
        System.out.println("快速排序移动次数：" + L2.cm[1].getMvn());
    }
}