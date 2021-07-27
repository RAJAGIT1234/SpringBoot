package in.nareshit.Raghu.Raja;

import java.util.Map;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import in.nareshit.Raghu.Model.ProductInfo;
import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix="my.app")
public class CollectionTestRunner implements CommandLineRunner {
   
	//private List<String>details;
	private Set<String>details;
	//private String [] details;
	
	private Map<String,Integer>versions;
	private ProductInfo pob;//has a
	
	@Override
	public void run(String... args) throws Exception {
	     //System.out.println(details.getClass());
	    // System.out.println(details.getClass());
         System.out.println(this);
	}

}
