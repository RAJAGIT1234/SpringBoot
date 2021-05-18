package in.nareshit.Raghu.Repo;

import java.util.List;

import in.nareshit.Raghu.Model.Student;

public interface StudentRepository {

	int saveStudent(Student s) ;
		
	 List<Student> getAllStudents();
	
}
