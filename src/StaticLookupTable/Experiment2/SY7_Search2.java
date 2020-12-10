package StaticLookupTable.Experiment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SY7_Search2 {

    /**
     * 找到所在的key在哪一个块中
     */
    public static int findblock(IndexList ST, int key) {
        //遍历每一个块链中的所有数并找到key所在的块
        for (int i = 0; i < ST.length(); i++) {
            Node p = ST.getR()[i].getHead();
            while (p != null){
                if(p.getKey() == key)
                    return i + 1;
//                System.out.print(p.getKey() + "\t");
                p = p.getNext();
            }
        }
        return -1;
    }

    /**
     * 找到key所在当前块中的位置
     */
    public static Node findrecord(IndexList ST, int key) throws Exception {
        if(findblock(ST, key) == -1){
            throw new Exception("没有找到信息。");
        }
        int Bno = findblock(ST, key) - 1;
        System.out.print("它所在的块数为: " + (Bno + 1));
        Node p = ST.getR()[Bno].getHead();
        int address = 1;
        while (p != null && p.getKey() != key){
            address++;
            p = p.getNext();
        }
        System.out.print(", 它在这块中是第" + address + "个位置");
        return p;
    }

    public static Node createLinkedList(List<Integer> data){
        if(data.isEmpty()){
            return null;
        }
        //取出传入数据的第一个结点
        Node firstNode=new Node(data.get(0));
        firstNode.setNext(createLinkedList(data.subList(1, data.size())));
        return firstNode;
    }
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您将创建的块链个数：");
        int indexNodeNum  = sc.nextInt();
        System.out.print("请输入您创建的块链的大小：");
        int blockNum = sc.nextInt();
        IndexNode[] indexNodes = new IndexNode[indexNodeNum];
        indexNodes[0] = new IndexNode();
        for(int i = 0 ; i < indexNodeNum;i++){
            System.out.print("请输入您将创建的第 "+(i + 1)+" 个块链的块数, ");
            System.out.print("请输入当前块的数据：");
            List<Integer> tempList = new ArrayList<>();
            for(int j = 0; j < blockNum; j++){
                tempList.add(sc.nextInt());
            }
            Node head = createLinkedList(tempList);
            assert head != null;
            IndexNode indexNode = new IndexNode(head.getKey(), head);
            // 遍历单链表 找出maxKey.
            Node p = head;
            while (p!=null){
                if(p.getKey()>indexNode.getMaxKey()){
                    indexNode.setMaxKey(p.getKey());
                }
                p = p.getNext();
            }
            indexNodes[i] = indexNode;
        }
        IndexList indexList = new IndexList(indexNodeNum, indexNodes);
        int option = 0;
        while (option != 2){
            System.out.println("请选择功能：1: 根据关键字，查位置。 2: 退出系统。");
            System.out.print("请输入1或者2: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("请输入您要查找的关键字：");
                    int key = sc.nextInt();
                    System.out.print("结果为：");
                    Node keyNode = findrecord(indexList, key);
                    System.out.println(", 它所在的位置为: " + keyNode.toString());
                    break;
                case 2:
                    System.out.println("查询结束！");
                    break;
                default:
                    System.out.println("选择有误，请重新选择：");
                    break;
            }
        }
    }
}
