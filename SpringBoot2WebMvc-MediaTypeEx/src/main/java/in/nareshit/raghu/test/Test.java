package in.nareshit.raghu.test;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.nareshit.raghu.model.Employee;

public class Test {
	
	 public static void main(String[] args) { try {
	 
		 String json= "{\"eno\":101,\"ename\":\"Raja\",\"esal\":10001.2}";
	     ObjectMapper om=new ObjectMapper();
	     Employee emp=om.readValue(json, Employee.class);
	     System.out.println(emp);
	 } catch (Exception e) { e.printStackTrace(); } }
	 

	public static void main1(String[] args) {
			
	try {
		
			//Object json format
			 Employee emp=new Employee(10,"Raja",101.2);
			 //Object Mapper
			 ObjectMapper ob=new ObjectMapper();
			 //call write method
			 String json = ob.writeValueAsString(emp);
		     //print json
			 System.out.println(json);
	} catch(Exception e){
		e.printStackTrace();
	}
	
}}


