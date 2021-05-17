package in.nareshit.Raghu.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.nareshit.Raghu.Model.Book;

public class BookRowMapper implements RowMapper<Book>{

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		//READ FROM RS AND SET TO OBJECT
		/*
		 * Book book=new Book(); book.setBookid(rs.getInt("bid"));
		 * book.setBookname(rs.getString("bname"));
		 * book.setBookcost(rs.getDouble("bcost")); return book;
		 */
		
		Book book=new Book(rs.getInt("bid"),
				           rs.getString("bname"),
				           rs.getDouble("bcost"));
		  return book;
	}

}
