package ru.sinakaev.springcourse.task20.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.sinakaev.springcourse.task20.entity.*;
import ru.sinakaev.springcourse.task20.service.CollegeService;

import java.util.List;

@Controller
@RequestMapping("/edit")
public class CollegeEditController {

    @Autowired
    CollegeService collegeService;

    /*@InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(List.class, "courseList", new CustomCollectionEditor(List.class)
        {
            @Override
            protected Object convertElement(Object element)
            {
                Integer id = null;

                if(element instanceof String && !((String)element).equals("")){
                    //From the JSP 'element' will be a String
                    try{
                        id = Integer.parseInt((String) element);
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Element was " + ((String) element));
                        e.printStackTrace();
                    }
                }
                else if(element instanceof Integer) {
                    //From the database 'element' will be a Long
                    id = (Integer) element;
                }

                return id != null ? collegeService.getCourseById(id) : null;
            }
        });
    }*/

    @RequestMapping("/showInstructorFormAdd")
    public String getInstructorFormAdd(Model theModel){
        Instructor instructor = new Instructor();
        List<InstructorDetail> instructorDetailList = collegeService.getInstructorDetails();
        theModel.addAttribute("instructorDetailList", instructorDetailList);
        theModel.addAttribute("instructor", instructor);
        return "instructors-form";
    }

    @RequestMapping("/showInstructorDetailFormAdd")
    public String getInstructorDetailFormAdd(Model theModel){
        InstructorDetail instructorDetail = new InstructorDetail();
        Instructor instructor = new Instructor();
        List<Instructor> instructorList = collegeService.getInstructorsById();

        theModel.addAttribute("instructor", instructor);
        theModel.addAttribute("instructorList", instructorList);
        theModel.addAttribute("instructorDetail", instructorDetail);
        return "instructor-details-form";
    }

    @RequestMapping("/showCourseFormAdd")
    public String getCourseFormAdd(Model theModel){
        Course course = new Course();
        List<Instructor> instructorList = collegeService.getInstructorsById();

        theModel.addAttribute("instructorList", instructorList);
        theModel.addAttribute("course", course);
        return "courses-form";
    }

    @RequestMapping("/showReviewsFormAdd")
    public String getReviewsAdd(Model theModel){
        Review review = new Review();
        List<Course> courseList = collegeService.getCourses();
        theModel.addAttribute("courseList", courseList);
        theModel.addAttribute("review", review);
        return "reviews-form";
    }

    @RequestMapping("/showStudentsFormAdd")
    public String getStudentsFormAdd(Model theModel){
        Student student = new Student();
        List<Course> courseList = collegeService.getCourses();
        theModel.addAttribute("courseList", courseList);
        theModel.addAttribute("student", student);
        return "students-form";
    }
}
