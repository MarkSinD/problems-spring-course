package ru.sinakaev.springcourse.task24.service;

import ru.sinakaev.springcourse.task24.entity.Student;

import java.util.List;


public interface StudentService {
    Student getStudentById(int index);
    List<Student> getStudents();
}
