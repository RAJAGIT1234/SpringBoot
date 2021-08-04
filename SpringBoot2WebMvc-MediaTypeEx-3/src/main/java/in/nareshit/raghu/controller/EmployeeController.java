package in.nareshit.raghu.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nareshit.raghu.model.Employee;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@PostMapping("/save")
	public ResponseEntity<String>saveEmployee(
			@RequestBody Employee employee){
		System.out.println("REQ BODY#POST CALLED");
		return new ResponseEntity<String>(
				employee.toString(),HttpStatus.OK);
	}
	
	@GetMapping("/one")
	public ResponseEntity<Employee>getOneEmployee(){
		Employee emp=new Employee(9999,"Raja",1000.0);
		ResponseEntity<Employee>resp=new ResponseEntity<Employee>(emp,HttpStatus.OK);
		return resp;
		
	}	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>>getAllEmps(){
		List<Employee>emps=Arrays.asList(
				new Employee(101,"Raju",1200.0),
				new Employee(102,"Lushi",1300.0)
				);
		ResponseEntity<List<Employee>>resp=new ResponseEntity<List<Employee>>(emps,HttpStatus.OK);
		return resp;
	}
	
	@GetMapping("/map")
	public ResponseEntity<Map<String,Employee>>getAllEmployeesMap(){
		Map<String,Employee>emps=Map.of(
				"OB1",new Employee(10,"AA",1000.0),
				"OB2",new Employee(11,"BB",2000.0),
				"OB3",new Employee(12,"CC",3000.0));
		ResponseEntity<Map<String,Employee>>resp=
				new ResponseEntity<Map<String,Employee>>(emps,HttpStatus.OK);
		return resp;
	}
	
	
	
	
	
	
	
	
	
}
