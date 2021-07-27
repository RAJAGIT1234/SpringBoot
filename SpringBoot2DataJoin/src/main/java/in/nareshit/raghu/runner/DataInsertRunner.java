package in.nareshit.raghu.runner;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Dept;
import in.nareshit.raghu.model.Employee;
import in.nareshit.raghu.repo.DeptRepository;
import in.nareshit.raghu.repo.EmployeeRepository;

//@Component
public class DataInsertRunner implements CommandLineRunner {

	 @Autowired
	 private EmployeeRepository erepo;
	@Autowired
	private DeptRepository drepo;
	public void run(String... args) throws Exception {
		
		
		Dept d1=new Dept(10,"DEV", "SANJAY");
		Dept d2=new Dept(11,"QA", "RAJA");
		Dept d3=new Dept(12,"UI", "RAJESH");
		
	       
        drepo.save(d1);
        drepo.save(d2);
        drepo.save(d3);
       
		
		  Employee e1=new Employee(1, "A", 2.2, null); 
		  Employee e2=new Employee(2, "B", 3.3, d1);
		  Employee e3=new Employee(3, "C", 4.4, d3);
		 
		  
		  erepo.save(e1);
		  erepo.save(e2);
		  erepo.save(e3);
		  
		 
        
        
		
		
		}
        
        
	}


