package in.nareshit.raghu.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.repo.EmployeeRepository;

@Component
public class TestRunner2 implements CommandLineRunner {

	@Autowired
	private EmployeeRepository erepo;
	public void run(String... args) throws Exception {
		
		
		
		List <Object[]> list = erepo.getEmpDeptInnerJoinData();
		for(Object [] ob:list) {
			System.out.println(ob[0]+"------"+ob[1]);
			

	}

	}}
