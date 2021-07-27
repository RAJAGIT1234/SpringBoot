package in.nareshit.raghu.repol;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.nareshit.raghu.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	
}
