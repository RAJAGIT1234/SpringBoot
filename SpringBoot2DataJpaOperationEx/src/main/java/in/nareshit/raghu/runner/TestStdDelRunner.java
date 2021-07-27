package in.nareshit.raghu.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Student;
import in.nareshit.raghu.repo.StudentRepo;

//@Component
public class TestStdDelRunner implements CommandLineRunner {

	
	@Autowired
	private StudentRepo repo;
	public void run(String... args) throws Exception {

		repo.save(new Student(101,"Raja",1000.0));
	    repo.save(new Student(102,"Raju",2000.0));
	    repo.save(new Student(103,"Durga",3000.0));
	    repo.save(new Student(104,"Shankar",4000.0));
	    repo.save(new Student(104,"MunnaBhai",2000.0));
	    
	    System.out.println("-------------BEFORE DELETE-------------------");
	    repo.findAll().forEach(System.out::println);
	    
	   // repo.deleteById(101);
		/*
		 * Student s=new Student(); s.setStdId(103); repo.delete(s);
		 */
	    //delete record one by one
	    repo.deleteAll(Arrays.asList(new Student(101),
	    		                      new Student(102),
	    		                      new Student(103)));
	    //delete all record
	    repo.deleteAll();
	    System.out.println("-------------AFTER DELETE-------------------");
	    repo.findAll().forEach(System.out::println);
	    
	    
	    
	}

}
