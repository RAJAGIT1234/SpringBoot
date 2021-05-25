package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Employee;
import in.nareshit.raghu.repo.EmployeeRepository;

@Component
public class TestEmployeeRunner implements CommandLineRunner {

	@Autowired
   private EmployeeRepository repo;	
	public void run(String... args) throws Exception {
    repo.save(new Employee(106,"rajesh",1006.99));
    //repo.save(new Employee(107,"ram",10006.99));
	}

}
