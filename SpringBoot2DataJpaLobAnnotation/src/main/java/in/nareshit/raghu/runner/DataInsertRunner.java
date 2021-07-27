package in.nareshit.raghu.runner;


import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Product;
import in.nareshit.raghu.repo.ProductRepository;


@Component
public class DataInsertRunner implements CommandLineRunner {

	 
	 @Autowired
	 private ProductRepository prepo;
	
	public void run(String... args) throws Exception {
		
	//Loading file data
		FileInputStream fis=new FileInputStream ("E:\\download.png");
		byte [] prodImg=new byte[fis.available()];
		  fis.read(prodImg);
		  String description="The relationship between Google and Wikipedia was originally collaborative in Wikipedia's early days, when Google helped reduce the pagerank of widespread uneditable Wikipedia clones that were simply ad farms. In 2007, Google introduced Knol, a direct competitor for community-driven encyclopedia creation. Wikipedia";
		  char[] prodDesc=description.toCharArray();
		  prepo.save(new Product(101,"Book",500.0,prodImg,prodDesc));
		  		
		 }
			
		}
        
	


