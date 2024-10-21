package com.tci.com.service;

import com.tci.com.dto.StudentDTO;
import com.tci.com.entity.StudentEntity;
import com.tci.com.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl {

    @Autowired
    private StudentRepository repository;

    public StudentEntity createStudentEntry(StudentDTO studentDTO){

        StudentEntity studentEntity = StudentEntity.builder().email(studentDTO.getEmail()).name(studentDTO.getName()).mobile(studentDTO.getMobile()).build();
        return repository.save(studentEntity);
    }

    public List<StudentEntity> getStudentEntry() {
        return repository.findAll();
    }
}
