package org.example.springbootdatajpaormhibernateday12;

import org.example.springbootdatajpaormhibernateday12.model.StudentModel;
import org.example.springbootdatajpaormhibernateday12.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDataJpaOrmHibernateDay12Application {

    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(SpringBootDataJpaOrmHibernateDay12Application.class, args);
        StudentModel s1=context.getBean(StudentModel.class);
        s1.setRollno(1);
        s1.setName("Senthil");
        s1.setMarks(97);
        
        StudentModel s2 = context.getBean(StudentModel.class);
        s2.setRollno(2);
        s2.setName("Sherin");
        s2.setMarks(89);

        StudentModel s3 = context.getBean(StudentModel.class);
        s3.setRollno(3);
        s3.setName("Angelin");
        s3.setMarks(99);

        StudentService service=context.getBean(StudentService.class);
        service.addStudent(s1);
        service.addStudent(s2);
        service.addStudent(s3);

        System.out.println(service.findAllStudent());

        System.out.println(service.findStudentById(3).orElse(null));

        System.out.println("Sherin "+service.findStudentByName("Sherin"));

        System.out.println(service.findStudentByMarks(97));

        System.out.println("mark greater than "+service.findStudentMarksGreaterThan(70));
        
        service.updateStudent(s3);

        System.out.println(service.findAllStudent());
        
        service.deleteStudent(s1);

        System.out.println(service.findAllStudent());
        
    }

}
