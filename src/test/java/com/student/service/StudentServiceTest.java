package com.student.service;

import com.student.AppConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StudentServiceTest {

    private ApplicationContext context;
    private StudentService service;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(AppConfig.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(x -> System.out.println(x));
        service = context.getBean("studentService", StudentService.class);
    }

    @Test
    void testGetOneStudent() {
        assertNotNull(service);
    }

    @Test
    void testAll() {
        service.getAllStudents().forEach((args) -> {
            System.out.println(args);
        });
    }

    @Test
    void testStudentForDept(){
        assertEquals(service.getStudentsForDept().size(),2);
    }
}