package in.nareshit.raghu.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Student;
import in.nareshit.raghu.repo.StudentRepo;

//@Component
public class TestStudentPageAndSort implements CommandLineRunner {

	@Autowired
	 private StudentRepo repo;
	public void run(String... args) throws Exception {
    repo.save(new Student(101,"Raja",1000.0));
    repo.save(new Student(102,"Raju",2000.0));
    repo.save(new Student(103,"Durga",3000.0));
    repo.save(new Student(104,"Shankar",4000.0));
    repo.save(new Student(104,"MunnaBhai",2000.0));

    System.out.println("##################################");
    repo.saveAll(
    		List.of(new Student(105,"ABC",598.0),
    				new Student(106,"XYZ",238.0),
    				new Student(107,"PQR",897.0)));
    
    repo.findAll().forEach(System.out::println);
    System.out.println("******************************");
   // Sort s1=Sort.by("stdName");
    //Sort s1=Sort.by(Direction.ASC,"stdName");
    Sort s1=Sort.by(Order.asc("stdName"),Order.desc("stdfee"));
    repo.findAll(s1).forEach(System.out::println);
	}}