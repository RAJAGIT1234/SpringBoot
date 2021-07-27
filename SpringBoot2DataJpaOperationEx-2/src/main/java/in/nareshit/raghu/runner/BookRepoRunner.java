package in.nareshit.raghu.runner;

import java.util.Arrays;

import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Book;
import in.nareshit.raghu.model.BookRepository;

@Component

public class BookRepoRunner implements CommandLineRunner {

	@Autowired
	private BookRepository repo;
	public void run(String... args) throws Exception {
     repo.saveAll(
    		 Arrays.asList(
    new Book(101,"core java","harikrishna",300.2,"Backend"),
     new Book(102,"core java","harikrishna",300.2,"Backend"),
     new Book(103,"core java","nataraj",300.2,"frontend"),
     new Book(104,"core java","harikrishna",300.2,"frontend"),
     new Book(105,"core java","harikrishna",300.2,"Backend")));
     
    // System.out.println("DONE");
     Book b=new Book();
     b.setBoolAuthor("harikrishna");
     //b.setBookCost(300.2);
    // b.setBookType("Backend");
     //convert this into Example Object
      //Example.of(b);
	}
	
	}


