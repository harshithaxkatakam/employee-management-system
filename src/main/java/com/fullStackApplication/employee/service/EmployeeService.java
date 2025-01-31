package com.fullStackApplication.employee.service;

import com.fullStackApplication.employee.entity.Employee;
import com.fullStackApplication.employee.repository.EmployeeRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    public Employee postEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public void deleteEmployee(Long id) {
        if(!employeeRepository.existsById(id)) {
            throw new EntityNotFoundException("Employee with id " + id + " not found");
        }
        employeeRepository.deleteById(id);
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee updateEmployee(Long id, Employee employee) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        if(employeeOptional.isPresent()) {
            Employee employeeToUpdate = employeeOptional.get();
            employeeToUpdate.setName(employee.getName());
            employeeToUpdate.setEmail(employee.getEmail());
            employeeToUpdate.setPhone(employee.getPhone());
            employeeToUpdate.setDepartment(employee.getDepartment());
            return employeeRepository.save(employeeToUpdate);
        }
        return null;
    }
}
