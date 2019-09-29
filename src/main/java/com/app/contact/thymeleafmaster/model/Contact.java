package com.app.contact.thymeleafmaster.model;


import com.app.contact.thymeleafmaster.enums.ContactGroup;
import com.app.contact.thymeleafmaster.enums.ContactStatus;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("contacts")
public class Contact {

    @Id
    private String id;

    private String name;
    private String number;
    private ContactGroup contactGroup;
    private ContactStatus contactStatus;


    public Contact() {
        super();
    }

    public Contact(String name, String number, ContactGroup contactGroup, ContactStatus contactStatus) {
        this.name = name;
        this.number = number;
        this.contactGroup = contactGroup;
        this.contactStatus = contactStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ContactGroup getContactGroup() {
        return contactGroup;
    }

    public void setContactGroup(ContactGroup contactGroup) {
        this.contactGroup = contactGroup;
    }

    public ContactStatus getContactStatus() {
        return contactStatus;
    }

    public void setContactStatus(ContactStatus contactStatus) {
        this.contactStatus = contactStatus;
    }
}
