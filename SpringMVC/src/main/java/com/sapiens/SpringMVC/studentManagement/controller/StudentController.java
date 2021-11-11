package com.sapiens.SpringMVC.studentManagement.controller;


import com.sapiens.SpringMVC.empManagement.exception.ResourceNotFoundException;

import com.sapiens.SpringMVC.studentManagement.model.Student;
import com.sapiens.SpringMVC.studentManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable(value = "id") Long studentId) throws ResourceNotFoundException {
        Student student = studentRepository.findById(studentId).orElseThrow(() -> new ResourceNotFoundException("Student Not Found ::" + studentId));
        return ResponseEntity.ok().body(student);
    }

    @PostMapping("/students")
    public Student createStudent(@Valid @RequestBody Student student){
        return studentRepository.save(student);
    }

    @PutMapping("/students/{id}")
    public ResponseEntity<Student> updateStudentById(@PathVariable(value = "id") Long studentId, @Valid @RequestBody Student studentDetails) throws ResourceNotFoundException{
        Student student = studentRepository.findById(studentId).orElseThrow(()->new ResourceNotFoundException("Student Not Found ::" + studentId));

        student.setFirstName(studentDetails.getFirstName());
        student.setLastName(studentDetails.getFirstName());
        student.setAge(studentDetails.getAge());
        student.setGrade(studentDetails.getGrade());
        student.setCity(studentDetails.getCity());
        student.setPercentage(studentDetails.getPercentage());
        student.setGender(studentDetails.getGender());

        final Student updateStudent = studentRepository.save(student);
        return ResponseEntity.ok().body(updateStudent);
    }

    @DeleteMapping("/students/{id}")
    public Map<String, Boolean> deleteStudent(@PathVariable(value = "id") Long studentId) throws ResourceNotFoundException{
        Student student = studentRepository.findById(studentId).orElseThrow(()-> new ResourceNotFoundException("Student not Found:"+studentId));
        studentRepository.delete(student);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;

    }
}