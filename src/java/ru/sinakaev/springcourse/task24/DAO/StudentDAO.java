package ru.sinakaev.springcourse.task24.DAO;


import ru.sinakaev.springcourse.task24.entity.Student;

import java.util.List;

public interface StudentDAO {
    Student getStudentById(int index);
    List<Student> getStudents();
}
