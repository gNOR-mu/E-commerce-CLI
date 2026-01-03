package model;

import model.base.Identifiable;

public class Category implements Identifiable<Long> {
    private Long id;

    private String name;

    @Override
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
