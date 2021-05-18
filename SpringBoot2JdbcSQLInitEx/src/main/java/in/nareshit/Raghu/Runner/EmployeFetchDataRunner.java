package in.nareshit.Raghu.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import in.nareshit.Raghu.Model.Employee;

@Component
public class EmployeFetchDataRunner implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jt;
	public void run(String... args) throws Exception {

		 System.out.println("Employee Data Table:");
		 
		 String sql="SELECT * FROM EMPLOYEE";
		 jt.query(sql,
				 (rs,count)-> new Employee(
						   rs.getInt("eid"),
						   rs.getString("ename"),
						   rs.getDouble("esal")
						   )
						 ).forEach(System.out::println);
		  
						
					}
		  
	}


