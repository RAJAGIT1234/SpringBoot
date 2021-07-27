package in.nareshit.raghu.runner;




import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Student;
import in.nareshit.raghu.repo.StudentRepository;

//@Component
public class DataInsertRunner implements CommandLineRunner {

	@Autowired
	private StudentRepository srepo;

	@Override
	public void run(String... args) throws Exception {
		srepo.saveAll(Arrays.asList(
				new Student(10, "Raja", 300.0, "Core Java"),
				new Student(11, "Raju", 500.0, "Adv Java"),
				new Student(12, "Rajesh", 600.0, "Servlet"),
				new Student(13, "Sam", 700.0, "Jsp"),
				new Student(14, "Sara", 800.0, "Spring Boot"),
				new Student(15, "Suman", 900.0, "Dev"),
				new Student(16, "Sabha", 1000.0, "Selinium"),
				new Student(17, "Sritam", 2000.0, "Python"),
				new Student(18, "Mita", 3000.0, "Oracle"),
				new Student(19, "Sai", 4000.0, "Html")
				));
		srepo.findAll();
	}	
}
