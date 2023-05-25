package com.tsmoreland.misc.crm.model;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.Collection;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:3000")
class ContactController {
    private final ContactRepository contactRepository;

    @Autowired
    public ContactController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @GetMapping("/contacts")
    Collection<Contact> contacts() {
        return (Collection<Contact>) contactRepository.findAll();
    }

    @PostMapping("/contacts")
    ResponseEntity<Contact> addContact(@Valid @RequestBody Contact contact) throws URISyntaxException {
        Contact result = contactRepository.save(contact);
        return ResponseEntity.ok().body(result);
    }
}
