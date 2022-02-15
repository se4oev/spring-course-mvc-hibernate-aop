package ru.se4oev.spring.mvc_hibernate_aop.service;

import ru.se4oev.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

/**
 * Created by se4oev on 13.02.2022
 * Description:
 */
public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);

}
