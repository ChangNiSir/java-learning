package com.atguigu.test1;

import java.util.Objects;

public class Student implements Comparable{
    private String stuName;
    private int stuAge;
    private String stuGender;

    public Student(){
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
                ", stuGender='" + stuGender + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Student)) return false;
//        Student student = (Student) o;
//        return getStuAge() == student.getStuAge() &&
//                getStuName().equals(student.getStuName()) &&
//                getStuGender().equals(student.getStuGender());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getStuName(), getStuAge(), getStuGender());
//    }


    @Override
    public int hashCode() {
        return stuName.hashCode()+new Integer(stuAge).hashCode()+stuGender.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        boolean flag = false;
        if(this == obj){
            flag = true;
        }else{
            if(obj instanceof Student){
                Student stu = (Student)obj;
                if(this.getStuName().equals(stu.getStuName())
                        &&this.getStuAge()==stu.getStuAge()
                        &&this.getStuGender().equals(stu.getStuGender())){
                    flag = true;
                }
            }
        }
        return flag;
    }

    // 返回负数代表调用方法的对象小
    // 返回正数代表调用方法的对象大
    // 返回0代表两对象相等
    @Override
    public int compareTo(Object o) {
        Student stu = (Student)o;
        int result =  this.getStuAge() - stu.getStuAge();// 和方法描述一致 -> 升序排序
        if(result == 0){
            result = this.getStuName().compareTo(stu.getStuName());
        }
        if(result == 0){
            result = this.getStuGender().compareTo(stu.getStuGender());
        }
        return result;
    }
}
