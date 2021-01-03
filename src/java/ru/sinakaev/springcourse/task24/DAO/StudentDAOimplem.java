package ru.sinakaev.springcourse.task24.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.sinakaev.springcourse.task24.entity.Student;

import java.util.List;

@Repository
public class StudentDAOimplem implements StudentDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Student getStudentById(int index) {
        Session session = sessionFactory.getCurrentSession();
        Student student = session.get(Student.class, index);
        return student;
    }

    @Override
    public List<Student> getStudents() {
        Session session = sessionFactory.getCurrentSession();
        Query<Student> query = session.createQuery("FROM Student ORDER BY id", Student.class);
        List<Student> studentList = query.getResultList();
        return studentList;
    }
}
