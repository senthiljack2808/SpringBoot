package org.example.springbootjobappormday13.repo;

import org.example.springbootjobappormday13.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepo extends JpaRepository<JobPost,Integer> {
}
