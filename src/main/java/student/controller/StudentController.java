
package student.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import student.dto.Student;
import student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<Student>> getAllStudents()
    {
        return   new ResponseEntity<>(service.getAllStudents(), HttpStatus.valueOf(200));
    }

    @PostMapping(produces = "application/json", consumes = "application/json")
    public ResponseEntity<Student> addStudent(@RequestBody Student student)
    {
        return new ResponseEntity<>(service.addStudent(student), HttpStatus.valueOf(201));
    }
}
