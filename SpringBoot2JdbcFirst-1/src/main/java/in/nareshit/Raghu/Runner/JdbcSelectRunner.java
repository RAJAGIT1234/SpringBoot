package in.nareshit.Raghu.Runner;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import in.nareshit.Raghu.Mapper.BookRowMapper;
import in.nareshit.Raghu.Model.Book;

@Component
public class JdbcSelectRunner implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jt;
	public void run(String... args) throws Exception {
		String sql="SELECT * FROM BOOKS";
		RowMapper<Book>rowMapper=new BookRowMapper() ;
		List<Book>list=jt.query(sql, rowMapper);
		
		//jdk 1.5 v for each
		/*
		 * for(Book book:list) { System.out.println(book); }
		 */
		
		
		//jdk 1.2v and croser
		/*
		 * Iterator<Book> itr=list.iterator(); while(itr.hasNext()) { Book
		 * book=itr.next(); System.out.println(book); }
		 */
			
			//jdk 1.8v + Lambda Expression
			/*
			 * list.forEach(book->System.out.println(book));
			 */
			
		//jdk 1.8v for each and method reference
			
//			list.forEach(System.out::println);
		
		
				
			}
		}
		
	


