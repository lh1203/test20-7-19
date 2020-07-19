package com.lh.vo;

import com.lh.domain.Course;
import com.lh.domain.Student;

public class SAndC {
    private Student student;
    private Course course;

    public SAndC() {
    }

    public SAndC(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "SAndC{" +
                "student=" + student +
                ", course=" + course +
                '}';
    }
}
