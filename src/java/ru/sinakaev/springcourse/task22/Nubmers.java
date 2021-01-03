package ru.sinakaev.springcourse.task22;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Nubmers {
    private int a;
    private int b;

    @Autowired
    public Nubmers(){

    }
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getSum() throws InterruptedException {
        Thread.sleep(5000);
        return a+ b;
    }

    public int getDif(){
        return a - b;
    }

    public int getMult(){
        return a * b;
    }
}
