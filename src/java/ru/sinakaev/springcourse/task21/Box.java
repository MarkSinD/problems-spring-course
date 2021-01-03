package ru.sinakaev.springcourse.task21;


import org.springframework.stereotype.Component;

@Component
public class Box {

    private  Pen pen1;
    private  Pen pen2;
    private String string;

    public Pen getPen1() {
        return pen1;
    }

    public void setPen1(Pen pen) {
        this.pen1 = pen;
    }

    public Pen getPen2() {
        return pen2;
    }

    public void setPen2(Pen pen2) {
        this.pen2 = pen2;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
