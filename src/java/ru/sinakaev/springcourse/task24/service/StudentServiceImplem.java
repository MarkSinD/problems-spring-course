package ru.sinakaev.springcourse.task24.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sinakaev.springcourse.task24.DAO.StudentDAO;
import ru.sinakaev.springcourse.task24.entity.Student;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentServiceImplem implements StudentService {
    @Autowired
    StudentDAO studentDAO;

    @Override
    @Transactional
    public Student getStudentById(int index) {
        return studentDAO.getStudentById(index);
    }

    @Override
    @Transactional
    public List<Student> getStudents() {
        return studentDAO.getStudents();
    }
}
