
package com.assignments.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignments.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
