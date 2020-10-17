package SequenceTable;

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
        studentMethod.display();
        System.out.println();
        System.out.println(studentMethod.findStudentById(2008001));
        System.out.println(studentMethod.findStudentByName("Amy"));
        studentMethod.modifyStudent(2008001, 70);
        System.out.println();
        studentMethod.display();
        studentMethod.insert(6, student7);
        studentMethod.display();
        studentMethod.remove(0);
        System.out.println("删除后的元素：");
        studentMethod.display();
    }
}
