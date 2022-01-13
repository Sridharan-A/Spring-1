package com.student.service;

import com.student.core.Student;
import com.student.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;


public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Value("${studentService.numberOfStudents}")
    private int numberOfStudents;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public Student getOne(final long id) {
        return studentDao.getOne(id);
    }

    @Override
    public Collection<Student> getAllStudents() {
        return studentDao.getAll().stream().limit(numberOfStudents).collect(Collectors.toList());
    }
    @Value("#{studentDao.getAll.?[dept.equals('${department}')]}")
    private Collection<Student> StudentsForDept = new ArrayList<>();

    public Collection<Student> getStudentsForDept(){
        return StudentsForDept;
    }



}
