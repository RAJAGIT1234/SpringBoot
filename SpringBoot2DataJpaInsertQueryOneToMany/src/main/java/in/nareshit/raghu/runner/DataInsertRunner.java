package in.nareshit.raghu.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Model;
import in.nareshit.raghu.model.Product;
import in.nareshit.raghu.repo.ModelRepository;
import in.nareshit.raghu.repo.ProductRepository;

@Component
public class DataInsertRunner implements CommandLineRunner {

	@Autowired
	private ModelRepository mrepo;
	@Autowired
	private ProductRepository prepo;
	public void run(String... args) throws Exception {

		Model m1=new Model(105, "M12", "RED",5200.0);
		Model m2=new Model(106, "M13", "GREEN",6200.0);
		Model m3=new Model(107, "M14", "BLUE",7200.0);
		
		mrepo.save(m1);
		mrepo.save(m2);
		mrepo.save(m3);
		Product p1=new Product(10, "S-MOBILE","SANJAY",Set.of(m1,m2,m3));
        prepo.save(p1);
	}

}
