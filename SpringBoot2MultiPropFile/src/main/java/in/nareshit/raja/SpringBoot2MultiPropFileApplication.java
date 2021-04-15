package in.nareshit.raja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({"classpath:abcd.properties",
		        "classpath:mno.properties",
		        "classpath:xyz.properties",
		        "classpath:application.properties",
})
               
public class SpringBoot2MultiPropFileApplication {

	public static void main(String[] args) {
	ApplicationContext ac=SpringApplication.run(SpringBoot2MultiPropFileApplication.class, args);
//get read,bean-object(ObjectName,ClassType)
	ProductInfo pob=ac.getBean("pi",ProductInfo.class);
	System.out.println(pob);
	}

}
