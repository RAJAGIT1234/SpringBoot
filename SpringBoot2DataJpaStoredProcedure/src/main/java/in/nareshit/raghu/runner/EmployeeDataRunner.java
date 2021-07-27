package in.nareshit.raghu.runner;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Employee;

@Component
public class EmployeeDataRunner implements CommandLineRunner {
	@Autowired
	private EntityManager em;
	@Override
	public void run(String... args) throws Exception {
		
		
		StoredProcedureQuery query=em.createStoredProcedureQuery("getAllEmps",Employee.class);
		List<Employee>emps = query.getResultList();
		emps.forEach(System.out::println);
	}

}
