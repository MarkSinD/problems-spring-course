package ru.sinakaev.springcourse.task3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloContoller {

    @RequestMapping("/hello")
    public String sayHello(){
        return "helloworld-form";
    }

    @GetMapping("/h")
    public String sayGoodbuy(){
        return "main-menu";
    }
}
