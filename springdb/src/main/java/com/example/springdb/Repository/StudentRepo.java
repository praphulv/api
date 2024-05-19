package com.example.springdb.Repository;

import com.example.springdb.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository <Student,Integer>{

}
