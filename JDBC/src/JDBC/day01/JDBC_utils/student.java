package JDBC.day01.JDBC_utils;

import java.util.Date;

public class student {
    private int id;
    private String name;
    private int age;
    private float english_score;
    private Date birthday;

    public student(int id, String name, int age, float english_score, Date birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.english_score = english_score;
        this.birthday = birthday;
    }

    public student() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getEnglish_score() {
        return english_score;
    }

    public void setEnglish_score(float english_score) {
        this.english_score = english_score;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", english_score=" + english_score +
                ", birthday=" + birthday +
                '}';
    }
}
