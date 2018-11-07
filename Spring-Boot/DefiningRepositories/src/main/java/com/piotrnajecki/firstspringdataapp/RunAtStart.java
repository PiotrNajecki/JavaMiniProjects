package com.piotrnajecki.firstspringdataapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


@Component
public class RunAtStart {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public RunAtStart(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @PostConstruct
    public void runAtStart() {

        employeeRepository.findAllWithSalariesBetweenSomeValues(
                new BigDecimal("1000.0"),
                new BigDecimal("2000.0")
        );

        Employee employee = new Employee();
        employee.setFirstName("Jan");
        employee.setLastName("Nowak");
        employee.setSalary(new BigDecimal("3000.0"));
        employee.setEmploymentDate(LocalDate.of(2016, 1, 1));
        employeeRepository.save(employee);

        List<Employee> jans = employeeRepository.findByFirstName("Jan");
        Employee jan = jans.iterator().next();
        System.out.println("Jan: " + jan);

        List<Employee> allEmployees = (List<Employee>) employeeRepository.findAll();
    }
}
