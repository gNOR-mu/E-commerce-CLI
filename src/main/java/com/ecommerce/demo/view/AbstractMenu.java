package com.ecommerce.demo.view;

import java.util.Scanner;

public abstract class AbstractMenu implements Menu {
    protected final Scanner scanner;

    public AbstractMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void show() {
        boolean running = true;
        while (running) {
            printMenuOptions();
            try {
                System.out.print("Ingrese una opción: ");
                int option = Integer.parseInt(scanner.nextLine());
                running = handleOption(option);

                //TODO catch de posibles errores como ingreso de letras, etc
            } catch (Exception e) {
                System.out.println("Algo ha salido mal");
                e.printStackTrace();
            }
        }
    }

    protected abstract void printMenuOptions();

    protected abstract boolean handleOption(int option);
}
