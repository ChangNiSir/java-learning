package com.atguigu.test;

import java.util.Objects;

public class Student implements Comparable<Student>  {
    private String stuName;
    private int stuAge;
    private String stuGender;

    public Student() {
    }

    public Student(String stuName, int stuAge, String stuGender) {
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuGender = stuGender;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", stuGender=" + stuGender +
                '}';
    }

    // 保证Student对象可以放到HashSet
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getStuAge() == student.getStuAge() &&
                getStuGender().equals(student.getStuGender()) &&
                getStuName().equals(student.getStuName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getStuName(), getStuAge(), getStuGender());
    }

    // 保证Student对象可以放到TreeSet---自然排序
    @Override
    public int compareTo(Student o) {
        int result = this.getStuAge() - o.getStuAge();
        if(result == 0){
            result = this.getStuName().compareTo(o.getStuName());
        }
        if(result == 0){
            result = this.getStuGender().compareTo(o.getStuGender());
        }
        return result;
    }
}
