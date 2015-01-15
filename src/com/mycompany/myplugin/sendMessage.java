package com.mycompany.myplugin;

import javax.mail.*; 
import javax.mail.internet.InternetAddress; 
import javax.mail.internet.MimeBodyPart; 
import javax.mail.internet.MimeMessage; 
import javax.mail.internet.MimeMultipart; 
import java.util.Date; 
import java.util.Properties; 


public class sendMessage {
	public void setup()
	{
		return;
	}
	public static int sendIt(String[] argus)
	{
		 int matchRuleSuccess = 1;
	     String to = argus[0];
		 String from = argus[1];
	     String subject = argus[2];
	     String bodyText = argus[3];
	     String mailserver = argus[4];
	     String mailport = argus[5];
	     Properties properties = new Properties();
	     properties.put("mail.smtp.host", mailserver);
	     properties.put("mail.smtp.port", mailport);
	     Session session = Session.getDefaultInstance(properties,null);
	     try {
	    	 MimeMessage message = new MimeMessage(session);
		     message.setFrom(new InternetAddress(from));
		     String[] dresses = to.split(";");
		     InternetAddress[] address = new InternetAddress[dresses.length];
		     for(int p=0; p<dresses.length; p++)
		     {
		    	 address[p] = new InternetAddress(dresses[p]);
		     }
		     message.setRecipients(Message.RecipientType.TO, address);
		     message.setSubject(subject);
		     message.setSentDate(new Date());
		     MimeBodyPart messagePart = new MimeBodyPart();
		     messagePart.setText(bodyText);
		     Multipart multipart = new MimeMultipart();
		     multipart.addBodyPart(messagePart);
		     message.setContent(multipart);
		     Transport.send(message);
		     System.out.println("Message Sent");
	     } catch (MessagingException e)
	     {
	    	 e.printStackTrace();
	    	 System.out.println("Message Not Sent");
	    	 matchRuleSuccess = 0;
	    	 return matchRuleSuccess;
	     }
		return matchRuleSuccess;
	}
}