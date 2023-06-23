package net.springproj.springboot;

import net.springproj.springboot.model.Employee;
import net.springproj.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("John");
//		employee.setLastName("Doe");
//		employee.setEmailId("johndoe@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Tony");
//		employee1.setLastName("Stark");
//		employee1.setEmailId("tonystark@gmail.com");
//		employeeRepository.save(employee1);
	}
}
