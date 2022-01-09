package com.student.service;

import com.student.core.Student;

import java.util.Collection;

public interface StudentService {

    Student getOne(long id);

    Collection<Student> getAllStudents();
}
