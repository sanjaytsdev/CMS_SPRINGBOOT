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

import com.contact.manager.Entities.Contactgrp;
import com.contact.manager.Services.ContactGrpService;

@RestController
public class ContactGrpController {

    @Autowired
    private ContactGrpService cgs;

    @GetMapping("/contactgrp")
    public List<Contactgrp> getContactGrp() {
        return cgs.getContactGrp();
    }

    @GetMapping("/contactgrp/{cgid}")
    public Contactgrp getContactGrpById(@PathVariable Long cgid) {
        return cgs.getContactGrpById(cgid);
    }

    @PostMapping("/contactgrp/create")
    public Contactgrp createContactGrp(@RequestBody Contactgrp cg) {
        return cgs.createContactGrp(cg);
    }

    @PutMapping("/contactgrp/update/{cgid}")
    public Contactgrp updateContactGrp(@PathVariable Long cgid, @RequestBody Contactgrp cg) {
        return cgs.updateContactGrp(cgid, cg);
    }

    @DeleteMapping("/contactgrp/delete/{cgid}")
    public String deleteContactGrp(@PathVariable Long cgid) {
        return cgs.deleteContactGrp(cgid);
    }

}
