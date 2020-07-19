package com.lh.test;

import com.lh.dao.StudentDao;
import com.lh.domain.Student;
import com.lh.service.StudentService;
import com.lh.service.imp.StudentServiceImp;
import com.lh.until.TransactionInvocationUntill;
import com.lh.vo.SAndC;
import com.lh.vo.StudentAndCourse;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        StudentService ssInvo = (StudentService) new TransactionInvocationUntill(new StudentServiceImp()).getProxy();
        List<StudentAndCourse> scList = ssInvo.findAllStudetAndCourse();
        for (StudentAndCourse item: scList) {
            System.out.println(item);
        }
    }
}
