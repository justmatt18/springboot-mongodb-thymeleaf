package com.app.contact.thymeleafmaster.controller;


import com.app.contact.thymeleafmaster.enums.ContactGroup;
import com.app.contact.thymeleafmaster.enums.ContactStatus;
import com.app.contact.thymeleafmaster.form.ContactCreateForm;
import com.app.contact.thymeleafmaster.form.ContactUpdateForm;
import com.app.contact.thymeleafmaster.model.Contact;
import com.app.contact.thymeleafmaster.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/contacts")
public class ContactApi {


    private final ContactService contactService;

    public ContactApi(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/list")
    public List<Contact> list() {
        return contactService.list();
    }

    @GetMapping("/{id}")
    public Optional<Contact> getSingleContact(@PathVariable String id) {
        return contactService.getSingleContact(id);
    }

    @PostMapping("/new")
    public Contact newContact(@RequestBody @Valid ContactCreateForm form) {
        return contactService.newContact(new Contact(form.getName(), form.getNumber(), ContactGroup.UNKNOWN, ContactStatus.ACTIVE));
    }

    @PutMapping("/edit/{id}")
    public Contact ContactupdateContact(@PathVariable String id, @RequestBody @Valid ContactUpdateForm form) {
        return contactService.updateContact(id, new Contact(form.getName(), form.getNumber(), form.getContactGroup(), form.getContactStatus()));
    }

    @DeleteMapping("/{id}")
    public List<Contact> deleteContact(@PathVariable String id) {
        contactService.deleteContact(id);
        return contactService.list();
    }

    @GetMapping("/status/{status}")
    public List<Contact> listByStatus(@PathVariable String status) {
//        String stat = status.toUpperCase();
        return contactService.findByStatus(status.toUpperCase());
    }

    @GetMapping("/group/{group}")
    public List<Contact> listByGroup(@PathVariable String group) {
        return contactService.findByGroup(group.toUpperCase());
    }

}
