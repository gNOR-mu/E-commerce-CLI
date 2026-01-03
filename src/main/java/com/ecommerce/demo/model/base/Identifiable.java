package com.ecommerce.demo.model.base;

public interface Identifiable<ID> {
    ID getId();
    void setId(ID id);
}
