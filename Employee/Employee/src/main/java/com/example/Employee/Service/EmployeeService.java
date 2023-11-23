package com.example.Employee.Service;

import java.util.List;

import com.example.Employee.Model.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    Employee addEmployee(Employee employee);

    void deleteEmployee(Long id);
}
