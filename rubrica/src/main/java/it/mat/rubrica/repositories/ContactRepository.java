package it.mat.rubrica.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import it.mat.rubrica.domain.Contact;

public interface ContactRepository extends JpaRepository<Contact, UUID> {
    
}
