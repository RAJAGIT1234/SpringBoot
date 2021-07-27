package in.nareshit.Raghu;

import java.io.FileInputStream;

public class MailTemplate {
   
	private static String template=null;
	static {

		try {
			FileInputStream fis = new FileInputStream(" F:\\durganote.txt") {
				byte[] bytes=new byte[fis.available()];
				  fis.read(bytes);
				  template=new String(bytes);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static String getTemplate() {
		return template;
	}
	public static String getTemplateData(
			   String user,String fn,String ln) {
		
		String template=getTemplate();
		template=template.replace("{{user}}", user)
		.replace("{{firstname}}", fn)
		.replace("{{lastname}}", ln)
		.replace("{{date}}", new java.util.Date().toString());
		return template;
		//System.out.println(template);



		
	}
}
