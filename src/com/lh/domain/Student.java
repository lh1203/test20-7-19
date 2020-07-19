package com.lh.domain;

public class Student {
    private String stuid;
    private String name;

    public Student() {
    }

    public Student(String stuid, String name) {
        this.stuid = stuid;
        this.name = name;
    }

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuid='" + stuid + '\'' +
                ", stuname='" + name + '\'' +
                '}';
    }
}
