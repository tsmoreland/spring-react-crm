package com.tsmoreland.misc.crm.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoLoader implements CommandLineRunner {
    private final ContactRepository contactRepository;

    @Autowired
    public DemoLoader(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public void run(String... args) {
        this.contactRepository.save(new Contact("Bruce", "Wayne", "bwayne@waynetech.com"));
        this.contactRepository.save(new Contact("Clark", "Kent", "ckent@dailyplanet.com"));
        this.contactRepository.save(new Contact("Diana", "Prince", "dprince@louvre.com"));
        this.contactRepository.save(new Contact("Barry", "Allen", "ballen@centralcitypd.com"));
    }
}
