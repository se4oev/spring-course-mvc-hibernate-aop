package ru.se4oev.spring.mvc_hibernate_aop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.se4oev.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import ru.se4oev.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

/**
 * Created by se4oev on 13.02.2022
 * Description:
 */
@Controller
public class MyController {

    private final EmployeeDAO employeeDAO;

    public MyController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @RequestMapping("/")
    public String showAllEmployees(Model model) {

        List<Employee> allEmployees = employeeDAO.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);

        return "all-employees";
    }

}
