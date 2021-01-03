package ru.sinakaev.springcourse.task20.dao;

import ru.sinakaev.springcourse.task20.entity.*;

import java.util.List;

public interface CollegeDAO {
    List<Instructor> getInstructorsById();
    List<Instructor> getInstructorsByFirstName();
    List<Instructor> getInstructorsByLastName();
    List<Instructor> getInstructorsByEmail();

    public Course getCourseById(int id);

    List<InstructorDetail> getInstructorDetails();
    List<Course> getCourses();
    List<Review> getReviews();
    List<Student> getStudents();

    void deleteInstructor(int theId);
    void deleteInstructorDetail(int theId);
    void deleteCourse(int theId);
    void deleteReview(int theId);
    void deleteStudent(int theId);

    void saveInstructor(Instructor instructor);
    void saveInstructorDetail(InstructorDetail instructorDetail);
    void saveCourse(Course course);
    void saveReview(Review review);
    void saveStudent(Student student);


}
