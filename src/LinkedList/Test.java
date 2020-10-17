package LinkedList;

public class Test {
    private Node first;
    private Node tail;

    public Test() {
        first = new Node(1);
        tail = first;
    }

    public void creat() throws Exception{
        System.out.print("总人数的顺序为");
        for(int i = 2; i <= 30; i++){
           tail = new Node(i);
        }
        tail.setNext(first);
    }

    public void display(){
        Node node = first.getNext();
        while (!node.equals(first)){
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Test test = new Test();
        test.creat();
        test.display();
    }
}
