package ru.se4oev.spring.mvc_hibernate_aop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import ru.se4oev.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

/**
 * Created by se4oev on 13.02.2022
 * Description:
 */
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    private final SessionFactory sessionFactory;

    public EmployeeDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();

        Query<Employee> query = session.createQuery("FROM Employee ", Employee.class);

        return query.getResultList();
    }

    @Override
    public void saveEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();

        return session.get(Employee.class, id);
    }
}
