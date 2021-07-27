package in.nareshit.raghu.runner;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Employee;
import in.nareshit.raghu.repo.EmployeeRepository;




//@Component
public class DataInsertRunner implements CommandLineRunner {

	 
	 @Autowired
	 private EmployeeRepository erepo;
	
	public void run(String... args) throws Exception {
		
		erepo.saveAll(Arrays.asList(
				new Employee(10, "A", 2.2, "Lead", "Uat"),
				new Employee(11, "B", 2.3, "Mgr", "Dev"),
				new Employee(12, "C", 2.4, "Lead", "Ui"),
				new Employee(13, "D", 2.5, "Lead", "Uat"),
				new Employee(14, "E", 2.6, "Se", "Uat"),
				new Employee(15, "F", 2.7, "Lead", "Dev")));
	
		  
		  		
		 }
			
		}
        
	


