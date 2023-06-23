package net.springproj.springboot.controller;

import net.springproj.springboot.exception.ResourceNotFoundException;
import net.springproj.springboot.model.Employee;
import net.springproj.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    //create employee REST api
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    //get employee by Id REST api
    @GetMapping("{Id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long Id){
        Employee employee = employeeRepository.findById(Id).orElseThrow(()-> new ResourceNotFoundException("Employee Does not exist with id:" + Id) );
        return ResponseEntity.ok(employee);
    }

    //update employee REST api
    @PutMapping("{Id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable long Id, @RequestBody Employee employeeDetails){
        Employee employee = employeeRepository.findById(Id).orElseThrow(()-> new ResourceNotFoundException("Employee Does not exist with id:" + Id) );
        employee.setFirstName(employeeDetails.getFirstName());
        employee.setLastName(employeeDetails.getLastName());
        employee.setEmailId(employeeDetails.getEmailId());
        employeeRepository.save(employee);
        return ResponseEntity.ok(employee);
    }

    //delete employee REST api
    @DeleteMapping("{Id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long Id){
        Employee employee = employeeRepository.findById(Id).orElseThrow(()-> new ResourceNotFoundException("Employee Does not exist with id:" + Id) );
        employeeRepository.delete(employee);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}
