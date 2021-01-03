package ru.sinakaev.springcourse.task20.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.sinakaev.springcourse.task20.dao.CollegeDAO;
import ru.sinakaev.springcourse.task20.entity.*;

import java.util.List;

@Service
public class CollegeServiceImpl implements CollegeService {

    @Autowired
    CollegeDAO collegeDAO;

    @Override
    @Transactional
    public List<Instructor> getInstructorsById() {
        return collegeDAO.getInstructorsById();
    }

    @Override
    @Transactional
    public List<Instructor> getInstructorsByFirstName() { return collegeDAO.getInstructorsByFirstName(); }

    @Override
    @Transactional
    public List<Instructor> getInstructorsByLastName() { return collegeDAO.getInstructorsByLastName(); }

    @Override
    @Transactional
    public List<Instructor> getInstructorsByEmail() { return collegeDAO.getInstructorsByEmail(); }

    @Override
    @Transactional
    public List<InstructorDetail> getInstructorDetails() {
        return collegeDAO.getInstructorDetails();
    }

    @Override
    @Transactional
    public List<Course> getCourses() {
        return collegeDAO.getCourses();
    }

    @Override
    @Transactional
    public List<Review> getReviews() {
        return collegeDAO.getReviews();
    }

    @Override
    @Transactional
    public List<Student> getStudents() {
        return collegeDAO.getStudents();
    }

    @Override
    public Course getCourseById(int id) {
        return null;
    }

    @Override
    @Transactional
    public void deleteInstructor(int theId) { collegeDAO.deleteInstructor(theId); }

    @Override
    @Transactional
    public void deleteInstructorDetail(int theId) { collegeDAO.deleteInstructorDetail(theId); }

    @Override
    @Transactional
    public void deleteCourse(int theId) { collegeDAO.deleteCourse(theId); }

    @Override
    @Transactional
    public void deleteReview(int theId) { collegeDAO.deleteReview(theId); }

    @Override
    @Transactional
    public void deleteStudent(int theId) { collegeDAO.deleteStudent(theId); }

    @Override
    @Transactional
    public void saveInstructor(Instructor instructor) { collegeDAO.saveInstructor(instructor); }

    @Override
    @Transactional
    public void saveInstructorDetail(InstructorDetail instructorDetail) { collegeDAO.saveInstructorDetail(instructorDetail); }

    @Override
    @Transactional
    public void saveCourse(Course course) { collegeDAO.saveCourse(course); }

    @Override
    @Transactional
    public void saveReview(Review review) { collegeDAO.saveReview(review); }

    @Override
    @Transactional
    public void saveStudent(Student student) { collegeDAO.saveStudent(student);}

}
