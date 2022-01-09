package com.student.dao;

import com.student.core.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StudentDaoImpl implements StudentDao {

    private Map<Long, Student> students;

    {
        students = new HashMap<>();
        students.put(1L, new Student("Eric", "Colbert", "English Literature", 145.0));
    }

    @Override
    public Student getOne(final long id) {
        return students.get(1);
    }

    @Override
    public Collection<Student> getAll() {
        return students.values();
    }
}
