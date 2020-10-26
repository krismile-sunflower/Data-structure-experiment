package SequenceTable.Experiment2;

import SequenceTable.SqList;

public class SqList3 {
    public static void main(String[] args) throws Exception {
        SqList A = new SqList(10);
        SqList B = new SqList(10);
        SqList C = new SqList(10);
        for(int i = 0; i < 4; i++){
            A.insert(i, i + 1);
        }
        System.out.print("顺序表A的元素为：");
        A.display();
        for(int i = 0; i < 4; i++){
            B.insert(i, i + 2);
        }
        System.out.print("顺序表B的元素为：");
        B.display();
        for(int i = 0; i < 4; i++){
            C.insert(i, i + 3);
        }
        System.out.print("顺序表C的元素为：");
        C.display();
        removePublic(A, B, C);
        System.out.print("顺序表删除后的的元素为：");
        A.display();

    }
    private static void removePublic(SqList A, SqList B, SqList C) throws Exception{
        int i = 0, j = 0, k = 0;
        while(j < B.length() && k < C.length()){
            if((Integer)B.get(j) < (Integer)C.get(k))
                j++;
            else if((Integer)B.get(j) > (Integer)C.get(k))
                k++;
            else{   // (Integer)B.get(j) == (Integer)C.get(k)
                while(i < A.length() && (Integer)A.get(i) < (Integer)B.get(j))
                    i++;
                if(i < A.length() && (Integer)A.get(i) == (Integer)B.get(j))
                    A.remove(i);
                j++;
                k++;
            }
        }
    }
}
