package Sort.Experiment2;

import Sort.RecordNode;
import Sort.SeqList;

public class SY5_Sort_2 extends SeqList{
    static int maxSize= 10;

    public SY5_Sort_2(int maxSize) {
        super(maxSize);
    }

    public static void main(String[] args) {

    }

    /**
     * 算法执行时间的统计计算
     * @param L
     * @param sortmethod
     * @return
     */
    public static long testSortTime(SeqList L, int sortmethod){
        long startTime, endTime, testTime;
        startTime = System.currentTimeMillis();
        switch (sortmethod) {
            case 0:

        }
        return 1;
    }

    /**
     * 创建顺序表
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
     * 冒泡排序
     */
    public void bubbleSort() {
        RecordNode temp;
        boolean flag = true;
        for (int i = 1; i < this.length() && flag; i++) {
            flag = false;
            for (int j = 0; j < this.length() - i; j++) {
                if (getR()[j].getKey().compareTo(getR()[j + 1].getKey()) > 0) {

                }
            }
        }
    }

    class CopareMoveNum {
        private int cpn;
        private int mvn;

        public int getCpn() {
            return cpn;
        }

        public void setCpn(int cpn) {
            this.cpn = cpn;
        }

        public int getMvn() {
            return mvn;
        }

        public void setMvn(int mvn) {
            this.mvn = mvn;
        }
    }

}