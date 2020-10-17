package SequenceTable;

public class Student {
    private int id;
    private String name;
    private char sex;
    private String tel;
    private String address;
    private double grades;

    public Student() {
    }

    public Student(int id, String name, char sex, String tel, String address, double grades) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.tel = tel;
        this.address = address;
        this.grades = grades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGrades() {
        return grades;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                ", grades=" + grades +
                '}';
    }
}
