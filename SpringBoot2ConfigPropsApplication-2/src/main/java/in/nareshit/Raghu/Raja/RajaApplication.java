package in.nareshit.Raghu.Raja;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
@ConfigurationProperties(prefix="my.app")
public class RajaApplication implements CommandLineRunner {
	private Integer sno;
	  private String sname;
	  private String sadd;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(this);
	}

}
