package com.example.springdb.Controller;

import com.example.springdb.Entity.Student;
import com.example.springdb.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentCon {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student postDetails(@RequestBody Student student){
        return studentService.savedDetails(student);
    }

    @GetMapping("/getStudent")
    public List<Student> getDetails(){
        return studentService.getAllDetails();
    }
}
