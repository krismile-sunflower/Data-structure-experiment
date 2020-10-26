package Stack.Experiment2;

import java.util.Scanner;

public class AckermanFunction {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入m的值:");
        int m = sc.nextInt();
        System.out.print("请输入n的值:");
        int n = sc.nextInt();
        System.out.print("最后Ackerman函数得出的结果为:");
        int result = ack(m, n);
        System.out.println(result);

    }

    private static int ack(int m, int n) throws Exception{
        StackElem e;
        Stack s = new Stack(1000);
        e = new StackElem(m, n);
        s.push(e);
        do{
            while (s.getTop().getMval() != 0){
                while (s.getTop().getNval() != 0){
                    e = new StackElem(s.getTop().getMval(), s.getTop().getNval() - 1);
                    s.push(e);
                }
                s.setTop(s.getTop().getMval() - 1, 1);
            }
            if(!s.isEmpty() && s.length() != 1){
                e = s.pop();
                s.setTop(s.getTop().getMval() - 1, e.getNval() + 1);
            }
        }
        while (s.length() != 1 || s.getTop().getMval() != 0);
        return s.getTop().getNval() + 1;
    }
}
