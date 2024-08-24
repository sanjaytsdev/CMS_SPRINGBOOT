package com.contact.manager.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.manager.Entities.Contactgrp;
import com.contact.manager.Repository.ContactGrpRepo;

@Service
public class ContactGrpService {

    @Autowired
    private ContactGrpRepo cgr;

    public List<Contactgrp> getContactGrp() {
        return cgr.findAll();
    }

    public Contactgrp getContactGrpById(Long cgid) {
        return cgr.findById(cgid).get();
    }

    public Contactgrp createContactGrp( Contactgrp cg) {
        return cgr.save(cg);
    }

    public Contactgrp updateContactGrp(Long cgid, Contactgrp cg) {
        Contactgrp exist = cgr.findById(cgid).get();
        exist.setGname(cg.getGname());
        exist.setDescr(cg.getDescr());
        return cgr.save(exist);
    }

    public String deleteContactGrp(Long cgid) {
        cgr.findById(cgid).get();
        cgr.deleteById(cgid);
        return "Group Deleted Successfully";
    }
}
