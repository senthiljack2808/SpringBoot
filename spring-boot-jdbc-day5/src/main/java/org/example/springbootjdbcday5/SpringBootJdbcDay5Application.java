package org.example.springbootjdbcday5;

import org.example.springbootjdbcday5.model.Student;
import org.example.springbootjdbcday5.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootJdbcDay5Application {

    public static void main(String[] args) {
        
        ApplicationContext context=SpringApplication.run(SpringBootJdbcDay5Application.class, args);
        Student student=context.getBean(Student.class);
        student.setId(21);
        student.setName("Navin");
        student.setMark(89);
        StudentService service=context.getBean(StudentService.class);
        service.addStudent(student);

        System.out.println("List of students "+service.getStudents());
        
    }

}
