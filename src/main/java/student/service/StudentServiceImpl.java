package student.service;

import student.dto.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{


    static List<Student> list=new ArrayList<>();

    @Override
    public List<Student> getAllStudents() {
        return list;
    }

    @Override
    public Student addStudent(Student student) {
        list.add(student);
        return student;
    }
}
