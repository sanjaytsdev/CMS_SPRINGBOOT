package com.contact.manager.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.contact.manager.Entities.Contact;
import com.contact.manager.Services.ContactService;

@RestController
public class ContactController {

    @Autowired
    private ContactService cs;

    @GetMapping("/contacts")
    public List<Contact> getContacts() {
        return cs.getContacts();
    }

    @GetMapping("contacts/{cid}")
    public Contact getContactById(@PathVariable Long cid) {
        return cs.getContactById(cid);
    }

    @PostMapping("/contact/create")
    public Contact craeteContact(@RequestBody Contact c) {
        return cs.createContact(c);
    }

    @PutMapping("/contact/update/{cid}")
    public Contact updateContact(@PathVariable Long cid, @RequestBody Contact c) {
        return cs.updateContact(cid, c);
    }

    @DeleteMapping("/contact/delete/{cid}")
    public String deleteContact(@PathVariable Long cid) {
        return cs.deleteContact(cid);
    }

}
