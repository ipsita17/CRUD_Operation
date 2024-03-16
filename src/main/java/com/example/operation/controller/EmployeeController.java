package com.example.operation.controller;

import com.example.operation.entity.Employee;
import com.example.operation.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee)
    {
        return service.saveEmployee(employee);
    }

    @PostMapping("/addEmployees")
    public List<Employee> addEmployees(@RequestBody List<Employee> employees)
    {
        return service.saveEmployee(employees);
    }

    @GetMapping("/employees")
    public List<Employee> findAllEmployee()
    {
        return service.getEmployee();
    }

    // any input if we want to pass as part of a request url then we should go for @Path variable annotations.

    @GetMapping("/EmployeeById/{id}")
    public Employee findEmployeeById (@PathVariable int id)
    {
        return service.getEmployeeById(id);
    }
    @GetMapping("/Employee/{name}")
    public Employee findEmployeeByName(@PathVariable String name)
    {
        return service.getEmployeeByName(name);
    }

    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee)
    {
        return service.updateEmployee(employee);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id)
    {
        return service.deleteEmployee(id);
    }
}
