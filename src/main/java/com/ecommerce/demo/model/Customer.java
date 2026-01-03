package com.ecommerce.demo.model;

import com.ecommerce.demo.model.base.Identifiable;

public class Customer implements Identifiable<Long> {
    private Long id;

    private String name;
    private String rut;
    private String email;
    private String passHash;
    private String cellphone;

    public Customer(String name, String rut, String email, String passHash, String cellphone) {
        this.name = name;
        this.rut = rut;
        this.email = email;
        this.passHash = passHash;
        this.cellphone = cellphone;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String rut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String email() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String passHash() {
        return passHash;
    }

    public void setPassHash(String passHash) {
        this.passHash = passHash;
    }

    public String cellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }
}
