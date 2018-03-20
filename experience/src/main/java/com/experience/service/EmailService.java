package com.experience.service;

import javax.mail.MessagingException;


import org.springframework.mail.SimpleMailMessage;

public interface EmailService {
	public void sendEmail(SimpleMailMessage email);
	public void sendEmailWithAttechment(String path,String email) throws MessagingException ;
	public void sendCustomerOrder(String path,String email) throws MessagingException ;
	public void sendSalesOrder(String path,String email) throws MessagingException ;
	public void sendEmailHtml(String mail,String email,String subject) throws MessagingException ;
	public void sendPDFAttachement(String path, String fileName, String email, String subject, String messageText) throws MessagingException ;
}
