package com.contact.manager.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cid;

    @ManyToOne
    @JoinColumn(name = "cgrpid", referencedColumnName = "cgrpid")
    private Contactgrp cg;

    public Contactgrp getCg() {
        return cg;
    }
    public void setCg(Contactgrp cg) {
        this.cg = cg;
    }
    @Column(name = "cname")
    private String cname;

    @Column(name = "cph")
    private String cph;

    @Column(name = "caddr")
    private String caddr;

    @Column(name = "cpin")
    private String cpin;

    public Long getCid() {
        return cid;
    }
    public void setCid(Long cid) {
        this.cid = cid;
    }
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public String getCph() {
        return cph;
    }
    public void setCph(String cph) {
        this.cph = cph;
    }
    public String getCaddr() {
        return caddr;
    }
    public void setCaddr(String caddr) {
        this.caddr = caddr;
    }
    public String getCpin() {
        return cpin;
    }
    public void setCpin(String cpin) {
        this.cpin = cpin;
    }

    

}
