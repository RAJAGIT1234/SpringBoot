package in.nareshit.raghu.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.repo.EmployeeRepository;

@Component
public class TestTwoRunner implements CommandLineRunner {
	@Autowired
private EmployeeRepository repo;
	
	public void run(String... args) throws Exception {
     /* repo.getEmpsByIdIn(Arrays.asList(101,102,103,120)).
      forEach(System.out::println);*/
      
     // repo.getEmpByIdBetween(101, 105).forEach(System.out::println);
     
	//repo.getAllEmpsBySql().forEach(System.out::println);
	//repo.getAllEmployeeBySql2().forEach(System.out::println);
		
		//int count=repo.updateEmployeeNameByEmpSal("NEW_C_Name", 4.4);
		             int count=repo.DeleteEmloyeeNameBySal(5.0);
		             System.out.println(count);


	}

}
