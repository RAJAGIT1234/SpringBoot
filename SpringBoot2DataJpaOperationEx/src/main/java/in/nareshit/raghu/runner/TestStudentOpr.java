package in.nareshit.raghu.runner;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Student;
import in.nareshit.raghu.repo.StudentRepo;

//@Component
public class TestStudentOpr implements CommandLineRunner {

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
    
    Iterable<Student>all=repo.findAll();
    all.forEach(System.out::println);
    System.out.println("--------------------------------");
    
    Optional<Student>opt=repo.findById(106);
    if(opt.isPresent()) {
    	Student s=opt.get();
    	System.out.println("Data Found:=>"+s);
    }else {
    	System.out.println("No Data Found");

    }
    System.out.println("====================================");
    
    Iterable<Student>list=repo.findAllById(Arrays.asList(101,102,103,105));
    Iterator<Student>itr=list.iterator();
    while (itr.hasNext()) {
		Student s= itr.next();
		System.out.println(s);
		
	}
    
    System.out.println("**************************************************");
    System.out.println("Total rows"+repo.count());
    System.out.println("DONE");

	}

}
