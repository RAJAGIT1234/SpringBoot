package in.nareshit.Raghu.Repo.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import in.nareshit.Raghu.Model.Student;
import in.nareshit.Raghu.Repo.StudentRepository;

@Component
public class StudentRepositoryImpl implements StudentRepository {
  
	@Autowired
	 private JdbcTemplate jt;

	
	public int saveStudent(Student s) {
		String sql="INSERT INTO STUDENT VALUES(?,?,?)";
         int count= jt.update(sql,s.getStdId(),s.getStdName(),s.getStdFee());
				return count;
	}


	
	public List<Student> getAllStudents() {
		String sql="SELECT * FROM STUDENT";
		List<Student>list=jt.query(sql,
				(rs,count)->new Student(rs.getInt("SID"),
						 rs.getString("SNAME"),
						 rs.getDouble("SFEE")));
		return list;
	}
}
