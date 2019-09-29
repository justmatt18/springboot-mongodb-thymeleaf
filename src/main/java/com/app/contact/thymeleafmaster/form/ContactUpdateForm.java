package com.app.contact.thymeleafmaster.form;

import com.app.contact.thymeleafmaster.enums.ContactGroup;
import com.app.contact.thymeleafmaster.enums.ContactStatus;

public class ContactUpdateForm {

    private String name;
    private String number;
    private ContactGroup contactGroup;
    private ContactStatus contactStatus;



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
