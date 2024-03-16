package com.example.operation.service;

import com.example.operation.entity.Employee;
import com.example.operation.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo emp;
    public Employee saveEmployee(Employee employee){
        return emp.save(employee);
    }
    public List<Employee> saveEmployee(List<Employee> employees){
        return emp.saveAll(employees);
    }

    public List<Employee> getEmployee()
    {
        return emp.findAll();
    }

    // to fetch a particular product list in the database
    public Employee getEmployeeById(int id)
    {
        return emp.findById(id).orElse(null);
    }

    // to fetch a particular product list in the database
    public Employee getEmployeeByName(String name)
    {
        return emp.findByName(name);
    }
    public String deleteEmployee(int id)
    {
        emp.deleteById(id);
        return "Employee is removed successfully !!!! " +id;
    }

    public Employee updateEmployee(Employee employee)
    {
        Employee existingEmployee = emp.findById(employee.getId()).orElse(null);
        existingEmployee.setName(employee.getName());
        existingEmployee.setSalary(employee.getSalary());
        return emp.save(existingEmployee);
    }

}
