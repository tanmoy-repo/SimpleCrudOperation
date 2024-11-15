package com.tci.com.controller;

import com.tci.com.dto.StudentDTO;
import com.tci.com.entity.StudentEntity;
import com.tci.com.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController{

    @Autowired
    private StudentServiceImpl service;

    @PostMapping("/create")
    public ResponseEntity<StudentEntity> createEntry(@RequestBody StudentDTO studentDTO){

        return new ResponseEntity<>(service.createStudentEntry(studentDTO) , HttpStatus.CREATED);
    }

    @GetMapping("/students")
    public ResponseEntity<List<StudentEntity>> getStudents(){

        return new ResponseEntity<>(service.getStudentEntry() , HttpStatus.OK);
    }



}
