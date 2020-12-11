package StaticLookupTable.Experiment3;

import SequenceTable.SqList;

import java.util.Scanner;

public class SY7_Search3 extends SqList{
    /**
     * 创造一个线性表的构造方法，存储空间容量为maxSize
     *
     * @param maxSize
     */
    public SY7_Search3(int maxSize) {
        super(maxSize);
    }

    /**
     * 重写display方法
     */
    @Override
    public void display() {
        for(int i = 0; i < getCurLen(); i++){
            System.out.println(getListElem()[i]);
        }
        System.out.println();
    }

    /**
     * 使用二分法查找学生的信息（通过学生id查找）
     * @param student
     * @param key
     * @return
     */
    public int binarySearch(Student student[],int key){
        int low, hight, mid;
        low = 0; hight = student.length - 1;
        while (low <= hight){
            mid = (low + hight) / 2;
            if(student[mid].getId() == key){
                return mid;
            } else if(student[mid].getId() > key){
                hight = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        Student student1 = new Student(1001, "王小红", 88, 98);
        Student student2 = new Student(1002, "李小平", 78, 67);
        Student student3 = new Student(1003, "赵一飞", 87, 86);
        Student student4 = new Student(1004, "张春江", 67, 56);
        Student student5 = new Student(1005, "吴占豪", 88, 78);
        Student[] students = {student1, student2, student3, student4, student5};
        SY7_Search3 L = new SY7_Search3(10);
        for (int i = 0; i < students.length; i++) {
            L.insert(i, students[i]);
        }
        System.out.println("所有学生的信息: ");
        L.display();
        System.out.print("请输入学生的id(1001--1005): ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        int findId = L.binarySearch(students, id);
        while (findId == -1){
            System.out.print("您输入的id有误, 请重新输入id(1001--1005): ");
            id = sc.nextInt();
            findId = L.binarySearch(students,id);
        }
        System.out.println(students[findId].toString());
    }
}
