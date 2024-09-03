package com.atguigu.test2;

import java.util.Objects;

public class Work implements Comparable {
    private String name;
    private int age;
    private String gender;

    public Work() {

    }

    public Work(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Work{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Work)) return false;
        Work work = (Work) o;
        return getAge() == work.getAge() &&
                getName().equals(work.getName()) &&
                getGender().equals(work.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getGender());
    }

    // 比较大小
    @Override
    public int compareTo(Object o) {
        Work work = (Work)o;

//        this.age 不符合语法(私有属性)----有不规范之嫌
//        if(this.age > work.age){
//            return 1;
//        }else if(this.age < work.age){
//            return this.getAge() - work.getAge();
//        }else{
//            return 0;
//        }
         return this.getAge() - work.getAge();

    }
}
