package com.sarac.controller;
import com.sarac.bootstrap.DataGenerator;
import com.sarac.model.Employee;
import com.sarac.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/employee")
public class employeeController {

    private final EmployeeService employeeService;

    public employeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/register")
    public String createEmployee(Model model) {


        model.addAttribute("employee", new Employee());
        model.addAttribute("stateList", DataGenerator.getAllStates());
        return "employee/employee-register";
    }

    @PostMapping("/insert")
    public String insertEmployee(@ModelAttribute("employee") Employee employee) {

        employeeService.saveEmployee(employee);
        return "redirect:/employee/list";//With redirect we are using end point

    }

    @GetMapping("/list")
    public String listEmployees(Model model) {
        model.addAttribute("employeeList", employeeService.readAllEmployees());
        return "employee/employee-list"; //Without redirect we are using html files
    }
}
