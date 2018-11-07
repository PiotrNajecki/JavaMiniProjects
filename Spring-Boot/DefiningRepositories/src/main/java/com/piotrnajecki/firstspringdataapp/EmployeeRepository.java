package com.piotrnajecki.firstspringdataapp;

import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;
import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findByFirstName(String firstName);
    List<Employee> findAllWithSalariesBetweenSomeValues(BigDecimal from, BigDecimal to);
    List<Employee> findGuyWithHighestSalary();
//    @Query(value = "select e from Employee e where e.salary = {select max(em.salary) from Employee em}" );
}
