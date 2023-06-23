package net.springproj.springboot.repository;

import net.springproj.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.naming.Name;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
