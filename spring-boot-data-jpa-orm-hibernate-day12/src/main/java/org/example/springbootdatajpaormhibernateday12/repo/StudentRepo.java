package org.example.springbootdatajpaormhibernateday12.repo;

import java.util.List;
import org.example.springbootdatajpaormhibernateday12.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<StudentModel,Integer> {
    
    StudentModel findByName(String name);

    StudentModel findByMarks(int mark);


    List<StudentModel> findByMarksGreaterThan(int mark);
}
