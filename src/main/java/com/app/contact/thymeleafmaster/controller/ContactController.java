package com.app.contact.thymeleafmaster.controller;

import com.app.contact.thymeleafmaster.enums.ContactGroup;
import com.app.contact.thymeleafmaster.enums.ContactStatus;
import com.app.contact.thymeleafmaster.form.ContactUpdateForm;
import com.app.contact.thymeleafmaster.model.Contact;
import com.app.contact.thymeleafmaster.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ContactController {
    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }


    @GetMapping("/")
    public String list(Model model) {
        List<Contact> list = contactService.list();
        model.addAttribute("contacts", list);
        return "index";
    }

    @GetMapping("/edit/{id}")
    public String getSingleContact(@PathVariable String id, Model model) {
        Contact contact = contactService.getSingleContact(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Contact ID: " + id));
        model.addAttribute("contact", contact);
        return "edit";
    }

    @GetMapping("/new")
    public String create(Model model) {
        model.addAttribute("contact", new Contact());
        return "create";
    }

    @PostMapping("/newContact")
    public String createContact(Contact contact) {
        contactService.newContact(new Contact(contact.getName(), contact.getNumber(), ContactGroup.UNKNOWN, ContactStatus.ACTIVE));
        return "redirect:/";
    }

    @PostMapping("/update/{id}")
    public String updateContact(@PathVariable String id, ContactUpdateForm form) {
        contactService.updateContact(id, new Contact(form.getName(), form.getNumber(), form.getContactGroup(), form.getContactStatus()));
        return "redirect:/";
    }


    @GetMapping("/delete/{id}")
    public String deleteContact(@PathVariable String id) {
        contactService.deleteContact(id);
        return "redirect:/";
    }





}
