package ru.sinakaev.springcourse.task21;

import org.springframework.stereotype.Component;

@Component
public class Pen {
    int id;
    String name;
    String age;

    public Pen() {
    }

    public Pen(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "name='" + name + '\'' +
                '}';
    }
}
