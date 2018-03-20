package com.experience.serviceImpl;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.experience.service.EmailService;
@Service("emailService")
public class EmailServiceImpl implements EmailService {
	
	@Autowired
	private JavaMailSender mailSender;
	
	@Async
	public void sendEmail(SimpleMailMessage email) {
		mailSender.send(email);
	}
	

	public void sendEmailWithAttechment(String path,String email) throws MessagingException {
		MimeMessage mimemessage=mailSender.createMimeMessage();
		MimeMessageHelper mimeMessHelp=new MimeMessageHelper(mimemessage,true);
		mimeMessHelp.setTo(email);
		mimeMessHelp.setSubject("Your Roundwrap Quotation");
		mimeMessHelp.setText("Please find attached herewith your Roundwrap quotation for the requested items.");
		FileSystemResource filesystres=new FileSystemResource(new File(path));
		mimeMessHelp.addAttachment("Quotation-Slip.pdf", filesystres);
		mailSender.send(mimemessage);
	}


	public void sendCustomerOrder(String path, String email) throws MessagingException {
		// TODO Auto-generated method stub
		
	}


	public void sendSalesOrder(String path, String email) throws MessagingException {
		// TODO Auto-generated method stub
		
	}


	public void sendEmailHtml(String mail, String email, String subject) throws MessagingException {
		// TODO Auto-generated method stub
		
	}


	public void sendPDFAttachement(String path, String fileName, String email, String subject, String messageText)
			throws MessagingException {
		// TODO Auto-generated method stub
		
	}
	
	 
}
