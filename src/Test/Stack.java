package Test;

public class Stack {
    private StackElem[] st;
    private int top;
    private static final int DEFAULT_CAPACITY = 16;
    public Stack(){
        top = -1;
        st = new StackElem[DEFAULT_CAPACITY];
    }
    //创建maxSize元素栈
    public Stack(int maxSize){
        top = -1;
        st = new StackElem[maxSize];
    }
    //判断栈是否为空
    public boolean isEmpty(){
        return top == -1;
    }
    //栈长度
    public int getSize(){
        return top+1;
    }
    //读取栈顶
    public StackElem getTop() throws Exception {
        if (!isEmpty()){
            return st[top];
        }else{
            throw new Exception("栈空");
        }
    }
    //修改栈顶元素
    public void setTop(int m ,int n) throws Exception {
        if (!isEmpty()){
            st[top].setMvalue(m);
            st[top].setNvalue(n);
        }else{
            throw new Exception("栈空");
        }
    }
    //入栈
    public void push(StackElem o){
        if (top == st.length){
            expandSpace();
        }else{
            top++;
            st[top] = o;
        }
    }
    //扩容
    public void expandSpace(){
        StackElem[] newSt = new StackElem[st.length * 2];
        for (int i = 0; i < st.length; i++) {
            newSt[i] = st[i];
        }
        st = newSt;
    }
    public StackElem pop() throws Exception {
        if (top == -1){
            throw new Exception("栈空");
        }else{
            top--;
            return st[top+1];
        }
    }

}
