package com.ecommerce.demo;


import com.ecommerce.demo.view.MainMenu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DependencyContainer dependencyContainer = new DependencyContainer();
        Scanner scanner = new Scanner(System.in);
        MainMenu mainMenu = new MainMenu(dependencyContainer, scanner);
        mainMenu.show();
        scanner.close();
    }
}
