package in.nareshit.raghu.runner;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Employee;
import in.nareshit.raghu.repo.EmployeeRepository;

@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
    private EmployeeRepository repo;
	public void run(String... args) throws Exception {
		repo.save(new Employee(10,"AA",102.2,
				 Set.of("P1","P2","P3"),
				 List.of("M1","M2"),
				 Map.of("C1","NIT","C2","OPCL")));
		System.out.println("DONE");
	}

}
