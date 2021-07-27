package in.nareshit.Raghu.Runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import in.nareshit.Raghu.MailTemplate;
import in.nareshit.Raghu.Service.MailService;

@Component
public class MailServiceRunner implements CommandLineRunner {

	@Autowired
	private MailService ms;
	public void run(String... args) throws Exception {
		FileSystemResource file=new FileSystemResource("E:\\findBy.png");
		
		  boolean sent=ms.sendEmail("durgashakarpatra54@gmail.com",
		 
		 null,null, "Welcome to my Subject", MailTemplate.getTemplateData(
		 "Raja","Raju","Rajesh"),file);
		 	
		boolean sent=ms.sendEmail("durgashankarpatra54@gmail.com", "Welcome to m Subject", 
				MailTemplate.getTemplateData("Raja","raju", "Rajesh"));
		if(sent)
			System.out.println("MAIL SENT");
		else
			System.out.println("MAIL NOT SENT");

	}

}
