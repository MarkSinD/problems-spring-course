package ru.sinakaev.springcourse.task19.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.sinakaev.springcourse.task19.entity.Customer;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers() {
        Session session = sessionFactory.getCurrentSession();
        Query<Customer> query = session.createQuery("from Customer", Customer.class);
        List<Customer> customerList = query.getResultList();
        return customerList;
    }

    @Override
    public void saveCustomer(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(customer);
    }

    @Override
    public Customer getCustomer(int id) {
        Session session = sessionFactory.getCurrentSession();
        Customer customer = session.get(Customer.class, id);
        return customer;
    }

    @Override
    public void deleteCustomer(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query theQuery = session.createQuery("delete from Customer where id=:customerId");
        theQuery.setParameter("customerId", id);
        theQuery.executeUpdate();
    }


}
