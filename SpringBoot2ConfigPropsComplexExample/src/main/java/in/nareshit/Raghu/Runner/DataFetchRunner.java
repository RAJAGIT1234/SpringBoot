package in.nareshit.Raghu.Runner;

import java.util.Map;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


import in.nareshit.Raghu.model.Employee;
import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix="data.app")
public class DataFetchRunner implements CommandLineRunner {
 
	private Employee emp;

	/*
	 * private Address adrss; private Map<String,Double>modules; private
	 * Set<String>projs;
	 */
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}

}
