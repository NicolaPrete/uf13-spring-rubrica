package it.mat.rubrica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.mat.rubrica.domain.Contact;
import it.mat.rubrica.domain.ContactForm;
import it.mat.rubrica.repositories.ContactRepository;

@Service
public class ContactService {
    
    // dependency injection
    @Autowired
    private ContactRepository contactRepo;

    public Contact save(ContactForm contactForm){

        Contact c = mapContact(contactForm);
        return contactRepo.save(c);
    }

    private Contact mapContact(ContactForm form){

        Contact c = new Contact();
        c.setName(form.getName());
        c.setSurname(form.getSurname());
        c.setPhone(form.getPhone());
        c.setEmail(form.getEmail());

        return c;
    }

    public List<Contact> findAll(){
        return contactRepo.findAll();
    }
}
