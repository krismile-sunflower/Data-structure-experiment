package Sort.Experiment3;

import Sort.RecordNode;
import Sort.SeqList;

public class SY6_Sort_3 extends SeqList {
    static int maxSize = 10;
    public SY6_Sort_3(int maxSize){
        super(maxSize);
    }

    private static  SeqList createdList(Student[] students) throws Exception {
        SeqList SL =new SY6_Sort_3(maxSize + 1);
        for (Student student : students) {
            Integer total = student.getEnglish() + student.getMath();
            RecordNode r = new RecordNode(total, student);
            SL.insert(SL.length(), r);
        }
        SL.insert(0, new RecordNode(0));
        return SL;
    }
    public void display(){
        for (int i = 1; i < this.length(); i++) {
            System.out.println(getR()[i].getElement().toString());
        }
    }

    public void insertSortWithGuard() {
        int i, j;
        RecordNode[] r;
        r = getR();
        for (i = 2; i < this.getCurlen(); i++) {
            r[0] = r[i];
            for (j = i - 1; r[0].getKey().compareTo(r[j].getKey()) > 0; j--) {
                r[j + 1] = r[j];
            }
            r[j + 1] = r[0];
        }
    }

    public static void main(String[] args) throws Exception {
        Student student1 = new Student(1001, "王小红", 88, 98);
        Student student2 = new Student(1002, "李小平", 78, 67);
        Student student3 = new Student(1003, "赵一飞", 87, 86);
        Student student4 = new Student(1004, "张春江", 67, 56);
        Student student5 = new Student(1005, "吴占豪", 88, 78);
        Student[] students = {student1, student2, student3, student4, student5};
        SeqList L = createdList(students);
        System.out.println("学生成绩表初始数据: ");
        L.display();
        L.insertSortWithGuard();
        System.out.println("--------------------------------------------------");
        System.out.println("学生成绩表按总分从大到小排序: ");
        L.display();
    }

}
