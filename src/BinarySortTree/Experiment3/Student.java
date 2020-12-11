package BinarySortTree.Experiment3;

public class Student {
    private Integer id;
    private String name;
    private Integer english;
    private Integer math;
    private Integer total;

    public Student(Integer id, String name, Integer english, Integer math) {
        this.id = id;
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEnglish() {
        return english;
    }

    public void setEnglish(Integer english) {
        this.english = english;
    }

    public Integer getMath() {
        return math;
    }

    public void setMath(Integer math) {
        this.math = math;
    }

    public Integer getTotal() {
        Integer total = this.english + this.math;
        return total;
    }

    public void setTotal(Integer english, Integer math) {
        Integer total = english + math;
        this.total = total;
    }

    @Override
    public String toString() {
        return  "学号: " + id +
                "  姓名: " + name +
                "  英语: " + english +
                "  数学: " + math +
                "  总分: " + (english + math);
    }
}
