package org.example.springbootjdbcday5.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.example.springbootjdbcday5.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDataAccessObject {
    
    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    
    public void save(Student student) {
        String sql="INSERT INTO Student (id,name,mark) VALUES (?,?,?)";
        int row=jdbc.update(sql,student.getId(),student.getName(),student.getMark());
        System.out.println(row+" row  effected");
    }


    public List<Student> findAll() {
        String sql="SELECT * FROM Student";
        RowMapper<Student> rowMapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student=new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setMark(rs.getInt("mark"));
                return student;
            }
            
        };
        
      return jdbc.query(sql,rowMapper); 
    }
}
