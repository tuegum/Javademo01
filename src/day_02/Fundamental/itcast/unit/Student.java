package day_02.Fundamental.itcast.unit;

public class Student {
    private String name;
    private int age;
    public int Grade;

    public void run(){
        System.out.println("run...");
    }
    public Student() {
    }

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        Grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int grade) {
        Grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Grade=" + Grade +
                '}';
    }
}
