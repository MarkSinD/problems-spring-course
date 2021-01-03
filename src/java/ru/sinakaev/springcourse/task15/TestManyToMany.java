package ru.sinakaev.springcourse.task15;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestManyToMany {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("WEB-INF/hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Review.class)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        int index = 3;
        try{
            session.beginTransaction();

            Instructor instructor = session.get(Instructor.class, index);
            session.delete(instructor);

            session.getTransaction().commit();
        }finally {
            session.close();
            sessionFactory.close();
        }
    }
}
