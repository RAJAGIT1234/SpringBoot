package in.nareshit.raghu.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Dept;
import in.nareshit.raghu.model.Employee;

@Component
public class DataInsertRunner implements CommandLineRunner {

	@Autowired
	private DeptRepository drpo;
	@Autowired
	private EmployeeRepository erepo;
	
	public void run(String... args) throws Exception {
		
		Dept d1=new Dept(10, "DEV", "RAJA");
		drpo.save(d1);
		Employee e1=new Employee(1, "A", 2.2, d1);
		Employee e2=new Employee(2, "B", 3.3,d1);
		Employee e3=new Employee(3, "C",4.4, d1);
		Employee e4=new Employee(4, "D", 5.5, d1);

		erepo.save(e1);
		erepo.save(e2);
		erepo.save(e3);
		erepo.save(e4);
	}

}
