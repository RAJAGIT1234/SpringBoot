package in.nareshit.Raghu.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.Raghu.Model.Student;
import in.nareshit.Raghu.Repo.StudentRepository;

@Component
public class StudentTestRunner implements CommandLineRunner {

	 @Autowired
	 private StudentRepository repo;
	public void run(String... args) throws Exception {
		System.out.println("FROM RUNNER::");
		repo.saveStudent(new Student(12,"rama",200.0));
		repo.saveStudent(new Student(13,"laxman",300.0));
        repo.saveStudent(new Student(14,"ramesh",400.0));

        repo.getAllStudents().forEach(System.out::println);

	}

}
