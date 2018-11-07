import java.net.PasswordAuthentication;
import java.util.Properties;

import javax.websocket.Session;
import javax.mail.internet.MimeMessage; 

public class Mailer {
	public static void send(String to, String subject, String msg) {
		
		final String user="piotrek3000@gmail.com";
		final String pass="wristman3";
		
		// (1st step) Get the session object
		
		Properties props = new Properties();
		props.put("mail.smtp.host", "mail.javatpoint.com");
		props.put("mail.smtp.auth", "true");
		
		Session session = Session.getDefaultInstance(props, 
				new javax.mailAuthentication() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(user, pass);
					}
			
			
		});
		
		// 2nd step compose message
		
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipent(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject(subject);
			message.setText(msg);
			
		// 3rd step (send message)
			Transport.send(message);
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
		
		
	}
	
	
}
