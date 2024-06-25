package org.example.springbootjdbch2day4;

import java.util.List;
import org.example.springbootjdbch2day4.model.Student;
import org.example.springbootjdbch2day4.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootJdbcH2Day4Application {

    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(SpringBootJdbcH2Day4Application.class, args);
        Student studentModel=context.getBean(Student.class);
        studentModel.setId(101);
        studentModel.setName("Senthil");
        studentModel.setMark(96);

        StudentService service=context.getBean(StudentService.class);
        service.addStudent(studentModel);

        List<Student> students=service.getStudents();
        System.out.println(students);
        
    }

}
