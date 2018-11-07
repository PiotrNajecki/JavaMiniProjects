package com.piotrnajecki.firstspringdataapp;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    Iterable<Employee> findByFirstName(String firstName);
}
