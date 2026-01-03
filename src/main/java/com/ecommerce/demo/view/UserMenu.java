package com.ecommerce.demo.view;

import java.util.Scanner;

public class UserMenu implements Menu{
    //TODO Definir servicios a utilizar
    private final Scanner scanner;

    public UserMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void show() {
        System.out.println("User menu");
    }
}
