
package com.assignments.serviceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignments.model.Employee;
import com.assignments.repository.EmployeeRepo;
import com.assignments.service.EmployeeServive;

@Service
public class EmployeeServiceImpl implements EmployeeServive{

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Override
	public Employee addEmployee(Employee employee) {
		Employee emp = employeeRepo.save(employee);
		return emp;
		
	}

	@Override
	public String removeEmployee(int id) {
		employeeRepo.deleteById(id);
		return "Deleted Data Successfully";
	}

	@Override
	public Optional<Employee> findEmpById(int id) {
		Optional<Employee> emp = employeeRepo.findById(id);
		
		if(emp.isPresent()) {
		return emp;
		}
		else {
			return null;
		}
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> empList = employeeRepo.findAll();
		return empList;
	}

	@Override
public String updateEmployee(int id, Employee updatedEmployee) {
    Optional<Employee> emp = employeeRepo.findById(id);
    if (emp.isPresent()) {
        Employee existingEmployee = emp.get();
        existingEmployee.setName(updatedEmployee.getName());
        existingEmployee.setAge(updatedEmployee.getAge());
        existingEmployee.setState(updatedEmployee.getState());
        existingEmployee.setType(updatedEmployee.getType());
        existingEmployee.setSalary(updatedEmployee.getSalary());
        employeeRepo.save(existingEmployee);
        return "Employee updated successfully";
    } else {
        return "Employee not found";
    }
}

	
}
