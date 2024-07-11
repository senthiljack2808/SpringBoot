package org.example.springbootdatajpaormhibernateday12.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Entity
@Scope("prototype")
public class StudentModel {

    @Id
    private int rollno;
    private String name;
    private int marks;
    
    
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


    @Override
    public String toString() {
        return "StudentModel{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
