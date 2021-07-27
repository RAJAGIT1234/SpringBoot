package in.nareshit.Raghu.Service;





import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
//import org.springframework.boot.autoconfigure.web.ServerProperties.Tomcat.Resource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

//import jdk.internal.loader.Resource;

@Component
public class MailService {

	 @Autowired
	private JavaMailSender sender;
	 
	 public boolean sendEmail ( 
		 String to,
		 String cc[],
		 String bcc[],
		 String subject,
		 String text,
		 Resource file
		 )
	 {
		 boolean isSent=false;
		 try {
			 
			//create new mimeMessage
			 MimeMessage message=sender.createMimeMessage();
			 
			 //use Helper class and fill details
			MimeMessageHelper helper=new MimeMessageHelper(message,file!=null);
			
			helper.setTo(to);
			if(cc!=null)
				helper.setCc(cc);
			if(bcc!=null)
				helper.setBcc(bcc);
			helper.setSubject(subject);
			helper.setText(text,true);
			
			
			if(file!=null) {
				helper.addAttachment(file.getFilename(), file);
			}
			//send message
			sender.send(message);
			 isSent=true;
		 }catch (Exception e) {
			 isSent=false;
		 e.printStackTrace();
		
		 } 
		 return isSent;
	 }
	 public boolean sendEmail(
			 String to,
			 String subject,
			 String text)
	 {
		 return sendEmail(to,null,null,subject,text,null); 
	 }
			 
}
