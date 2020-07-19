package com.lh.dao;

import com.lh.domain.Student;
import com.lh.vo.SAndC;
import com.lh.vo.StudentAndCourse;

import java.util.List;

public interface StudentDao {
    List<Student> findAllStudent();
    void insertIntoStudent(Student stu);

    Student findOneStudentById(String stuid);

    List<StudentAndCourse> findAllStudetAndCourse();
}
