package ru.sinakaev.springcourse.task24.REST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sinakaev.springcourse.task24.entity.Student;
import ru.sinakaev.springcourse.task24.service.StudentService;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RESTController {

    @Autowired
    StudentService studentService;

    List<Student> theStudents;
    @PostConstruct
    public void loadData(){
        theStudents = new ArrayList<>();
        theStudents.add(new Student("Mark", "Sinakaev", "mark@gmail.com"));
        theStudents.add(new Student("Mario", "Rossi", "mario@yandex.ru"));
        theStudents.add(new Student("Mary", "Smith", "mary@usa.com"));
    }


    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> studentList = studentService.getStudents();

        return studentList;
    }
}
