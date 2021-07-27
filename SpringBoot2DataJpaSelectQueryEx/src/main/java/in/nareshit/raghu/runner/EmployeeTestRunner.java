package in.nareshit.raghu.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Employee;
import in.nareshit.raghu.repo.EmployeeRepository;

//@Component
public class EmployeeTestRunner implements CommandLineRunner {

	@Autowired
	EmployeeRepository repo;
	public void run(String... args) throws Exception {
		repo.save(new Employee(101,"A",2.2));
		repo.save(new Employee(102,"B",3.3));
		repo.save(new Employee(103,"C",4.4));
		repo.save(new Employee(104,"D",5.5));
		repo.save(new Employee(105,"E",6.5));
		repo.save(new Employee(106,"F",7.5));
		
		/*System.out.println(repo.getEmpById(101));
		System.out.println(repo.getEmpByIdAndEmpNameOrSal(102, "B", 3.3));
		System.out.println(repo.getEmpNameByName("C"));
		System.out.println(Arrays.asList((Object[]) repo.getEmpNameAndSalsBySal(5.5)));*/
		
		
		/*
		 * repo.getAllEmps().forEach(System.out::println);
		 * System.out.println("-----------------------");
		 * repo.getEmpNames().forEach(System.out::println);
		 * System.out.println("**************************"); List<Object[]>
		 * list=repo.getEmpNameAndSals(); for(Object ob:list) {
		 * 
		 * }
		 */
		 
		
		
		
		
					}
	
}
