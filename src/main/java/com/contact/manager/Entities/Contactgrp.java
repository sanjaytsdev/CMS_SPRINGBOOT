package com.contact.manager.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cgroup")
public class Contactgrp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cgrpid;

    @Column(name = "gname")
    private String gname;

    @Column(name = "descr")
    private String descr;

    public Long getCgrpid() {
        return cgrpid;
    }
    public void setCgrpid(Long cgrpid) {
        this.cgrpid = cgrpid;
    }
    public String getGname() {
        return gname;
    }
    public void setGname(String gname) {
        this.gname = gname;
    }
    public String getDescr() {
        return descr;
    }
    public void setDescr(String descr) {
        this.descr = descr;
    }


}
