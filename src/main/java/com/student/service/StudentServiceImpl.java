package com.student.service;

import com.student.core.Student;
import com.student.dao.StudentDao;

import java.util.Collection;
import java.util.stream.Collectors;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;
    private int numberOfStudents;

    @Override
    public Student getOne(final long id) {
        return studentDao.getOne(id);
    }

    @Override
    public Collection<Student> getAllStudents() {
        return studentDao.getAll().stream().limit(numberOfStudents).collect(Collectors.toList());
    }

    public void setStudentDao(final StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void setNumberOfStudents(final int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
}
