package ru.sinakaev.springcourse.task20.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.sinakaev.springcourse.task20.entity.*;

import java.util.List;

@Repository
public class CollegeDAOImpl implements CollegeDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Instructor> getInstructorsById() {
        Session session = sessionFactory.getCurrentSession();
        Query<Instructor> query = session.createQuery("FROM Instructor ORDER BY id", Instructor.class);
        List<Instructor> instructorList = query.getResultList();
        return instructorList;
    }

    @Override
    public List<Instructor> getInstructorsByFirstName() {
        Session session = sessionFactory.getCurrentSession();
        Query<Instructor> query = session.createQuery("FROM Instructor ORDER BY first_name", Instructor.class);
        List<Instructor> instructorList = query.getResultList();
        return instructorList;
    }

    @Override
    public List<Instructor> getInstructorsByLastName() {
        Session session = sessionFactory.getCurrentSession();
        Query<Instructor> query = session.createQuery("FROM Instructor ORDER BY last_name", Instructor.class);
        List<Instructor> instructorList = query.getResultList();
        return instructorList;
    }

    @Override
    public List<Instructor> getInstructorsByEmail() {
        Session session = sessionFactory.getCurrentSession();
        Query<Instructor> query = session.createQuery("FROM Instructor ORDER BY email", Instructor.class);
        List<Instructor> instructorList = query.getResultList();
        return instructorList;
    }

    @Override
    public Course getCourseById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Course course = session.get(Course.class, id);
        return course;
    }

    @Override
    public List<InstructorDetail> getInstructorDetails() {
        Session session = sessionFactory.getCurrentSession();
        Query<InstructorDetail> query = session.createQuery("from InstructorDetail", InstructorDetail.class);
        List<InstructorDetail> instructorDetailList = query.getResultList();
        return instructorDetailList;
    }

    @Override
    public List<Course> getCourses() {
        Session session = sessionFactory.getCurrentSession();
        Query<Course> query = session.createQuery("from Course", Course.class);
        List<Course> courselList = query.getResultList();
        return courselList;
    }

    @Override
    public List<Review> getReviews() {
        Session session = sessionFactory.getCurrentSession();
        Query<Review> query = session.createQuery("from Review", Review.class);
        List<Review> reviewList = query.getResultList();
        return reviewList;
    }

    @Override
    public List<Student> getStudents() {
        Session session = sessionFactory.getCurrentSession();
        Query<Student> query = session.createQuery("from Student", Student.class);
        List<Student> studentList = query.getResultList();
        return studentList;
    }

    @Override
    public void deleteInstructor(int theId) {
        Session session = sessionFactory.getCurrentSession();
        Instructor instructor;
        instructor = session.get(Instructor.class, theId);
        session.delete(instructor);
    }

    @Override
    public void deleteInstructorDetail(int theId) {
        Session session = sessionFactory.getCurrentSession();
        InstructorDetail instructorDetail;
        instructorDetail = session.get(InstructorDetail.class, theId);
        session.delete(instructorDetail);
    }

    @Override
    public void deleteCourse(int theId) {
        Session session = sessionFactory.getCurrentSession();
        Course course;
        course = session.get(Course.class, theId);
        session.delete(course);
    }

    @Override
    public void deleteReview(int theId) {
        Session session = sessionFactory.getCurrentSession();
        Review review;
        review = session.get(Review.class, theId);
        session.delete(review);
    }

    @Override
    public void deleteStudent(int theId) {
        Session session = sessionFactory.getCurrentSession();
        Student student;
        student = session.get(Student.class, theId);
        session.delete(student);
    }

    @Override
    public void saveInstructor(Instructor instructor) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(instructor);
    }

    @Override
    public void saveInstructorDetail(InstructorDetail instructorDetail) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(instructorDetail);
    }

    @Override
    public void saveCourse(Course course) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(course);
    }

    @Override
    public void saveReview(Review review) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(review);
    }

    @Override
    public void saveStudent(Student student) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(student);
    }

}
