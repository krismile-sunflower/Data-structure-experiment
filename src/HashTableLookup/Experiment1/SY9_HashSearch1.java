package HashTableLookup.Experiment1;

import java.util.Scanner;

public class SY9_HashSearch1 {
    static HashTable T = null;
    public static void createHashTable() throws Exception{
        T = new HashTable(20);
        Scanner sc = new Scanner(System.in);
        System.out.print("输入待查找的关键字的个数: ");
        int n = sc.nextInt();
        System.out.print("请输入查找表中的关键字序列: ");
        for(int i = 0; i < n; i++){
            T.hashInset(sc.nextInt());
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("-----创建哈希表-----");
        createHashTable();
        System.out.println("创建的哈希表为: ");
        T.hashDisplay();
        System.out.print("输入待查找的关键字: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        RecordNode p = T.hashSearch(key);
        if((p.getKey()).compareTo(key) == 0)
            System.out.println("查找成功");
        else
            System.out.println("查找失败");
    }
}
