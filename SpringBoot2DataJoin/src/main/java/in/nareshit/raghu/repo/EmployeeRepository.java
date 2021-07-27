package in.nareshit.raghu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.nareshit.raghu.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	// @Query("SELECT e.ename,d.deptCode FROM Employee e INNER JOIN e.dob AS d")
	 @Query("SELECT e.ename,d.deptCode FROM Employee e RIGHT JOIN e.dob AS d")
	  List<Object[]> getEmpDeptInnerJoinData();
	 
	

}
