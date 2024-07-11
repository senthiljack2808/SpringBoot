package org.example.springbootdatajpaormhibernateday12.service;

import java.util.List;
import java.util.Optional;
import org.example.springbootdatajpaormhibernateday12.model.StudentModel;
import org.example.springbootdatajpaormhibernateday12.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
    @Autowired
    StudentRepo studentRepo;
    
    public void addStudent(StudentModel s1) {
        studentRepo.save(s1);
    }
    
    public List<StudentModel> findAllStudent()
    {
        return studentRepo.findAll();
    }
    
    public Optional<StudentModel> findStudentById(Integer id)
    {
        return studentRepo.findById(id);
    }
    
    public StudentModel findStudentByName(String name)
    {
        return  studentRepo.findByName(name);
    }

    public StudentModel findStudentByMarks(int mark) {
        return studentRepo.findByMarks(mark);
    }

    public  List<StudentModel> findStudentMarksGreaterThan(int mark) {
        return studentRepo.findByMarksGreaterThan(mark);
    }

    public void updateStudent(StudentModel s) {
        studentRepo.save(s);
    }
    
    public void deleteStudent(StudentModel student)
    {
        studentRepo.delete(student);
    }
}
