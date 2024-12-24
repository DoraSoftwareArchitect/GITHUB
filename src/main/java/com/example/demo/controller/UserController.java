package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

// Controller + Response Body is called rest controller.
// Here Response Body if we declare above the class then it will applicable to the all methods available inside the class .
// If we written particularly in the method then we can say that it is only applicable to that method only.
@Controller

public class UserController {

	// Spring boot will provide the implementation.

	@Autowired // Injecting happened here.
	private JavaMailSender mailSender;

	@GetMapping("/email")
	@ResponseBody
	public String sendEmail() throws MessagingException {

		/*
		 * SimpleMailMessage message = new SimpleMailMessage();
		 * message.setTo("dorasrivignesh@gmail.com");
		 * message.setSubject("Welcome to Ashok Sir JRTP class "); message.
		 * setText("This session is related to the email sending information from the spring boot application"
		 * );
		 * 
		 * mailSender.send(message);
		 */
//Mime email message sending we can able to send documents and emails and the html and css and the tags related to that field,
		// we can happily able to send the data .
		
		
		MimeMessage message=mailSender.createMimeMessage();
		
		MimeMessageHelper helper=new MimeMessageHelper(message);
		
		helper.setTo("dorasrivignesh@gmail.com");
		helper.setSubject("I am so happy that i have got job because of ashok sir");
		helper.setText("<h1>This is heading</h1>",true);
		// Here we can send the document also by the help of add attachement.
		
		mailSender.send(message);
		
		
		return "Email sent sucessfully through the help of MIME MESSAGE COMMUNICATING BY THE HEPL OF SPRING BOOT APPLICATION"; // Here it is direct response for that we are using @Response Body Annotation,

	}

}
