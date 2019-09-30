package com.app.contact.thymeleafmaster.service;

import com.app.contact.thymeleafmaster.model.Contact;
import java.util.List;
import java.util.Optional;

public interface ContactService {
    List<Contact> list();

    Optional<Contact> getSingleContact(String id);

    Contact newContact(Contact contact);

    Contact updateContact(String id, Contact contact);

    void deleteContact(String id);

    List<Contact> findByStatus(String status);

    List<Contact> findByGroup(String group);
}
