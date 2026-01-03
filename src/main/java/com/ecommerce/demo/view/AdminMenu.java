package com.ecommerce.demo.view;

import java.util.Scanner;

public class AdminMenu implements Menu{
    //TODO Definir servicios a utilizar
    private final Scanner scanner;

    public AdminMenu(Scanner scanner) {
        this.scanner = scanner;
    }
    @Override
    public void show() {
        System.out.println("Menu admin");
    }
}
