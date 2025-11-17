package fr.univpoitiers.webapp.controller;

import fr.univpoitiers.webapp.model.Employee;
import fr.univpoitiers.webapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String home(Model model) {
        Iterable<Employee> employees = employeeService.getEmployees();
        model.addAttribute("employees", employees);
        return "home"; // ton fichier home.html dans src/main/resources/templates
    }
}
