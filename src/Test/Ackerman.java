package Test;

public class Ackerman {
    public static void main(String[] args) throws Exception {

        int res = ack(0,1);
        System.out.println(res);
    }
    //ACK算法
    public static int ack(int m,int n) throws Exception {
        StackElem e ;
        e = new StackElem(m,n);
        Stack s = new Stack(1000);
        s.push(e);

        do {
            //若m！=0
            while(s.getTop().getMvalue() != 0){
                while (s.getTop().getNvalue() != 0){
                    e = new StackElem(s.getTop().getMvalue(),s.getTop().getNvalue() -1);
                    s.push(e);
                }
                s.setTop(s.getTop().getMvalue() -1,1);

            }
            //若m等于0
            if(!s.isEmpty()){
                e = s.pop();
                s.setTop(s.getTop().getMvalue() - 1,e.getNvalue()+1);
            }

        }while(s.getSize() != 1 || s.getTop().getMvalue() != 0);
            return s.getTop().getNvalue() + 1;
    }
}
