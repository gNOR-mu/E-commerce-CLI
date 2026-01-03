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
}
