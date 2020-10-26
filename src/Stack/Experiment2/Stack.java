package Stack.Experiment2;

public class Stack {
    private StackElem[] st;
    private int top;

    public Stack(int maxSize){
        top = -1;
        st = new StackElem[maxSize];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public StackElem getTop() throws Exception {
        if(!isEmpty())
            return st[top];
        else
            throw new Exception("当前栈为空");
    }

    public void setTop(int m, int n) throws Exception {
        if(!isEmpty()){
            st[top].setMval(m);
            st[top].setNval(n);
        }
        else
            throw new Exception("当前栈为空");
    }

    public void push(StackElem o) throws Exception {
        if(top == st.length)
            throw new Exception("栈已满");
        else
            st[++top] = o;
    }

    public StackElem pop() throws Exception {
        if(top == -1)
            throw new Exception("当前栈为空");
        else
            return st[top--];
    }

    public int length(){
        return top + 1;
    }
}
