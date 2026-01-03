package com.ecommerce.demo.view;

public class MenuRunner {
    public static void run(Menu menu){
        try{
            menu.show();
        }catch (Exception e){
            System.out.println("Error al cargar el menú");
            e.printStackTrace();
        }
    }
}
