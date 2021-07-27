package in.nareshit.raghu.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Student;
import in.nareshit.raghu.repo.StudentRepo;

@Component
public class TestStudentPageAndSortTwo implements CommandLineRunner {

	@Autowired
	 private StudentRepo repo;
	public void run(String... args) throws Exception {
    repo.save(new Student(101,"Raja",1000.0));
    repo.save(new Student(102,"Raju",2000.0));
    repo.save(new Student(103,"Durga",3000.0));
    repo.save(new Student(104,"Shankar",4000.0));
    repo.save(new Student(105,"MunnaBhai",2000.0));
    
    repo.save(new Student(106,"ABC",598.0));
    repo.save(new Student(107,"XYZ",238.0));
    repo.save(new Student(108,"PQR",897.0));
    repo.save(new Student(109,"XCB",897.0));
    repo.save(new Student(110,"MJJ",897.0));

    //input (pageable)=number,size
    Pageable pageable=PageRequest.of(2,5);
     //Execute query
    Page<Student> page=repo.findAll(pageable);
 //print output
     List<Student>data=page.getContent();
     System.out.println(data);
     
     //meta data
     System.out.println("Is First Page"+page.isFirst());
     System.out.println("Is Last Page"+page.isLast());
     System.out.println("Next Page"+page.hasNext());
     System.out.println("Previous Page"+page.hasPrevious());
     System.out.println("Total Page"+page.getTotalPages());
     System.out.println("Current Number"+page.getNumber());
     System.out.println("Total Size"+page.getSize());
	}}