package com.crm.crm.controller;


import com.crm.crm.model.Contact;
import com.crm.crm.model.ContactRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactsController {
    private ContactRepository contactRepository;

    public ContactsController(ContactRepository contactRepository){
        this.contactRepository = contactRepository;
    }
    @GetMapping("/contacts")
    Collection<Contact> contacts(){
        return (Collection<Contact>) contactRepository.findAll();
    }

    @PostMapping("/contacts")
    ResponseEntity<Contact> createContact(@Validated @RequestBody Contact contact){
        Contact result = contactRepository.save(contact);
        return ResponseEntity.ok().body(result);
    }

}
