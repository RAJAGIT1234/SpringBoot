package in.nareshit.raghu.runner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Dept;
import in.nareshit.raghu.model.Employee;
import in.nareshit.raghu.repo.DeptRepository;
import in.nareshit.raghu.repo.EmployeeRepository;

@Component
public class DataInsertRunner implements CommandLineRunner {

	 @Autowired
	 private DeptRepository drepo;
	 @Autowired
	 private EmployeeRepository erepo;
	
	public void run(String... args) throws Exception {
		
		Dept d1=new Dept(10,"DEV", "SANJAY");
	
       
        drepo.save(d1);
		
		  Employee e1=new Employee(1, "RAJA", "DEV", d1); 
		  Employee e2=new Employee(2, "RAJU", "UI", d1);
		  Employee e3=new Employee(2, "RAJWSH", "JAVA", d1);
		  
		  erepo.save(e1);
		  erepo.save(e2);
		  erepo.save(e3);
		  
		 
        
        
	}

}
