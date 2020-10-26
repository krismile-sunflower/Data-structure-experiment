package SequenceTable.Experiment3;

import SequenceTable.Experiment3.Student;

public class StudentMethod {
    private Student[] students; //线性表储存空间
    private int curLen; //线性表的当前长度


    /**
     * 创造一个线性表的构造方法，存储空间容量为maxSize
     * @param maxSize
     */
    public StudentMethod(int maxSize) {
        curLen = 0;
        students = new Student[maxSize];
    }

    /**
     * 插入学生
     * @param i
     * @param student
     * @throws Exception
     */
    public void insert(int i, Student student) throws Exception{
        if(this.curLen == students.length)
            throw new Exception("顺序表已满");
        if(i < 0 || i > this.curLen)
            throw new Exception("插入位置不合法");
        for(int j = curLen; j > i; j--){
            students[j] = students[j - 1];
        }
        students[i] = student;
        curLen++;

    }

    /**
     * 通过学生id找到学生
     * @param id
     * @throws Exception
     */
    public Student findStudentById(int id) throws Exception{
        int j = 0;
        while (j < curLen && students[j].getId() != id)
            j++;
        if(j < curLen)
            return students[j];
        else
            throw new Exception("该学号不存在");
    }

    /**
     * 通过学生姓名找到学生
     * @param name
     * @throws Exception
     */
    public Student findStudentByName(String name) throws Exception{
        int j = 0;
        while (j < curLen && !students[j].getName().equals(name))
            j++;
        if(j < curLen)
            return students[j];
        else
            throw new Exception("该学号不存在");
    }

    /**
     * 通过学生id修改学生信息
     * @param id
     * @param grades
     * @throws Exception
     */
    public Student modifyStudent(int id, int grades) throws Exception{
         Student student = findStudentById(id);
         student.setGrades(grades);
         return student;
    }

    /**
     * 通过学生id删除学生
     * @param id
     * @throws Exception
     */
    public void remove(int id) throws Exception{
        findStudentById(id);
        int j = 0;
        while(j < curLen && students[j].getId() != id)
            j++;
       for(int i = j; i < curLen - 1; i++){
           students[i] = students[i + 1];
       }
       curLen--;
    }

    /**
     * 输出所有学生的信息
     */
    public void display(){
        for(int i = 0; i < curLen; i++){
            System.out.println(students[i]);
        }
        System.out.println();
    }

}
