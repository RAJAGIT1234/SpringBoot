package in.nareshit.Raghu.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
 //@Component
public class JdbcTestRunner implements CommandLineRunner {
      @Autowired
	  private JdbcTemplate jt;
      
	public void run(String... args) throws Exception {
		
   //System.out.println(jt.getClass().getName());
		//insert operation
		//String sql="INSERT INTO BOOKS VALUES(?,?,?)";
		String sql="UPDATE BOOKS SET BNAME=?,BCOST=? WHERE BID=?";
		//Execute and get result
		int count=jt.update(sql, "Spring",4000,11);
		
		//print result
		System.out.println("NO OF ROWS INSERTED"+ count);
	}

}
