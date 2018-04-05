package com.msa.customer.mailer.customermailer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class Mailer {

    @Autowired
    JavaMailSender javaMailSender;

    public void sendMail(String email) {

        System.out.println("Send email :" + email);

        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(email);
        mailMessage.setSubject("Registration");
        mailMessage.setText("Successfully Registered");
        javaMailSender.send(mailMessage);
    }
}
