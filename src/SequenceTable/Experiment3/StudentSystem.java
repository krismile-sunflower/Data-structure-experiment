package SequenceTable.Experiment3;

import SequenceTable.Experiment3.Student;
import SequenceTable.Experiment3.StudentMethod;

import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) throws Exception {
        StudentMethod studentMethod = new StudentMethod(10);
        Student student1 = new Student(2008001, "Alan", 'F', "13305731283", "浙江省嘉兴市",90);
        Student student2 = new Student(2008002, "Danie", 'M', "0573-82283288", "浙江省嘉兴市", 80);
        Student student3 = new Student(2008003, "Helen", 'M', "13507942222", "江苏省抚州市",99.5);
        Student student4 = new Student(2008004, "Bill", 'F', "0571-72529911", "浙江省杭州市", 89);
        Student student5 = new Student(2008005, "Peter", 'M', "13857354444", "浙江省嘉兴市", 84.5);
        Student student6 = new Student(2008006, "Amy", 'F', "1396367777", "安徽省蚌埠市", 88);
        Student student7 = new Student();
        studentMethod.insert(0, student1);
        studentMethod.insert(1, student2);
        studentMethod.insert(2, student3);
        studentMethod.insert(3, student4);
        studentMethod.insert(4, student5);
        studentMethod.insert(5, student6);
        System.out.println("一开始的所有学生：");
        studentMethod.display();

        System.out.print("根据id查找学生,请输入学生的id(2008001--2008006)：");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        System.out.println(studentMethod.findStudentById(id));
        System.out.println();

        System.out.print("根据姓名查找学生,请输入学生的姓名：");
        String name = sc.next();
        System.out.println(studentMethod.findStudentByName(name));
        System.out.println();

        System.out.print("修改学生信息, 请输入修改学生的学号(2008001--2008006)：");
        int updateId = sc.nextInt();
        System.out.print("修改学生信息, 请输入修改该学生的成绩：");
        int updateGrades = sc.nextInt();
        studentMethod.modifyStudent(updateId, updateGrades);
        studentMethod.display();

        System.out.print("增加学生, 请输入插入的位置(0--6): ");
        int i = sc.nextInt();
        studentMethod.insert(i, student7);
        studentMethod.display();

        System.out.print("删除学生,请输入删除学生的id ：");
        int deleteId = sc.nextInt();
        studentMethod.remove(deleteId);
        studentMethod.display();
    }
}
