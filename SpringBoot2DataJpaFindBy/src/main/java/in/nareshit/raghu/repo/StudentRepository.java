package in.nareshit.raghu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {


	//SQL SELECT * FROM stdtab WHERE SCOURSE=:COURSE
	List<Student>findBystdCourse(String course);
	// SQL SELECT * FROM stdtab WHERE SCOURSE=:COURSE
	List<Student>findBystdFee(Double fee);
	// SQL SELECT * FROM stdtab WHERE stdId>=:sid
	List<Student>findBystdIdGreaterThanEqual(Integer sid);
	// SQL SELECT * FROM stdtab WHERE stdfee>:?
	List<Student>findBystdFeeGreaterThan(Double stdFee);
	// SQL SELECT * FROM stdtab WHERE stdId between x and y
	   List<Student>findByStdIdBetween(Integer sid1,Integer sid2);
	   // SQL SELECT * FROM stdtab WHERE stdName NotNull;
	   List<Student>findByStdNameNotNull();
	   // SQL SELECT * FROM Student Where stdName like?
	   List<Student>findByStdNameLike(String input);
	   // SQL SELECT * FROM Student Where stdName notLike?
	   List<Student>findByStdNameNotLike(String input);
	   // SQL SELECT * FROM stdtab Where sid=?order by sname
	   List<Student>findBystdIdNotOrderByStdName(Integer id);
	   // SQL SELECT * FROM stdtab Where sid in(...)
	   List<Student>findBystdIdIn(List<Integer>ids);
	   // SQL SELECT * FROM stdtab Where sid =? or sname=?
	  List<Student>findBystdIdOrStdName(Integer sid,String sname);
	   // SQL SELECT * FROM stdtab Where sid >?and sname like?
	    List<Student>findBystdIdGreaterThanAndStdNameLike(Integer sid,String pattern);
	 // SQL SELECT * FROM stdtab Where sid >?and sname like?
	    List<Student>findBystdIdGreaterThanAndStdNameNotLike(Integer sid,String pattern);
	 // SQL SELECT * FROM stdtab Where stdName Like %?%
	    List<Student>findByStdNameContaining(String pattern);
	    List<Student>findByStdNameStartingWith(String pattern);
	    List<Student>findByStdNameEndingWith(String pattern);
	   
	
	 
    


}
