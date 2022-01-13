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
        students.put(2L, new Student("John", "Cook", "Chemistry", 155.0));
        students.put(3L, new Student("Andrew", "Tom", "English Literature", 148.0));
        students.put(4L, new Student("Jin", "Iris", "Botany", 140.0));
    }

    @Override
    public Student getOne(final long id) {
        return students.get(id);
    }

    @Override
    public Collection<Student> getAll() {
        return students.values();
    }
}
