package HashTableLookup.Experiment2;

import LinkedList.Node;

import java.util.Scanner;

public class SY9_HashSearch2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入一个数组的长度: ");
        int len = sc.nextInt();
        System.out.print("输入这个数组的所有数字: ");
        Integer[] numbers = new Integer[len];
        for (int i = 0; i < len; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.print("输入哈希表的长度:");
        int n = sc.nextInt();
        HashTable<Integer> ht = new HashTable<>(n);
        String elem1, elem2;
        System.out.print("插入的元素为: ");
        for (int i = 0; i <numbers.length; i++) {
            ht.insert(numbers[i]);
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n创建的哈希表: ");
        ht.printHashTable();
//        Scanner sc = new Scanner(System.in);
        System.out.print("输入你要查找的元素: ");
        int number = sc.nextInt();
        System.out.println("这个元素" + number + ht.search(number));
    }
}
