package in.nareshit.Raghu.model;

import java.util.Map;
import java.util.Set;

import lombok.Data;

@Data
public class Employee {
 private Integer eno;
 private String ename;
 private Double esal;
 
 
	
	 private Set<String>projs; 
	 private Map<String,Double>modules; 
	 private Address
	 adrss;
	 
}
