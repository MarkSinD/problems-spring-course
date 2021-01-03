package ru.sinakaev.springcourse.task23;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class testJSON {
    public static void main(String[] args) {

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Student student = objectMapper.readValue(new File("data/sample-full.json"), Student.class);
            System.out.println(student.getId());
            System.out.println(student.getFirstName());
            System.out.println(student.getLastName());
            System.out.println(student.isActive());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
