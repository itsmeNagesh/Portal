package com.Nagesh.Create.a.Portal.repository;

import com.Nagesh.Create.a.Portal.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,String> {
}