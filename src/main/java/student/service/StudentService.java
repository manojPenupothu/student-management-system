package student.service;

import student.dto.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getAllStudents();


    public Student addStudent(Student student);
}
