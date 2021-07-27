package in.nareshit.raghu.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Course;
import in.nareshit.raghu.model.Student;
import in.nareshit.raghu.repo.CourseRepository;
import in.nareshit.raghu.repo.StudentRepository;

@Component
public class DataInsertRunner implements CommandLineRunner {

	 @Autowired
	private CourseRepository crepo;
	 @Autowired
	private StudentRepository srepo;
	
	public void run(String... args) throws Exception {
		
		Course c1=new Course(50,"CoreJava",1000.0);
		Course c2=new Course(51,"Adv Java",2000.0);
		Course c3=new Course(52,"Spring",3000.0);
		Course c4=new Course(53,"Spring Boot",4000.0);
		
		crepo.save(c1);
		crepo.save(c2);
		crepo.save(c3);
		crepo.save(c4);
		
		Student s1=new Student(5, "RAJA", "rj@gmail.com",Set.of(c1,c2));
		Student s2=new Student(6, "RAJU","ru@gmail.com",Set.of(c2,c3));
		srepo.save(s1);
		srepo.save(s2);
		

	}

}
