package LinkedList;

public class Test {
    private Node head;
    private Node tail;

    public Test() {
        head = new Node();
    }

    public void creat() throws Exception{
        for (int i = 0; i < 30; i++){

        }
    }

    public void display(){
        Node node = head.getNext();
        while (!node.equals(head)){
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
