package ru.sinakaev.springcourse.task12;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestOneToOne {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
        Session session = factory.getCurrentSession();

        try {


            session.beginTransaction();

            int theId = 4;
            Instructor instructor = session.get(Instructor.class, theId);
            InstructorDetail instructorDetail = session.get(InstructorDetail.class, theId);
            session.delete(instructorDetail);
            System.out.println("Found instructorDetail : " + instructor);

            session.getTransaction().commit();
        }
        catch (Exception exp){
            exp.printStackTrace();
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
