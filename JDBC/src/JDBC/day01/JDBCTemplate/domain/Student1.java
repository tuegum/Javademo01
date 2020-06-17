package JDBC.day01.JDBCTemplate.domain;

public class Student1 {
    private Integer num;
    private String name;
    private int age;
    private String sex;
    private String address;
    private Double math;
    private Double english;

    public Student1(Integer num, String name, int age, String sex, String address, Double math, Double english) {
        this.num = num;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.math = math;
        this.english = english;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getMath() {
        return math;
    }

    public void setMath(Double math) {
        this.math = math;
    }

    public Double getEnglish() {
        return english;
    }

    public void setEnglish(Double english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", math=" + math +
                ", english=" + english +
                '}';
    }

    public Student1() {
    }
}
