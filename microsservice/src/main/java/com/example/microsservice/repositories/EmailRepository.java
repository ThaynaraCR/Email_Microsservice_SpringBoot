package com.example.microsservice.repositories;
import com.example.microsservice.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
    
}
