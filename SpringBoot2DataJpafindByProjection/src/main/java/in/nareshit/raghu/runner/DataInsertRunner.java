package in.nareshit.raghu.runner;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.repo.ProductRepository;
import in.nareshit.raghu.repo.ProductRepository.MyView;

@Component
public class DataInsertRunner implements CommandLineRunner {

	 
	 @Autowired
	 private ProductRepository prepo;
	
	public void run(String... args) throws Exception {
		
	 /* erepo.saveAll(Arrays.asList(
			  new Product(101, "Pen", 200.0),
			  new Product(102, "Papper", 300.0),
			  new Product(103, "Swecth", 400.0),
			  new Product(104, "ZemotryBox",500.0),
			  new Product(105, "Pencil", 600.0),
			  new Product(106, "Rabar", 700.0),
			  new Product(107, "Scale", 800.0),
			  new Product(108, "Compas", 900.0)
			  ));*/
		
		/*List<Product>list=prepo.findByprodIdLessThan(108);
		 for(Product p:list) {
			 System.out.println(p);*/
		
		
		List<MyView>list= prepo.findByprodIdLessThan(108);
		for(MyView m:list) {
			System.out.println(m.getprodCode()+"------"+m.getprodCost());
			System.out.println(m.getClass().getName());
			
		}
		 }
			
		}
        
	


