package com.lh.service.imp;

import com.lh.dao.StudentDao;
import com.lh.domain.Student;
import com.lh.service.StudentService;
import com.lh.until.SqlSessionUntil;
import com.lh.vo.SAndC;
import com.lh.vo.StudentAndCourse;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentServiceImp implements StudentService {

    private StudentDao studentDaoInvo = SqlSessionUntil.getSqlSession().getMapper(StudentDao.class);

    @Override
    public List<Student> findAllStudent() {

        return studentDaoInvo.findAllStudent();
    }
    @Override
    public void insertIntoStudent(Student stu) {
        studentDaoInvo.insertIntoStudent(stu);
    }

    @Override
    public Student findOneStudentById(String stuid) {
        return studentDaoInvo.findOneStudentById(stuid);
    }

    public List<StudentAndCourse> findAllStudetAndCourse() {
        return studentDaoInvo.findAllStudetAndCourse();
    }
}
