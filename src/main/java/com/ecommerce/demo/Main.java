package com.ecommerce.demo;

import com.ecommerce.demo.view.AdminMenu;
import com.ecommerce.demo.view.MenuRunner;
import com.ecommerce.demo.view.UserMenu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DependencyContainer dependencyContainer = new DependencyContainer();
        Scanner scanner = new Scanner(System.in);
        int option = -1;
        boolean run = true;

        while (run) {
            showMenu();
            try {
                System.out.print("Ingrese una opción: ");
                option = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Opción inválida");
                scanner.nextLine();
            }
            switch (option) {
                case 0 -> run = false;
                case 1 -> MenuRunner.run(new AdminMenu(scanner));
                case 2 -> MenuRunner.run(new UserMenu(scanner));
                default -> System.out.println("Opción inválida");
            }


        }

        scanner.close();
    }

    public static void showMenu() {
        System.out.println("*** Menú principal ***\n" +
                "1) ADMIN\n" +
                "2) USUARIO\n" +
                "0) Salir\n"
        );
    }
}
