package HashTableLookup.Experiment2;

import LinkedList.LinkList;
import LinkedList.Node;

/*链地址法的哈希表*/
public class HashTable<E> {
    public final static int INFINITY = Integer.MAX_VALUE;
    private LinkList[] table;

    public HashTable(int size) {
        this.table = new LinkList[size];
        for (int i = 0; i < table.length; i++) {
            table[i] = new LinkList();
        }
    }

    public LinkList[] getTable() {
        return table;
    }

    public void setTable(LinkList[] table) {
        this.table = table;
    }

    private int hash(int key) {
        return key % table.length;
    }

    public String search(E element) throws Exception{
        int key = element.hashCode();
        int i = hash(key);
        int index = table[i].indexOf(element);
        if (index >= 0){
            return "在第"+ (i + 1) +"个表中, 下标为: " + index;
        }
        else {
            return null;
        }
    }

    public void insert(E element) throws Exception{
        int key = element.hashCode();
        int i = hash(key);
        table[i].insert(0, element);
    }

    public boolean contain(E element) throws Exception{
        return this.search(element) != null;
    }

   public void printHashTable(){
       for (int i = 0; i < table.length; i++) {
           System.out.print("table[" + i + "] = ");
           table[i].display();
       }
   }

}
