package com.example.springdb.Service;

import com.example.springdb.Entity.Student;
import com.example.springdb.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student savedDetails(Student student){

        return studentRepo.save(student);
    }

    public List<Student> getAllDetails(){
        return studentRepo.findAll();
    }
}
