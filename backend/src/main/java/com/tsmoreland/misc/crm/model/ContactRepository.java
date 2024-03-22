package com.tsmoreland.misc.crm.model;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//import org.springframework.stereotype.Repository;

public interface ContactRepository extends CrudRepository<Contact, Long> {

}
