EmployeeRepo.java 

package com.assignments.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignments.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}


package com.assignments.service;

import java.util.List;
import java.util.Optional;

import com.assignments.model.Employee;

public interface EmployeeServive {

	public Employee addEmployee(Employee employee);
	public String removeEmployee(int id);
	public Optional<Employee> findEmpById(int id);
	public List<Employee> getAllEmployee();
	
	public String updateEmployee(int id, Employee updatedEmployee);
	
}
