package com.tsmoreland.misc.crm.model;

import org.h2.command.Command;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoLoader implements CommandLineRunner {
    private final ContactRepository repository;

    @Autowired
    public DemoLoader(ContactRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.repository.save(new Contact("Bruce", "Wayne", "bwayne@waynetech.com"));
        this.repository.save(new Contact("Clark", "Kent", "ckent@dailyplanet.com"));
        this.repository.save(new Contact("Diana", "Prince", "dprince@louvre.com"));
        this.repository.save(new Contact("Barry", "Allen", "ballen@centralcitypd.com"));
    }
}
