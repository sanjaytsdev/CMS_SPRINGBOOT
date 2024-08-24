package com.contact.manager.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.manager.Entities.Contact;
import com.contact.manager.Repository.ContactRepo;

@Service
public class ContactService {

    @Autowired
    private ContactRepo cr;

    public List<Contact> getContacts() {
        return cr.findAll();
    }

    public Contact getContactById(Long id) {
        return cr.findById(id).get();
    }

    public Contact createContact(Contact c) {
        return cr.save(c);
    }

    public Contact updateContact(Long id, Contact c) {
        Contact exist = cr.findById(id).get();
        exist.setCname(c.getCname());
        exist.setCph(c.getCph());
        exist.setCaddr(c.getCaddr());
        exist.setCpin(c.getCpin());
        return cr.save(exist);
    }

    public String deleteContact(Long id) {
        cr.findById(id).get();
        cr.deleteById(id);
        return "Contact Deleted Successfully";
    }

}
