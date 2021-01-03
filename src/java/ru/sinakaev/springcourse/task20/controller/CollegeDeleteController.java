package ru.sinakaev.springcourse.task20.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.sinakaev.springcourse.task20.service.CollegeService;

@Controller
@RequestMapping("/delete")
public class CollegeDeleteController {

    @Autowired
    CollegeService collegeService;

    @RequestMapping("/deleteInstructor")
    public String deleteInstructor(@RequestParam("instructorId") int theId){
        System.out.println("Delete Instructor" + theId);
        collegeService.deleteInstructor(theId);
        return "redirect:/show/showInstructorsList";
    }

    @RequestMapping("/deleteInstructorDetail")
    public String deleteInstructorDetail(@RequestParam("instructorDetailId") int theId){
        System.out.println("Delete Instructor Detail" + theId);
        collegeService.deleteInstructorDetail(theId);
        return "redirect:/show/showInstructorDetailsList";
    }

    @RequestMapping("/deleteCourse")
    public String deleteCourse(@RequestParam("courseId") int theId){
        System.out.println("2. Delete Course" + theId);
        collegeService.deleteCourse(theId);
        return "redirect:/show/showCourseList";
    }

    @RequestMapping("/deleteReview")
    public String deleteReview(@RequestParam("reviewId") int theId){
        System.out.println("2. Delete Review" + theId);
        collegeService.deleteReview(theId);
        return "redirect:/show/showReviewsList";
    }

    @RequestMapping("/deleteStudent")
    public String deleteStudent(@RequestParam("studentId") int theId){
        System.out.println("2. Delete Student" + theId);
        collegeService.deleteStudent(theId);
        return "redirect:/show/showStudentsList";
    }
}
