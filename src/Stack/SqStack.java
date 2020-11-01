package Stack;

public class SqStack implements IStack{
    private Object[] stackElem;
    private int top;

    public SqStack(int maxSize) {
        top = 0;
        stackElem =new Object[maxSize];
    }

    @Override
    public void clear() {
        top = 0;
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int length() {
        return top;
    }

    @Override
    public Object peek() {
        if(isEmpty())
            return null;
        else
            return stackElem[top - 1];
    }

    @Override
    public void push(Object x) throws Exception {
        if(top == stackElem.length)
            throw new Exception("该栈已经满了");
        else {
            stackElem[top++] = x;
        }

    }

    @Override
    public Object pop() {
        if(isEmpty())
            return null;
        else{
            return stackElem[--top];
        }
    }

    @Override
    public Object getTop(){
        if(isEmpty()) {
            System.out.println("栈为空，无法取出元素");
            return null;
        }
        return stackElem[top];
    }

    @Override
    public void display() {
        for(int i = top - 1; i >= 0; i--){
            System.out.print(stackElem[i].toString() + " ");
        }
        System.out.println();
    }
}
