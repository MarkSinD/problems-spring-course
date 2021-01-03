package ru.sinakaev.springcourse.task22;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("WEB-INF/spring-mvc-crud-demo-servlet.xml");

        Nubmers nubmers = (Nubmers) context.getBean("nubmers");
        nubmers.setA(5);
        nubmers.setB(4);

        System.out.println(nubmers.getSum());
        System.out.println(nubmers.getMult());
    }
}
