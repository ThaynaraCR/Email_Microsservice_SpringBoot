package com.example.microsservice.services;
import com.example.microsservice.models.EmailModel;
import com.example.microsservice.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    EmailRepository emailRepository;

    public static void sendEmail(EmailModel emailModel) {
    }
    
}
