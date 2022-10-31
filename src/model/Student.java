package model;


import java.io.Serializable;

public class Student implements Serializable {


    private String name;
    private int age;
    private String code;
    private String className;
    private String address;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String className() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    Student(String name, int age, String code, String className, String address) {
        this.name = name;
        this.age = age;
        this.code = code;
        this.className = className;
        this.address = address;
    }

    public String toString() {
        return name + "," + age + "," + code + "," + className + "," + address + "\n";
    }

    public void showStudent() {
        System.out.printf("%20s%10s%10s%20s%20s\n", name, age, code, className, address);
    }


}
