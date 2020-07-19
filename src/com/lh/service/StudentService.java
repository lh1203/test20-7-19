package com.lh.service;

import com.lh.domain.Student;
import com.lh.vo.SAndC;
import com.lh.vo.StudentAndCourse;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudent();
    void insertIntoStudent(Student stu);
    Student findOneStudentById(String stuid);
    List<StudentAndCourse> findAllStudetAndCourse();
}
