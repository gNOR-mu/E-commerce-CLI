package model;

import model.base.Identifiable;

public class Customer implements Identifiable<Long> {
    private Long id;

    private String name;
    private String rut;
    private String email;
    private String passHash;
    private String cellphone;

    @Override
    public Long getId() {
        return id;
    }
}
