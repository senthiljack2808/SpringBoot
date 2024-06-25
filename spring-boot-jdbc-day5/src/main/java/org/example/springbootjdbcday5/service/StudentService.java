package org.example.springbootjdbcday5.service;

import java.util.List;
import org.example.springbootjdbcday5.model.Student;
import org.example.springbootjdbcday5.repo.StudentDataAccessObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentDataAccessObject repo;
    

    public StudentDataAccessObject getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentDataAccessObject repo) {
        this.repo = repo;
    }

    
    
    
    public void addStudent(Student student) {
        repo.save(student);
    }

    public List<Student> getStudents() {
      return repo.findAll();
    }
}
