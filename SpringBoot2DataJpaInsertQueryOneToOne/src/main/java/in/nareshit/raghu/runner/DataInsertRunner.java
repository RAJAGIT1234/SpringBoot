package in.nareshit.raghu.runner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Employee;
import in.nareshit.raghu.model.Profile;
import in.nareshit.raghu.repo.EmployeeRepository;
import in.nareshit.raghu.repo.ProfileRepository;

@Component
public class DataInsertRunner implements CommandLineRunner {

	 @Autowired
	 private ProfileRepository prepo;
	 @Autowired
	 private EmployeeRepository erepo;
	
	public void run(String... args) throws Exception {
		
		Profile p1=new Profile(10, "PER", 8.5, 12.9);
		Profile p2=new Profile(11, "PET", 5.5, 15.6);
		Profile p3=new Profile(12, "PEH", 4.0, 18.5);
	
        prepo.save(p1);
        prepo.save(p2);
        prepo.save(p3);
        
        Employee e1=new Employee(1, "RAJA", "DEV", p1);
        Employee e2=new Employee(2, "RAJU", "UI", p2);
        
        erepo.save(e1);
        erepo.save(e2);
	}

}
