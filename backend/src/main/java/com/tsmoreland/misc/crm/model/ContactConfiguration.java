package com.tsmoreland.misc.crm.model;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages =  "com.tsmoreland.misc.crm.model")
public class ContactConfiguration {
}
