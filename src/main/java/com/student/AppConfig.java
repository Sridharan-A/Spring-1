package com.student;

import com.student.dao.StudentDao;
import com.student.dao.StudentDaoImpl;
import com.student.service.StudentService;
import com.student.service.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:student_service.properties")
public class AppConfig {

    @Bean(name = "studentService")
    public StudentService getStudentService() {
        StudentServiceImpl service = new StudentServiceImpl();
        return service;
    }

    @Bean(name = "studentDao")
    public StudentDao getStudentDao() {
        StudentDaoImpl studentDao = new StudentDaoImpl();
        return studentDao;
    }
}
