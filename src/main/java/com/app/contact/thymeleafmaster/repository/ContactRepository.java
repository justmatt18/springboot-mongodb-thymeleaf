package com.app.contact.thymeleafmaster.repository;

import com.app.contact.thymeleafmaster.model.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends MongoRepository<Contact, String> {
    List<Contact> findByContactStatus(String status);

    List<Contact> findByContactGroup(String group);
}
