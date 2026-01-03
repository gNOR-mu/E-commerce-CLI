package model;

import model.base.Identifiable;

public class Product implements Identifiable<Long> {
    private Long id;
    private Long categoryId;

    private int price;
    private String name;

    @Override
    public Long getId() {
        return id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
