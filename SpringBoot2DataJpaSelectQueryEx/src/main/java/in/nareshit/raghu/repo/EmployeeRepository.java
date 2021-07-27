package in.nareshit.raghu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import in.nareshit.raghu.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	//Multiple row data
	@Query("SELECT e FROM Employee e") List<Employee>getAllEmps();

	@Query("SELECT e.empName FROM Employee e") List<String>getEmpNames();

	@Query("SELECT e.empName,e.empSal FROM Employee e")
	List<Object[]>getEmpNameAndSals();


	/*One row Data
	@Query("SELECT e FROM Employee e WHERE e.empId=101")
	Employee getEmpById();

	@Query("SELECT e.empName FROM Employee e WHERE e.empId=101")
	String getEmpNameById();

	@Query("SELECT e.empName,e.empSal FROM Employee e WHERE e.empId=101")
	Object getEmpNameAndEmpSalsById();


	//Postional Parameter Data
	@Query("SELECT e FROM Employee e WHERE e.empId=?1")
	Employee getEmpById(Integer id);

	@Query("SELECT e FROM Employee e WHERE e.empId=?1 and e.empName=?2 or e.empSal=?3")
	Employee getEmpByIdAndEmpByNameOrSal(Integer id,String name,Double sal);

	@Query("SELECT e.empName FROM Employee e WHERE e.empName=?1")
	String getEmpNameByName(String name);

	@Query("SELECT e.empName,e.empSal FROM Employee e WHERE e.empSal=?1")
	Object getEmpNameAndSalBySal(Double esal);*/


	//Named Parameter

	/*@Query("SELECT e FROM Employee e WHERE e.empId=:eid")
	Employee getEmpById(Integer eid);

	@Query("SELECT e FROM Employee e WHERE e.empId=:eid and e.empName=:empName or e.empSal=:empSal")
	Employee getEmpByIdAndEmpNameOrSal(Integer eid,String empName,Double empSal);

	@Query("SELECT e.empName FROM Employee e WHERE e.empName=:empName")
	String getEmpNameByName(String empName);

	@Query("SELECT e.empName,e.empSal FROM Employee e WHERE e.empSal=:eSal")
	Object getEmpNameAndSalsBySal(Double eSal);*/


	//---------------In Operator-----------------------
	@Query("SELECT e FROM Employee e WHERE e.empId in(:data)")
	List<Employee>getEmpsByIdIn(List<Integer>data);
	//--------------Between Operator-----------------
	@Query("SELECT e FROM Employee e WHERE e.empId between:start and :end")
	List<Employee> getEmpByIdBetween(Integer start,Integer end);

	//------------Native Sql-------------------
	@Query(value="SELECT ename FROM emp_tab",nativeQuery = true)
	List<String>getAllEmpsBySql();

	@Query(value="SELECT * FROM emp_tab",nativeQuery = true)
	List<Employee> getAllEmployeeBySql2();
	//-------------update operation----------------
	/*@Transactional
	@Modifying
	@Query("UPDATE Employee SET empName=:a WHERE empSal=:b")
	              Integer updateEmployeeNameByEmpSal(String a,Double b);*/
	
	//--------------Delete Operation-----------------
	
	@Transactional
	@Modifying
	@Query("DELETE FROM Employee WHERE empSal>=:b")
	             Integer DeleteEmloyeeNameBySal(Double b);


}
