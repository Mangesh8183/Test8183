package com.example.springboottutorialdemo.service;

import java.util.List;

 

import com.example.springboottutorialdemo.entity.StudentEntity;

import jakarta.validation.Valid;

public interface StudentService {

	StudentEntity addStudent(StudentEntity student);

	List<StudentEntity> getAllStudent();

	StudentEntity getStudentById(Integer id);

	StudentEntity updateStudentById(@Valid StudentEntity student, Integer id);

	StudentEntity deleteStudentById(Integer id);

	List<StudentEntity> getStudentByName(String name);

}
