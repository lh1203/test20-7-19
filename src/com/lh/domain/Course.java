package com.lh.domain;

public class Course {
    private String courid;
    private String name;

    public Course(String courid, String name) {
        this.courid = courid;
        this.name = name;
    }

    public Course() {
    }

    public String getCourid() {
        return courid;
    }

    public void setCourid(String courid) {
        this.courid = courid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courid='" + courid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
