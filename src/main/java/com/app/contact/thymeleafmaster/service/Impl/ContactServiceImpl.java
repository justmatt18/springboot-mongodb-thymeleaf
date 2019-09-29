package com.app.contact.thymeleafmaster.service.Impl;


import com.app.contact.thymeleafmaster.model.Contact;
import com.app.contact.thymeleafmaster.repository.ContactRepository;
import com.app.contact.thymeleafmaster.service.ContactService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;

    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public List<Contact> list() {
        return contactRepository.findAll();
    }

    @Override
    public Optional<Contact> getSingleContact(String id) {
        return contactRepository.findById(id);
    }

    @Override
    public Contact newContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public Contact updateContact(String id, Contact contact) {
        contact.setId(id);
        return contactRepository.save(contact);
    }

    @Override
    public void deleteContact(String id) {
        contactRepository.deleteById(id);
    }

    @Override
    public List<Contact> findByStatus(String status) {
        return null;
    }

    @Override
    public List<Contact> findByGroup(String group) {
        return null;
    }
}
