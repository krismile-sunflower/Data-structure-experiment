package HashTableLookup;

public class HashTable {
    private RecordNode[] table;
    public HashTable(int maxSize){
        this.table = new RecordNode[maxSize];
        for (int i = 0; i < table.length; i++) {
            table[i] = new RecordNode(0);
        }
    }

    public int hash(int key){
        return key % 19;
    }

    public RecordNode hashSearch(int key){
        int i = hash(key);
        int j = 0;
        while((table[i].getKey().compareTo(0) != 0) && (table[i].getKey().compareTo(key) != 0) && (j < table.length)){
            j++;
            i = (i + j) % 20;
        }
        if(j >= table.length){
            System.out.println("哈希表已满");
            return null;
        }else
            return table[i];
    }

    public void hashInset(int key){
        RecordNode p = hashSearch(key);
//        System.out.println(p.getKey());
        if(p.getKey().compareTo(0) == 0){
            p.setKey(key);
//            System.out.println("插入成功");
        }else {
            System.out.println("此关键字在记录已存在或哈希表已满");
        }
    }

    public void hashDisplay(){
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i].getKey().toString() + " ");
        }
        System.out.println();
    }
}
